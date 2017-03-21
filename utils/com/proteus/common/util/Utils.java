package com.proteus.common.util;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;

import com.google.common.base.Strings;
import com.google.common.base.Throwables;

public class Utils {
		
	public static interface Closure<R>{
		public R invoke();
	}
	
	public static interface fn1<R,P1>{
		public R invoke(P1 p1);
	}

	public static interface fn2<R,P1,P2>{
		public R invoke(P1 p1, P2 p2);
	}
	
	public static interface fn3<R,P1,P2,P3>{
		public R invoke(P1 p1, P2 p2, P3 p3);
	}
	
	public static interface fn4<R,P1,P2,P3,P4>{
		public R invoke(P1 p1, P2 p2, P3 p3, P4 p4);
	}
	
	public static interface fnv<R>{
        public R invoke(Object ... os);
    }
	
	public static int gcd(int x, int y){
		int a = x, b = y;
		if (y > x){
			a = y; b = x;
		}
		int r;
		while ((r = a % b) != 0){
			a = b; b = r;
		}
		return b;
	}
	
	private static final fn2<Integer,Integer,Integer> addFn =
			new fn2<Integer, Integer, Integer>() {
				@Override
				public Integer invoke(Integer p1, Integer p2) {
					return (p1==null?0:p1)+(p2==null?0:p2);
				}
			};	
	
	public static String extractStackTrace(Exception e){
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		pw.close();
		return sw.toString();
	}
	
	public static <E> Set<E> union(Set<E> a){ return a; }
	public static <E> Set<E> union(Set<E> a, Set<E> b){ LinkedHashSet<E> r = Utils.newLinkedHashSet(a); r.addAll(b); return r; }
	public static <E> Set<E> intersection(Set<E> a, Set<E> b){ HashSet<E> r = Utils.newHashSet(a); r.retainAll(b); return r; }
	public static <E> Set<E> difference(Set<E> a, Set<E> b){ HashSet<E> r = Utils.newHashSet(a); r.removeAll(b); return r; }
	
	public static <E> HashSet<E> union(HashSet<E> a, Set<E> b){ HashSet<E> r = Utils.newHashSet(a); r.addAll(b); return r; }
	public static <E> HashSet<E> difference(HashSet<E> a, Set<E> b){ HashSet<E> r = Utils.newHashSet(a); r.removeAll(b); return r; }
	public static <E> HashSet<E> intersection(HashSet<E> a, Set<E> b){ HashSet<E> r = Utils.newHashSet(a); r.retainAll(b); return r; }
	
	public static <E> LinkedHashSet<E> union(LinkedHashSet<E> a, Set<E> b){ LinkedHashSet<E> r = Utils.newLinkedHashSet(a); r.addAll(b); return r; }
	public static <E> LinkedHashSet<E> difference(LinkedHashSet<E> a, Set<E> b){ LinkedHashSet<E> r = Utils.newLinkedHashSet(a); r.removeAll(b); return r; }
	public static <E> LinkedHashSet<E> intersection(LinkedHashSet<E> a, Set<E> b){ LinkedHashSet<E> r = Utils.newLinkedHashSet(a); r.retainAll(b); return r; }
	
	public static <E> TreeSet<E> union(TreeSet<E> a, Set<E> b){ TreeSet<E> r = Utils.newTreeSet(a); r.addAll(b); return r; }
	public static <E> TreeSet<E> difference(TreeSet<E> a, Set<E> b){ TreeSet<E> r = Utils.newTreeSet(a); r.removeAll(b); return r; }
	public static <E> TreeSet<E> intersection(TreeSet<E> a, Set<E> b){ TreeSet<E> r = Utils.newTreeSet(a); r.retainAll(b); return r; }
	
	public static <K> Map<K,Integer> mergeMapsByAddition(Map<K,Integer> m1, Map<K,Integer> m2, Map<K,Integer> m){
		return mergeMaps(addFn, m1, m2, m);
	}
	
	public static <K,V,V1,V2> Map<K,V> mergeMaps(fn2<V,V1,V2> fn, Map<K,V1> m1, Map<K,V2> m2, Map<K,V> m){
		for (Entry<K,V1> e : m1.entrySet()){
			K key = e.getKey();
			V1 v1 = e.getValue();
			V2 v2 = m2.get(key);
			m.put(key, fn.invoke(v1,v2));
		}
		for (Entry<K,V2> e : m2.entrySet()){
			K key = e.getKey();
			V2 v2 = e.getValue();
			if (!m1.containsKey(key))
				m.put(key, fn.invoke(null,v2));
		}
		return m;
	}
	
	public static fn1<Integer,Integer> multFnClosure(final int k){
		return new fn1<Integer,Integer>() {
			@Override
			public Integer invoke(Integer p1) {
				return p1 * k;
			}
		};
	}
	
	public static <K,V,V1> Map<K,V1> updateValues(fn1<V1,V> f, Map<K,V> from, Map<K,V1> into){
		for (Entry<K,V> e : from.entrySet()){
			into.put(e.getKey(), f.invoke(e.getValue()));
		}
		return into;
	}
	
	public static <E extends Comparable<E>> E max(E...es){
		return Collections.max(Arrays.asList(es));
	}
	
	public static <E extends Comparable<E>> E min(E...es){
		return Collections.min(Arrays.asList(es));
	}
	
	public static <E> boolean isProperSubset(Set<E> big, Set<E> small){
		return((big.size() > small.size()) && big.containsAll(small));
	}
	
	public static <E> boolean isSubset(Set<E> big, Set<E> small){
		return big.containsAll(small);
	}
	
	public static List<File> listFilesRecursive(File parentDir){
		return listFilesRecursive(parentDir, new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return true;
			}
		});
	}
	
	/* Quick and dirty, not meant for heavy usage (with symlinks etc.) */
	public static List<File> listFilesRecursive(File parentDir, FileFilter filter){
		List<File> ret = new ArrayList<File>();
		listFilesRecursive(parentDir, filter, ret);
		return ret;
	}
	
	private static void listFilesRecursive(File parentDir, FileFilter filter, List<File> list){
		if (parentDir.isDirectory()){
			File[] files = parentDir.listFiles();
			for (File file : files){
				if (filter.accept(file))
					list.add(file);
				listFilesRecursive(file, filter, list);
			}
		}
	}
	
	public static List<String> getAllClassNamesInPackage(String directory){
		File packageDir = new File(directory);
		File[] commonJavaSrcs = packageDir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File arg0) {
				return arg0.isFile() && (!arg0.isHidden()) && arg0.getName().endsWith(".java");
			}
		});
		return Utils.map(new fn1<String, File>() {
			@Override
			public String invoke(File p1) {
				return p1.getName();
			}
		}, Arrays.asList(commonJavaSrcs));
	}
	
	
	
	public static void writeWorkbookToFile(File file, Workbook wb){
	    try {
            FileOutputStream fos = new FileOutputStream(file);
            try {
                wb.write(fos);
            } finally {
                fos.close();
            }
        } catch (IOException e) {
            throw Throwables.propagate(e);
        }
	}
	
	public static <R,P1> R reduce(fn2<R,R,P1> f, R init, Collection<? extends P1> p1s){
		R ret = init;
		for (P1 p1 : p1s){
			ret = f.invoke(ret, p1);
		}
		return ret;
	}
	
	public static <P1> List<P1> filter(fn1<Boolean,P1> f, Collection<? extends P1> p1s){
		List<P1> rs = newArrList();
		for (P1 p1 : p1s){
			if (f.invoke(p1))
				rs.add(p1);
		}
		return rs;
	}
	
	public static <P1> List<P1> filterNotNull(Collection<? extends P1> p1s){
		List<P1> rs = newArrList();
		for (P1 p1 : p1s){
			if (p1 != null)
				rs.add(p1);
		}
		return rs;
	}
	
	public static <R,P1> List<R> map(fn1<R,P1> f, Collection<? extends P1> p1s){
		List<R> rs = newArrList();
		for (P1 p1 : p1s){
			rs.add(f.invoke(p1));
		}
		return rs;
	}
	
	public static <E> Set<E> collToAbstractSet(final Collection<E> coll){
		return new AbstractSet<E>() {
			@Override
			public Iterator<E> iterator() {
				return coll.iterator();
			}
			@Override
			public int size() {
				return coll.size();
			}
		};
	}
	
	public static <P1> Integer sumInt(final fn1<Integer, P1> fn1, Collection<? extends P1> p1s){
		return Utils.reduce(new fn2<Integer, Integer, P1>(){
			@Override public Integer invoke(Integer sum, P1 p1) {return sum + fn1.invoke(p1).intValue();}},
			0, p1s);
	}

	public static <P1> Long sumLong(final fn1<Long, P1> fn1, Collection<? extends P1> p1s){
		return Utils.reduce(new fn2<Long, Long, P1>(){
			@Override public Long invoke(Long sum, P1 p1) {return sum + fn1.invoke(p1).longValue();}},
			0L, p1s);
	}
	
	public static <P1> Double sumDouble(final fn1<Double, P1> fn1, Collection<? extends P1> p1s){
		return Utils.reduce(new fn2<Double, Double, P1>(){
			@Override public Double invoke(Double sum, P1 p1) {return sum + fn1.invoke(p1).doubleValue();}},
			0D, p1s);
	}
	
	public static <P1> Float sumFloat(final fn1<Float, P1> fn1, Collection<? extends P1> p1s){
		return Utils.reduce(new fn2<Float, Float, P1>(){
			@Override public Float invoke(Float sum, P1 p1) {return sum + fn1.invoke(p1).floatValue();}},
			0F, p1s);
	}
	
	public static <R extends Comparable<R>, P1> R maxFrom(final fn1<R, P1> fn1, Collection<? extends P1> p1s){
		return Utils.reduce(new fn2<R,R,P1>(){
			@Override 
			public R invoke(R r1, P1 p1) { 
				R r2 = fn1.invoke(p1); 
				if(r1 == null) return r2;
				return (r2.compareTo(r1)>0) ? r2 : r1;
			}}
		, null, p1s);
	}
	
	public static <R extends Comparable<R>, P1> R minFrom(final fn1<R, P1> fn1, Collection<? extends P1> p1s){
		return Utils.reduce(new fn2<R,R,P1>(){
			@Override 
			public R invoke(R r1, P1 p1) { 
				R r2 = fn1.invoke(p1); 
				if(r1 == null) return r2;
				return (r2.compareTo(r1)<0) ? r2 : r1;
			}}
		, null, p1s);
	}
	
	public static <E extends Comparable<? super E>> boolean isSorted(Collection<E> coll){
		return isSorted(coll, new Comparator<E>() {
			@Override
			public int compare(E o1, E o2) {
				return o1.compareTo(o2);
			}
		});
	}
	
	public static <E> boolean isSorted(Collection<E> coll, Comparator<E> cmp){
		if (coll.size() <= 1)
			return true;
		Iterator<E> it = coll.iterator();
		E e1 = it.next();
		while(it.hasNext()){
			E e2 = it.next();
			if (cmp.compare(e1, e2) > 0){
				return false;
			}
			e1 = e2;
		}
		return true;
	}
	
	public static String join(String sep, Collection<?> things){
		if (things == null || things.size() == 0)
			return "";
		Iterator<?> itr = things.iterator();
		StringBuilder sb = new StringBuilder(String.valueOf(itr.next()));
		while(itr.hasNext()){
			sb.append(sep);
			sb.append(String.valueOf(itr.next()));
		}
		return sb.toString();
	}
	
	public static String join(String sep, Object...things){
		return join(sep, Arrays.asList(things));
	}
	
	/**
	 * Maintains same return convention as Collections.binarySearch
	 * ArrayList coz, u dont wanna do binarysearch on linkedlist
	 */
	public static <T> int highBinarySearch(ArrayList<? extends T> list, T key, Comparator<? super T> c){
		int low=0, high=list.size()-1, mid=-1;
		while(low <= high){
			mid = (low+high)/2;
			int cmp = c.compare(list.get(mid), key);
			if (cmp == 0){
				if ((mid == high) || (c.compare(list.get(mid+1), key) > 0)){
					return mid+1;
				}
				else {
					low=mid+1;
				}
			}
			else if (cmp < 0){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return -low-1;
	}
	
	public static <T extends Comparable<? super T>> int highBinarySearch(ArrayList<? extends T> list, T key){
		return highBinarySearch(list, key, new Comparator<T>() {
			@Override
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
		});
	}
	
	public static <E> ArrayList<E> arrList(E...es){
		ArrayList<E> l = newArrList(es.length);
		for (E e : es)
			l.add(e);
		return l;
	}
	
	public static <E> LinkedList<E> linkedList(E...es){
		LinkedList<E> l = newLinkedList();
		for (E e : es)
			l.add(e);
		return l;
	}
	
	public static <E> List<E> asList(E...es){
        return Arrays.asList(es);
    }
	
	public static <E> List<E> asListNonNull(E...es){
		List<E> l = new LinkedList<E>();
		for (E e : es)
			if(e != null)
				l.add(e);
		return l;
	}
	
	public static <K,V> HashMap<K,V> hashMap(Object ... os){
		if ((os.length % 2) != 0)
			throw new IllegalArgumentException("Can't construct map of odd elements");
		HashMap<K,V> e = newHashMap(os.length/2);
		HashMap<K,V> m = (HashMap<K,V>)mapOf(e, os);
		return m;
	}
	
	public static <K,V> LinkedHashMap<K,V> linkedHashMap(Object ... os){
		if ((os.length % 2) != 0)
			throw new IllegalArgumentException("Can't construct map of odd elements");
		LinkedHashMap<K,V> e = newLinkedHashMap(os.length/2);
		LinkedHashMap<K,V> m = (LinkedHashMap<K,V>)mapOf(e, os);
		return m;
	}
	
	public static <K,V> TreeMap<K,V> treeMap(Object ... os){
        if ((os.length % 2) != 0)
            throw new IllegalArgumentException("Can't construct map of odd elements");
        TreeMap<K,V> e = newTreeMap();
        TreeMap<K,V> m = (TreeMap<K,V>)mapOf(e, os);
        return m;
    }
	
	public static <E> HashSet<E> hashSet(E...es){
		HashSet<E> s = newHashSet(es.length);
		for (E e : es)
			s.add(e);
		return s;
	}
	
	public static <E> LinkedHashSet<E> linkedHashSet(E...es){
		LinkedHashSet<E> s = newLinkedHashSet(es.length);
		for (E e : es)
			s.add(e);
		return s;
	}
	
	@SuppressWarnings("unchecked")
	public static <K,V> Map<K,V> mapOf(Map<K,V> m, Object ... os){
		for (int i=0; i<os.length; i+=2){
			m.put((K)os[i], (V)os[i+1]);
		}
		return m;
	}
	
	@SuppressWarnings("unchecked")
	public static <K,V> List<Pair<K,V>> pairs(Object ... os){
		if ((os.length % 2) != 0)
			throw new IllegalArgumentException("Can't construct Pair List of odd elements");
		List<Pair<K, V>> ret = new ArrayList<Utils.Pair<K,V>>(os.length/2);
		for(int i=0; i< os.length/2; i++) ret.add((Pair<K, V>) new Pair<Object, Object>(os[2*i], os[2*i+1]));
		return ret;
	}
	
	public static <E> ArrayList<E> newArrList(){
		return new ArrayList<E>();
	}
	
	public static <E> ArrayList<E> newArrList(int size){
		return new ArrayList<E>(size);
	}
	
	public static <E> ArrayList<E> newArrList(Collection<? extends E> coll){
		return new ArrayList<E>(coll);
	}
	
	public static <E> LinkedList<E> newLinkedList(){
		return new LinkedList<E>();
	}
	
	public static <E> LinkedList<E> newLinkedList(Collection<? extends E> coll){
		return new LinkedList<E>(coll);
	}
	
	public static <E> HashSet<E> newHashSet(){
		return new HashSet<E>();
	}
	
	public static <E> HashSet<E> newHashSet(int size){
		return new HashSet<E>(size);
	}
	
	public static <E> HashSet<E> newHashSet(Collection<? extends E> coll){
		return new HashSet<E>(coll);
	}
	
	public static <E> HashSet<E> newUniqueHashSet(Collection<? extends E> coll, List<E> duplicates){
		HashSet<E> ret = new HashSet<E>();
		for(E e : coll){
			if(ret.contains(e))	duplicates.add(e);
			else ret.add(e);
		}
		return ret;
	}
	
	public static <E> LinkedHashSet<E> newLinkedHashSet(){
		return new LinkedHashSet<E>();
	}
	
	public static <E> LinkedHashSet<E> newLinkedHashSet(int size){
		return new LinkedHashSet<E>(size);
	}
	
	public static <E> LinkedHashSet<E> newLinkedHashSet(Collection<? extends E> coll){
		return new LinkedHashSet<E>(coll);
	}
	
	public static <E> TreeSet<E> newTreeSet(){
		return new TreeSet<E>();
	}
	
	public static <E> TreeSet<E> newTreeSet(Comparator<? super E> cmp){
		return new TreeSet<E>(cmp);
	}
	
	public static <E> TreeSet<E> newTreeSet(Collection<? extends E> coll){
		return new TreeSet<E>(coll);
	}
	
	public static <K,V> HashMap<K,V> newHashMap(){
		return new HashMap<K, V>();
	}
	
	public static <K,V> HashMap<K,V> newHashMap(int size){
		return new HashMap<K, V>(size);
	}
	
	public static <K,V> HashMap<K,V> newHashMap(Map<? extends K, ? extends V> m){
		return new HashMap<K, V>(m);
	}
	
	public static <K,V> LinkedHashMap<K,V> newLinkedHashMap(){
		return new LinkedHashMap<K, V>();
	}
	
	public static <K,V> LinkedHashMap<K,V> newLinkedHashMap(int size){
		return new LinkedHashMap<K, V>(size);
	}
	
	public static <K,V> LinkedHashMap<K,V> newLinkedHashMap(Map<? extends K, ? extends V> m){
		return new LinkedHashMap<K, V>(m);
	}
	
	public static <K,V> TreeMap<K,V> newTreeMap(){
		return new TreeMap<K, V>();
	}
	
	public static <K,V> TreeMap<K,V> newTreeMap(Comparator<? super K> cmp){
		return new TreeMap<K, V>(cmp);
	}
	
	public static <K,V> TreeMap<K,V> newTreeMap(Map<? extends K, ? extends V> m){
		return new TreeMap<K, V>(m);
	}
	
	public static double timeTo2DecimalPlaces(long startMillis, long endMillis){
		return ((long)(((endMillis - startMillis) / 1000.0) * 100)) / 100.0 ; 
	}
	
	public static boolean isPowerOf2(int k){
		return (k & (k-1)) == 0;
	}
	
    public static int nextPowerOf2(int n){
    	return (int)Math.pow(2,lg(n));
    }
	
	public static int rem(int n, int d){
		return (n % d);
	}
	
	public static long rem(long n, long d){
		return (n % d);
	}
	
	public static long rem(long n, int d){
		return (n % d);
	}
	
	public static int floor(int n, int d){
		return (n / d);
	}
	
	public static long floor(long n, long d){
		return (n / d);
	}
	
	public static long floor(long n, int d){
		return (n / d);
	}
	
	public static int ceil(int n, int d){
		return (n/d) + ((n%d==0) ? 0 : 1);
	}
	
	public static long ceil(long n, long d){
		return (n/d) + ((n%d==0) ? 0 : 1);
	}
	
	public static long ceil(long n, int d){
		return (n/d) + ((n%d==0) ? 0 : 1);
	}
	
	public static int lg(int b){
		return (int) Math.ceil(Math.log(b) / Math.log(2));
	}
	
	public static int lg(int num, int base){
		return (int) Math.ceil(Math.log(num) / Math.log(base));
	}
	
	public static int getNearestInteger(double d) {
		return (int) ((d - Math.floor(d)) > (Math.ceil(d) - d) ? Math.ceil(d) : Math.floor(d));
	}
	
	public static int getRoundedUpInteger(int dividend, int divisor) {
		return (int)Math.ceil((double)dividend/divisor);
	}
	
	public static int getRoundedDownInteger(int dividend, int divisor) {
		return (int)Math.floor((double)dividend/divisor);
	}
	
	// lg-non zero
	public static int lg_nz(int b){
		if(b == 0) return 0;
		int ret = (int) Math.ceil(Math.log(b) / Math.log(2));
		if(ret == 0){
			ret = 1;
		}
		return ret;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String summary(Object o){
		if (o instanceof Summarizable)
			return ((Summarizable) o).summary();
		else if (o instanceof Map)
			return summary((Map)o);
		else if (o instanceof Dictionary)
			return summary((Dictionary)o);
		else if (o instanceof Entry)
			return summaryOneEntry((Entry)o);
		else if (o instanceof Collection)
			return summary((Collection)o);
		else
			return String.valueOf(o);
	}
	
	public static <K,V> String summary(Map<K,V> m){
		return summary(",",m);
	}
	
	public static <K,V> String summary(Dictionary<K,V> d){
		return summary(",", d);
	}
	
	public static <K,V> String summary(String sep, Dictionary<K, V> d){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Enumeration<K> e = d.keys(); e.hasMoreElements();){
		    Object key = e.nextElement();    
			sb.append(summary(key)+":"+summary(d.get(key)));
			if(e.hasMoreElements())
				sb.append(sep);
		}
		sb.append("]");
		return sb.toString();
	}
	
	public static <K,V> String summary(String sep, Map<K,V> m){
		String s = "[";
		Iterator<Entry<K,V>> entries = m.entrySet().iterator();
		if (entries.hasNext()){
			s += summaryOneEntry(entries.next());
			while (entries.hasNext()){
				s += sep + summaryOneEntry(entries.next());
			}
		}
		s += "]";
		return s;
	}
	
	private static <K,V> String summaryOneEntry(Entry<K,V> e){
		return summary(e.getKey())+":"+summary(e.getValue());
	}
	
	public static <E> String summary(String sep, Collection<E> c){
		String s = "[";
		Iterator<E> entries = c.iterator();
		if (entries.hasNext()){
			s += summary(entries.next());
			while (entries.hasNext()){
				s += sep + summary(entries.next());
			}
		}
		s += "]";
		return s;
	}
	
	public static <E> String summary(Collection<E> c){
		return summary(",",c);
	}
	
	public static List<String> summaries(Object...os){
		return summaries(Arrays.asList(os));
	}
	
	public static List<String> summaries(Collection<?> os){
		return map(new fn1<String,Object>() {
							@Override
							public String invoke(Object p1) {
								return summary(p1);
							}
         			   }, os);
	}
	
    public static String indent(String indent, String orig){
        return indent(indent, Arrays.asList(orig.split("\n")));
    }
    
    public static String indent(String indent, List<String> orig){
        return Utils.join("\n"+indent, orig);
    }
	
	@EqualsAndHashCode
	@ToString
	@AllArgsConstructor
	public static class Pair<E1,E2> implements Summarizable,Serializable{
		private static final long serialVersionUID = 1L;
		private final E1 first;
		private final E2 second;
		public E1 first(){ return first; }
		public E2 second() { return second; }
		@Override
		public String summary() {
			return Utils.summary(getPair());
		}
		public Collection<?> getPair(){
			return Utils.linkedList(first,second);
		}
		public static <E1,E2> Pair<E1,E2> of(E1 e1, E2 e2){
			return new Pair<E1,E2>(e1,e2);
		}
	}
	
	@EqualsAndHashCode
    @ToString
    @AllArgsConstructor
    public static class Tuple3<E1,E2,E3> implements Summarizable,Serializable{
        private static final long serialVersionUID = 1L;
        private final E1 first;
        private final E2 second;
        private final E3 third;
        public E1 first(){ return first; }
        public E2 second() { return second; }
        public E3 third() { return third; }
        @Override
        public String summary() {
            return Utils.summary(getTuple());
        }
        public Collection<?> getTuple(){
            return Utils.linkedList(first,second,third);
        }
        public static <E1,E2,E3> Tuple3<E1,E2,E3> of(E1 e1, E2 e2, E3 e3){
            return new Tuple3<E1,E2,E3>(e1,e2,e3);
        }
    }
	
	@EqualsAndHashCode
    @ToString
    @AllArgsConstructor
    public static class Tuple4<E1,E2,E3,E4> implements Summarizable,Serializable{
        private static final long serialVersionUID = 1L;
        private final E1 first;
        private final E2 second;
        private final E3 third;
        private final E4 fourth;
        public E1 first(){ return first; }
        public E2 second() { return second; }
        public E3 third() { return third; }
        public E4 fourth() { return fourth; }
        @Override
        public String summary() {
            return Utils.summary(getTuple());
        }
        public Collection<?> getTuple(){
            return Utils.linkedList(first,second,third,fourth);
        }
        public static <E1,E2,E3,E4> Tuple4<E1,E2,E3,E4> of(E1 e1, E2 e2, E3 e3, E4 e4){
            return new Tuple4<E1,E2,E3,E4>(e1,e2,e3,e4);
        }
    }
	
	public static class TwoDArrayRowWiseMover implements Iterator<Pair<Integer,Integer>>{
		private final int startx, starty, nummoves, rows, cols;
		private int currx, curry, nummovesleft;
		
		public TwoDArrayRowWiseMover(Pair<Integer,Integer> start, int nummoves, int rows, int cols){
			this.currx = start.first(); this.curry = start.second();
			this.startx = currx; this.starty = curry;
			this.nummoves = nummoves; this.nummovesleft = nummoves;
			this.rows = rows; this.cols = cols;
		}
		
		@Override
		public Pair<Integer, Integer> next() {
			//assert((currx < rows) && (curry < cols));
			Pair<Integer,Integer> p = new Pair<Integer,Integer>(currx,curry);
			if ((++curry) == cols){
				curry=0; ++currx;
			}
			nummovesleft--;
			return p;
		}
		
		@Override public boolean hasNext() { return nummovesleft > 0; }

		@Override public void remove() { throw new UnsupportedOperationException("Not implemented"); }

		public Pair<Integer,Integer> finalPos(){
			int rowstomove = nummoves / cols;
			int colstomove = nummoves % cols;
			int endx = startx + rowstomove;
			int endy = starty + colstomove;
			if (endy >= cols){
				endx += 1;
				endy -= cols;
			}
			assert((endx < rows) && (endy < cols));
			return new Pair<Integer,Integer>(endx, endy);
		}
	}
	
	public static class CartesianProductor<K> implements Iterator<List<K>>, Iterable<List<K>>{
		private final List<List<K>> things;
		private final List<Integer> idxs;
		private boolean hasNext;
		
		public CartesianProductor(List<List<K>> things) {
			this.things  = things;
			this.idxs    = new ArrayList<Integer>(things.size());
			this.hasNext = true;
			for (int k=0; k<things.size(); k++){
				if (things.get(k).size() == 0)
					this.hasNext = false;
				idxs.add(0);
			}
		}
	
		private boolean incIdxs(){
			int currIdx = idxs.size()-1;	
			while (currIdx != -1){
				int idx = idxs.get(currIdx);
				if (idx == (things.get(currIdx).size() - 1)){
					if (currIdx == 0){
						return false;
					}
					else{
						idxs.set(currIdx,0);
						currIdx--;
					}
				}
				else{
					idxs.set(currIdx, idx+1);
					return true;
				}
			}
			return false;
		}
		
		@Override
		public List<K> next() {
			List<K> ls = new ArrayList<K>(things.size());
			for (int i=0; i<things.size(); i++){
				ls.add(things.get(i).get(idxs.get(i)));
			}
			hasNext = incIdxs();
			return ls;
		}
		
		@Override public boolean hasNext() { return hasNext; }

		@Override public void remove() { throw new UnsupportedOperationException("Not implemented"); }

        @Override
        public Iterator<List<K>> iterator() {
            return this;
        }
		
	}
	
	public static double roundup(double num, int numplaces){
		double p = Math.pow(10, numplaces);
		num = num * p;
		double q = Math.round(num);
		return q/p;
	}
	
	public static List<String> getGroups(String str,String delimiter){
		if (str == null) str="";
		List<String> ret = new ArrayList<String>();
		Scanner sc = new Scanner(str).useDelimiter(delimiter);
		while(sc.hasNext()){
			ret.add(sc.next());
		}
		return ret;
	}

	public static List<String> splitIntoStringList(String str, String regex){
        return Arrays.asList(str.split(regex));
    }
	
	public static List<Integer> splitIntoIntegerList(String str, String regex){
	    return Utils.map(new fn1<Integer,String>() {
            @Override
            public Integer invoke(String p1) {
                return Integer.parseInt(p1);
            }
        }, splitIntoStringList(str, regex));
	}
	
	public static Pair<String, String> splitInTwo(String input, String delimiter){
		List<String> op = getGroups(input, delimiter);
		if(op.size()<2){
			throw new IllegalArgumentException("String has less than 2 parts.");
		}
		return new Pair<String, String>(op.get(0), op.get(1));
	}
	
	public static Map<String,Method> extractAllGetters(Class<?> clazz){
		return extractAllGetters(clazz, new ArrayList<String>());
	}
	
	public static Map<String,Method> extractAllGetters(Class<?> clazz, List<String> ignoredFieldsList){
		Map<String,Method> m = Utils.newHashMap();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (!Modifier.isStatic(field.getModifiers()) && !ignoredFieldsList.contains(field.getName()) ) {
				String fname = field.getName();
				String mname = getterName(fname, field.getType());
				try {
					Method method = clazz.getMethod(mname);
					m.put(fname, method);
				} catch (Exception e){
					throw new RuntimeException(e);
				}
			}
		}
		return m;
	}
	
	
	public static String getterName(String fname, Class<?> type){
	    String prefix = "get";
	    if (type.equals(boolean.class)){
	        if (fname.startsWith("is")) return fname;
	        else prefix = "is";
	    }
		return prefix + fname.substring(0, 1).toUpperCase() + fname.substring(1);
	}
	
	public static String fieldNameFromGetter(String gettername){
		if( gettername.length()>3 && !gettername.substring(0, 3).equals("get")){
			throw new RuntimeException(gettername+" is not a valid getter");
		}
		String ret = gettername.substring(3);
		return ret.substring(0, 1).toLowerCase()+ret.substring(1);
	}
	
	public static String stripQuotes(String value){
		if ( value == null )
			return value;
		String[] quoteChars = {"\"","\'","`"};
		value = value.trim( );
		for(String quote:quoteChars){
			if ( value.startsWith( quote ) && value.endsWith( quote ) )
				value = value.substring( 1, value.length( ) - 1 );
		}
		return value;
	}
	
	private static final Set<String> defaultBeanMethodsToIgnore = Utils.hashSet("getClass");
	public static LinkedHashMap<String,Method> extractAllBeanMethods(Class<?> clazz){
		return extractAllBeanMethods(clazz, defaultBeanMethodsToIgnore);
	}
	
	public static LinkedHashMap<String,Method> extractAllBeanMethods(Class<?> clazz, Set<String> ignoredMethodList){
		LinkedHashMap<String,Method> m = Utils.newLinkedHashMap();
		Method[] methods = clazz.getMethods();
		for (Method method : methods){
			String methodName = method.getName();
			if (!ignoredMethodList.contains(methodName)
				&& (!Modifier.isStatic(method.getModifiers()))
				&& (method.getParameterTypes().length == 0)
				&& (methodName.startsWith("get") || methodName.startsWith("is"))){
				String bean = methodName.startsWith("get") ? methodName.substring(3)
						                                   : methodName.substring(2);
				bean = bean.substring(0,1).toLowerCase() + bean.substring(1);
				m.put(bean, method);
			}
		}
		return m;
	}
	
	public static Comparable<?> extractProperty(Object obj, Map<String,Method> gettersMap, String propName) {
		Method method = gettersMap.get(propName);
		Comparable<?> ret = null;
		try {
			ret = (Comparable<?>) method.invoke(obj);
		} catch (Exception e){
		    throw Throwables.propagate(e);
		}
		return ret;
	}
	
	public static double heapUsedPercent(){
		MemoryUsage mu = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
		return 100.0*((double)mu.getUsed())/((double)mu.getMax());
	}
	
	public static String memoryUsage(){
		MemoryUsage mu = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
		double maxMB = Utils.roundup(((double)mu.getMax()) / 1024 / 1024, 3);
		double usedMB = Utils.roundup(((double)mu.getUsed()) / 1024 / 1024, 3);
		double usedPer = Utils.roundup(100.0*((double)mu.getUsed())/((double)mu.getMax()), 3);
		return "Max:"+maxMB+"\tUsed:"+usedMB+"\t("+usedPer+"%)";
	}
	
	public static String memoryUsageAfterGC(){
		for (int i=0; i<10; i++)
			System.gc();
		return memoryUsage();
	}
	
	public static String getLogLevel(Logger l){
		ch.qos.logback.classic.Logger chl = (ch.qos.logback.classic.Logger)l;
		return chl.getLevel()==null ? "off" : chl.getLevel().levelStr.toLowerCase();
	}
	
	public static void setLogLevel(Logger l, String ll){
		ch.qos.logback.classic.Logger chl = (ch.qos.logback.classic.Logger)l;
		ll = ll.toLowerCase();
		if ("off".equalsIgnoreCase(ll))        chl.setLevel(Level.OFF);
		else if ("error".equalsIgnoreCase(ll)) chl.setLevel(Level.ERROR);
		else if ("warn".equalsIgnoreCase(ll))  chl.setLevel(Level.WARN);
		else if ("info".equalsIgnoreCase(ll))  chl.setLevel(Level.INFO);
		else if ("debug".equalsIgnoreCase(ll)) chl.setLevel(Level.DEBUG);
		else if ("trace".equalsIgnoreCase(ll)) chl.setLevel(Level.TRACE);
		else if ("all".equalsIgnoreCase(ll))   chl.setLevel(Level.ALL);
		else throw new RuntimeException("Invalid log level provided. Log level should be one of - off, error, warn, info, debug, trace, all");
	}
	
	public static void setRootLogLevel(String ll){
		setLogLevel(getRootLogger(), ll);
	}
	
	public static String getRootLogLevel(){
		ch.qos.logback.classic.Logger chl = (ch.qos.logback.classic.Logger)getRootLogger();
		return chl.getLevel().toString();
	}

	public static Logger getRootLogger(){
		return LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
	}
	
	public static String repeat(String str, int number){
		if(number<0){
			throw new IllegalArgumentException(str+" can't be repeated -ve number of times");
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<number;i++){
			sb.append(str);
		}
		return sb.toString();
	}

	public static boolean booleanOf(Object o){
		if (o instanceof Boolean) return (Boolean)o;
		else if (o instanceof String) return Boolean.parseBoolean((String)o);
		else throw new IllegalArgumentException("Can't make boolean of "+o);
	}
	
	public static int intOf(Object o){
		if (o instanceof Integer) return (Integer)o;
		else if (o instanceof String) return Integer.parseInt((String)o);
		else throw new IllegalArgumentException("Can't make integer of "+o);
	}
	
	public static long longOf(Object o){
		if (o instanceof Long) return (Long)o;
		else if (o instanceof String) return Long.parseLong((String)o);
		else throw new IllegalArgumentException("Can't make long of "+o);
	}
	
	public static double doubleOf(Object o){
		if (o instanceof Double) return (Double)o;
		else if (o instanceof String) return Double.parseDouble((String)o);
		else throw new IllegalArgumentException("Can't make double of "+o);
	}
	
	public static int scaleSysProcs(double factor){
		return scaleSysProcsDown(factor);
	}
	
	public static int scaleSysProcsUp(double factor){
		int nt = (int)Math.ceil((Runtime.getRuntime().availableProcessors() * factor));
		return (nt > 0) ? nt : 1;
	}
	
	public static int scaleSysProcsDown(double factor){
		int nt = (int)Math.floor((Runtime.getRuntime().availableProcessors() * factor));
		return (nt > 0) ? nt : 1;
	}
	
	public static Pair<String,String[]> extractArgAndRemoveFromArgs(String[] args, String arg){
		// Search for -arg val || --arg val
		String arg1 = "-"+arg, arg2 = "--"+arg;
		for (int k=0 ; k<args.length; k++){
			if (arg1.equals(args[k]) || arg2.equals(args[k])){
				String value = args[k+1];
				String[] nargs = new String[args.length-2];
				for (int i=0,j=0; i<args.length; i++)
					if ((i < k) || (i > (k+1)))
						nargs[j++] = args[i];
				return Pair.of(value, nargs);
			}
		}
		// Search for -arg=val || --arg=val
		Pattern p = Pattern.compile("^\\-?\\-"+arg+"=(.*)$");
		Matcher m = null;
		for (int k=0 ; k<args.length; k++){
			if ((m = p.matcher(args[k])).matches()){
				String value = m.group(1);
				String[] nargs = new String[args.length-1];
				for (int i=0,j=0; i<args.length; i++)
					if (i != k)
						nargs[j++] = args[i];
				return Pair.of(value, nargs);
			}
		}
		// Assume not present
		return Pair.of(null, args);
	}
	
	public static Map<String,String> poorMansArgsParser(String[] args, String[] opts){
		Map<String,String> ret = new HashMap<String,String>();
		for (int i=0; i<args.length; i++){
			for (String opt : opts){
				if (args[i].equals("--"+opt) || args[i].equals("-"+opt)){
					if ((i<args.length-1) && !args[i+1].startsWith("-")){
						ret.put(opt, args[i+1]);
						i++;
					} else {
						ret.put(opt, null);
					}
				}
			}
		}
		return ret;
	}
	
    public static final class RunInSameThreadExecutor extends AbstractExecutorService implements ExecutorService{
        @Override public void execute(Runnable command) { command.run(); }
        @Override public boolean awaitTermination(long timeout, TimeUnit unit) { return true; }
        @Override public boolean isShutdown() { return false; }
        @Override public boolean isTerminated() { return false; }
        @Override public void shutdown() {}
        @Override public List<Runnable> shutdownNow() { return null; }
    }
	
    public static String simpleDigest(String input){
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return "null";
        }
        md.update(input.getBytes());
        byte[] digest = md.digest();
        char[] output = new char[8];
        for (int i=0; i<output.length; i++){
            output[i] = (char)digest[i % digest.length];
            output[i] = (char) ('A'+ (output[i]%26));
        }
        return new String(output);
    }
    
    public static String getRootCauseUserDisplayString(Throwable t){
        Throwable rootCause = Throwables.getRootCause(t);
        String msg = rootCause.getMessage();
        if (!Strings.isNullOrEmpty(msg)) return msg;
        msg = t.getMessage();
        if (!Strings.isNullOrEmpty(msg)) return msg;
        else return t.getClass().getName();
    }
    
    public static String removeEndLineFeedIfAny(String line){
        int len = line.length();
        if (len > 0){
            int remove=0;
            char last = line.charAt(len-1);
            if (last == '\n'){
                if (len > 1){
                    char secondlast = line.charAt(len-2);
                    remove = (secondlast == '\r') ? 2 : 1;
                } else {
                    remove = 1;
                }
            }
            else if (last == '\r'){
                remove = 1;
            }
            if (remove > 0)
                line = line.substring(0, len-remove);
        }
        return line;
    }
    
    public static String getHash(String input, String instance) {
    	try {
    		final MessageDigest md = MessageDigest.getInstance(instance);
    		md.reset();
    		md.update(input.getBytes(Charset.forName("UTF-8")));
    		byte[] resultbytes = md.digest();
    		StringBuffer sb = new StringBuffer();
    		for (int i = 0; i < resultbytes.length; ++i) {
    			sb.append(Integer.toHexString((resultbytes[i] & 0xFF) | 0x100).substring(1,3));
    		}
    		return sb.toString();
    	} catch (Exception ee) {
    		System.err.println("Error computing "+instance+" Hash");
    	}
    	return "";
    }
    
    public static String md5Hash(String input) {
    	return getHash(input, "MD5");
    }
    
    public static String SHA512(String input) {
    	return getHash(input, "SHA-512");
    }
    
    public static String SHA256(String input) {
    	return getHash(input, "SHA-256");
    }

    private static Logger mainLogger = null;
    private static Logger dummyLogger = LoggerFactory.getLogger(Utils.class);;
	public static void setMainLogger(Logger L) {
		mainLogger = L;		
	}
	public static Logger getMainLogger(){
		if(mainLogger == null) return dummyLogger;
		return mainLogger;
	}

	public static String capitalizeFirst(String value){
		return value.substring(0, 1).toUpperCase()+(value.length()>1?value.substring(1):"");
	}

	public static String now(String format) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(cal.getTime());		
	}

	/**
	 * This method is only for Hamming ECC calculation for SEC DED	 
	 */
	public static Integer EccBits(int i) {
		if(i <= 0) throw new RuntimeException("Cant calculate ecc bits for non positive values. -- " + i);
		if(i <= 4) return 4;
		int ecc = lg(i);
		int pot = nextPowerOf2(i);
		if(i + ecc >= pot) ecc++;
		return ecc + 1 ;	//FOR DED
	}

	/**
	 * Double error correct.
	 */
	public static int DecEccBits(int i) {
		return i + EccBits(i);
	}

	public static boolean tryParseInt(String s) {
		try{  
			Integer.parseInt(s);  
	        return true;  
	   } catch(NumberFormatException e){
		   return false;
	   }
	}


}
