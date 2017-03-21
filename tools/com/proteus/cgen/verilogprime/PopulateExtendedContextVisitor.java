package com.proteus.cgen.verilogprime;

import org.antlr.v4.runtime.ParserRuleContext;

import com.proteus.cgen.verilogprime.ext.*;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParserBaseVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.*;


public class PopulateExtendedContextVisitor extends VerilogPrimeParserBaseVisitor<ParserRuleContext> {

	//	public ParserRuleContext init(ParseTree ctx){
	//		visit(ctx);
	//		for(int i=0;i<ctx.getChildCount();i++){
	//			ParseTree child = ctx.getChild(i);
	//			if(!(child instanceof TerminalNode)){
	//				init(child);
	//			}
	//		}
	//		return (ParserRuleContext) ctx;
	//	}
	@Override public org.antlr.v4.runtime.ParserRuleContext visitMediumstr(MediumstrContext ctx){
		super.visitMediumstr(ctx);
		ctx.extendedContext = new MediumstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSmallstr(SmallstrContext ctx){
		super.visitSmallstr(ctx);
		ctx.extendedContext = new SmallstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLargestr(LargestrContext ctx){
		super.visitLargestr(ctx);
		ctx.extendedContext = new LargestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitReal_number(Real_numberContext ctx){
		super.visitReal_number(ctx);
		ctx.extendedContext = new Real_numberContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOnestepstr(OnestepstrContext ctx){
		super.visitOnestepstr(ctx);
		ctx.extendedContext = new OnestepstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPathpulsedollar(PathpulsedollarContext ctx){
		super.visitPathpulsedollar(ctx);
		ctx.extendedContext = new PathpulsedollarContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollar(DollarContext ctx){
		super.visitDollar(ctx);
		ctx.extendedContext = new DollarContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTaskstr(TaskstrContext ctx){
		super.visitTaskstr(ctx);
		ctx.extendedContext = new TaskstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDpi_spec_ing2str(Dpi_spec_ing2strContext ctx){
		super.visitDpi_spec_ing2str(ctx);
		ctx.extendedContext = new Dpi_spec_ing2strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDpi_spec_ing1str(Dpi_spec_ing1strContext ctx){
		super.visitDpi_spec_ing1str(ctx);
		ctx.extendedContext = new Dpi_spec_ing1strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitContextstr(ContextstrContext ctx){
		super.visitContextstr(ctx);
		ctx.extendedContext = new ContextstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndtaskstr(EndtaskstrContext ctx){
		super.visitEndtaskstr(ctx);
		ctx.extendedContext = new EndtaskstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPlus(PlusContext ctx){
		super.visitPlus(ctx);
		ctx.extendedContext = new PlusContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMinus(MinusContext ctx){
		super.visitMinus(ctx);
		ctx.extendedContext = new MinusContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStarstar(StarstarContext ctx){
		super.visitStarstar(ctx);
		ctx.extendedContext = new StarstarContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModulo(ModuloContext ctx){
		super.visitModulo(ctx);
		ctx.extendedContext = new ModuloContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEquals(EqualsContext ctx){
		super.visitEquals(ctx);
		ctx.extendedContext = new EqualsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNot_equals(Not_equalsContext ctx){
		super.visitNot_equals(ctx);
		ctx.extendedContext = new Not_equalsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLt(LtContext ctx){
		super.visitLt(ctx);
		ctx.extendedContext = new LtContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLe(LeContext ctx){
		super.visitLe(ctx);
		ctx.extendedContext = new LeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGt(GtContext ctx){
		super.visitGt(ctx);
		ctx.extendedContext = new GtContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGe(GeContext ctx){
		super.visitGe(ctx);
		ctx.extendedContext = new GeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModportstr(ModportstrContext ctx){
		super.visitModportstr(ctx);
		ctx.extendedContext = new ModportstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssertstr(AssertstrContext ctx){
		super.visitAssertstr(ctx);
		ctx.extendedContext = new AssertstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPropertystr(PropertystrContext ctx){
		super.visitPropertystr(ctx);
		ctx.extendedContext = new PropertystrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssumestr(AssumestrContext ctx){
		super.visitAssumestr(ctx);
		ctx.extendedContext = new AssumestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCoverstr(CoverstrContext ctx){
		super.visitCoverstr(ctx);
		ctx.extendedContext = new CoverstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpectstr(ExpectstrContext ctx){
		super.visitExpectstr(ctx);
		ctx.extendedContext = new ExpectstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequencestr(SequencestrContext ctx){
		super.visitSequencestr(ctx);
		ctx.extendedContext = new SequencestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRestrictstr(RestrictstrContext ctx){
		super.visitRestrictstr(ctx);
		ctx.extendedContext = new RestrictstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndpropertystr(EndpropertystrContext ctx){
		super.visitEndpropertystr(ctx);
		ctx.extendedContext = new EndpropertystrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCasestr(CasestrContext ctx){
		super.visitCasestr(ctx);
		ctx.extendedContext = new CasestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndcasestr(EndcasestrContext ctx){
		super.visitEndcasestr(ctx);
		ctx.extendedContext = new EndcasestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNotstr(NotstrContext ctx){
		super.visitNotstr(ctx);
		ctx.extendedContext = new NotstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOrstr(OrstrContext ctx){
		super.visitOrstr(ctx);
		ctx.extendedContext = new OrstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAndstr(AndstrContext ctx){
		super.visitAndstr(ctx);
		ctx.extendedContext = new AndstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOrderive(OrderiveContext ctx){
		super.visitOrderive(ctx);
		ctx.extendedContext = new OrderiveContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOrimplies(OrimpliesContext ctx){
		super.visitOrimplies(ctx);
		ctx.extendedContext = new OrimpliesContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndsequencestr(EndsequencestrContext ctx){
		super.visitEndsequencestr(ctx);
		ctx.extendedContext = new EndsequencestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUntypedstr(UntypedstrContext ctx){
		super.visitUntypedstr(ctx);
		ctx.extendedContext = new UntypedstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIntersectstr(IntersectstrContext ctx){
		super.visitIntersectstr(ctx);
		ctx.extendedContext = new IntersectstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFirst_matchstr(First_matchstrContext ctx){
		super.visitFirst_matchstr(ctx);
		ctx.extendedContext = new First_matchstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitThroughoutstr(ThroughoutstrContext ctx){
		super.visitThroughoutstr(ctx);
		ctx.extendedContext = new ThroughoutstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWithinstr(WithinstrContext ctx){
		super.visitWithinstr(ctx);
		ctx.extendedContext = new WithinstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDouble_hash(Double_hashContext ctx){
		super.visitDouble_hash(ctx);
		ctx.extendedContext = new Double_hashContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDiststr(DiststrContext ctx){
		super.visitDiststr(ctx);
		ctx.extendedContext = new DiststrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLetstr(LetstrContext ctx){
		super.visitLetstr(ctx);
		ctx.extendedContext = new LetstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCovergroupstr(CovergroupstrContext ctx){
		super.visitCovergroupstr(ctx);
		ctx.extendedContext = new CovergroupstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndgroupstr(EndgroupstrContext ctx){
		super.visitEndgroupstr(ctx);
		ctx.extendedContext = new EndgroupstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOptiondot(OptiondotContext ctx){
		super.visitOptiondot(ctx);
		ctx.extendedContext = new OptiondotContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitType_optiondot(Type_optiondotContext ctx){
		super.visitType_optiondot(ctx);
		ctx.extendedContext = new Type_optiondotContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWithstr(WithstrContext ctx){
		super.visitWithstr(ctx);
		ctx.extendedContext = new WithstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSamplestr(SamplestrContext ctx){
		super.visitSamplestr(ctx);
		ctx.extendedContext = new SamplestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAttheratelparen(AttheratelparenContext ctx){
		super.visitAttheratelparen(ctx);
		ctx.extendedContext = new AttheratelparenContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBeginstr(BeginstrContext ctx){
		super.visitBeginstr(ctx);
		ctx.extendedContext = new BeginstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndstr(EndstrContext ctx){
		super.visitEndstr(ctx);
		ctx.extendedContext = new EndstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCoverpointstr(CoverpointstrContext ctx){
		super.visitCoverpointstr(ctx);
		ctx.extendedContext = new CoverpointstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWildcardstr(WildcardstrContext ctx){
		super.visitWildcardstr(ctx);
		ctx.extendedContext = new WildcardstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBinsstr(BinsstrContext ctx){
		super.visitBinsstr(ctx);
		ctx.extendedContext = new BinsstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIllegal_binsstr(Illegal_binsstrContext ctx){
		super.visitIllegal_binsstr(ctx);
		ctx.extendedContext = new Illegal_binsstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIgnore_binsstr(Ignore_binsstrContext ctx){
		super.visitIgnore_binsstr(ctx);
		ctx.extendedContext = new Ignore_binsstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitImplies(ImpliesContext ctx){
		super.visitImplies(ctx);
		ctx.extendedContext = new ImpliesContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCrossstr(CrossstrContext ctx){
		super.visitCrossstr(ctx);
		ctx.extendedContext = new CrossstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNot(NotContext ctx){
		super.visitNot(ctx);
		ctx.extendedContext = new NotContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLog_and(Log_andContext ctx){
		super.visitLog_and(ctx);
		ctx.extendedContext = new Log_andContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLog_or(Log_orContext ctx){
		super.visitLog_or(ctx);
		ctx.extendedContext = new Log_orContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBinsofstr(BinsofstrContext ctx){
		super.visitBinsofstr(ctx);
		ctx.extendedContext = new BinsofstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPulldownstr(PulldownstrContext ctx){
		super.visitPulldownstr(ctx);
		ctx.extendedContext = new PulldownstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPullupstr(PullupstrContext ctx){
		super.visitPullupstr(ctx);
		ctx.extendedContext = new PullupstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCmosstr(CmosstrContext ctx){
		super.visitCmosstr(ctx);
		ctx.extendedContext = new CmosstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRcmosstr(RcmosstrContext ctx){
		super.visitRcmosstr(ctx);
		ctx.extendedContext = new RcmosstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBufif0str(Bufif0strContext ctx){
		super.visitBufif0str(ctx);
		ctx.extendedContext = new Bufif0strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBufif1str(Bufif1strContext ctx){
		super.visitBufif1str(ctx);
		ctx.extendedContext = new Bufif1strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNotif0str(Notif0strContext ctx){
		super.visitNotif0str(ctx);
		ctx.extendedContext = new Notif0strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNotif1str(Notif1strContext ctx){
		super.visitNotif1str(ctx);
		ctx.extendedContext = new Notif1strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNmosstr(NmosstrContext ctx){
		super.visitNmosstr(ctx);
		ctx.extendedContext = new NmosstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPmos(PmosContext ctx){
		super.visitPmos(ctx);
		ctx.extendedContext = new PmosContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRnmosstr(RnmosstrContext ctx){
		super.visitRnmosstr(ctx);
		ctx.extendedContext = new RnmosstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRpmosstr(RpmosstrContext ctx){
		super.visitRpmosstr(ctx);
		ctx.extendedContext = new RpmosstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNandstr(NandstrContext ctx){
		super.visitNandstr(ctx);
		ctx.extendedContext = new NandstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNorstr(NorstrContext ctx){
		super.visitNorstr(ctx);
		ctx.extendedContext = new NorstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitXorstrstr(XorstrstrContext ctx){
		super.visitXorstrstr(ctx);
		ctx.extendedContext = new XorstrstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitXnorstr(XnorstrContext ctx){
		super.visitXnorstr(ctx);
		ctx.extendedContext = new XnorstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBufstr(BufstrContext ctx){
		super.visitBufstr(ctx);
		ctx.extendedContext = new BufstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTranif0str(Tranif0strContext ctx){
		super.visitTranif0str(ctx);
		ctx.extendedContext = new Tranif0strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTranif1str(Tranif1strContext ctx){
		super.visitTranif1str(ctx);
		ctx.extendedContext = new Tranif1strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRtranif1str(Rtranif1strContext ctx){
		super.visitRtranif1str(ctx);
		ctx.extendedContext = new Rtranif1strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRtranif0str(Rtranif0strContext ctx){
		super.visitRtranif0str(ctx);
		ctx.extendedContext = new Rtranif0strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTranstr(TranstrContext ctx){
		super.visitTranstr(ctx);
		ctx.extendedContext = new TranstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRtranstr(RtranstrContext ctx){
		super.visitRtranstr(ctx);
		ctx.extendedContext = new RtranstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGeneratestr(GeneratestrContext ctx){
		super.visitGeneratestr(ctx);
		ctx.extendedContext = new GeneratestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndgeneratestr(EndgeneratestrContext ctx){
		super.visitEndgeneratestr(ctx);
		ctx.extendedContext = new EndgeneratestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitForstr(ForstrContext ctx){
		super.visitForstr(ctx);
		ctx.extendedContext = new ForstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPrimitivestr(PrimitivestrContext ctx){
		super.visitPrimitivestr(ctx);
		ctx.extendedContext = new PrimitivestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndprimitivestr(EndprimitivestrContext ctx){
		super.visitEndprimitivestr(ctx);
		ctx.extendedContext = new EndprimitivestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTablestr(TablestrContext ctx){
		super.visitTablestr(ctx);
		ctx.extendedContext = new TablestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndtablestr(EndtablestrContext ctx){
		super.visitEndtablestr(ctx);
		ctx.extendedContext = new EndtablestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInitialstr(InitialstrContext ctx){
		super.visitInitialstr(ctx);
		ctx.extendedContext = new InitialstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBinary_number(Binary_numberContext ctx){
		super.visitBinary_number(ctx);
		ctx.extendedContext = new Binary_numberContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitQuestinmark(QuestinmarkContext ctx){
		super.visitQuestinmark(ctx);
		ctx.extendedContext = new QuestinmarkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitId(IdContext ctx){
		super.visitId(ctx);
		ctx.extendedContext = new IdContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssignstrstr(AssignstrstrContext ctx){
		super.visitAssignstrstr(ctx);
		ctx.extendedContext = new AssignstrstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAliasstr(AliasstrContext ctx){
		super.visitAliasstr(ctx);
		ctx.extendedContext = new AliasstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAlways_combstr(Always_combstrContext ctx){
		super.visitAlways_combstr(ctx);
		ctx.extendedContext = new Always_combstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAlways_latchstr(Always_latchstrContext ctx){
		super.visitAlways_latchstr(ctx);
		ctx.extendedContext = new Always_latchstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAlways_ffstr(Always_ffstrContext ctx){
		super.visitAlways_ffstr(ctx);
		ctx.extendedContext = new Always_ffstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFinalstr(FinalstrContext ctx){
		super.visitFinalstr(ctx);
		ctx.extendedContext = new FinalstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPlusequals(PlusequalsContext ctx){
		super.visitPlusequals(ctx);
		ctx.extendedContext = new PlusequalsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMinusequals(MinusequalsContext ctx){
		super.visitMinusequals(ctx);
		ctx.extendedContext = new MinusequalsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStartequals(StartequalsContext ctx){
		super.visitStartequals(ctx);
		ctx.extendedContext = new StartequalsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSlashequals(SlashequalsContext ctx){
		super.visitSlashequals(ctx);
		ctx.extendedContext = new SlashequalsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPercentileequal(PercentileequalContext ctx){
		super.visitPercentileequal(ctx);
		ctx.extendedContext = new PercentileequalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAndequals(AndequalsContext ctx){
		super.visitAndequals(ctx);
		ctx.extendedContext = new AndequalsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOrequal(OrequalContext ctx){
		super.visitOrequal(ctx);
		ctx.extendedContext = new OrequalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitXorequal(XorequalContext ctx){
		super.visitXorequal(ctx);
		ctx.extendedContext = new XorequalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLshift_assign(Lshift_assignContext ctx){
		super.visitLshift_assign(ctx);
		ctx.extendedContext = new Lshift_assignContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRshift_assign(Rshift_assignContext ctx){
		super.visitRshift_assign(ctx);
		ctx.extendedContext = new Rshift_assignContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnsigned_lshift_assign(Unsigned_lshift_assignContext ctx){
		super.visitUnsigned_lshift_assign(ctx);
		ctx.extendedContext = new Unsigned_lshift_assignContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnsigned_rshift_assign(Unsigned_rshift_assignContext ctx){
		super.visitUnsigned_rshift_assign(ctx);
		ctx.extendedContext = new Unsigned_rshift_assignContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDeassignstr(DeassignstrContext ctx){
		super.visitDeassignstr(ctx);
		ctx.extendedContext = new DeassignstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitForcestr(ForcestrContext ctx){
		super.visitForcestr(ctx);
		ctx.extendedContext = new ForcestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitReleasestr(ReleasestrContext ctx){
		super.visitReleasestr(ctx);
		ctx.extendedContext = new ReleasestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitForkstr(ForkstrContext ctx){
		super.visitForkstr(ctx);
		ctx.extendedContext = new ForkstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitJoinstr(JoinstrContext ctx){
		super.visitJoinstr(ctx);
		ctx.extendedContext = new JoinstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitJoin_anystr(Join_anystrContext ctx){
		super.visitJoin_anystr(ctx);
		ctx.extendedContext = new Join_anystrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitJoin_namestr(Join_namestrContext ctx){
		super.visitJoin_namestr(ctx);
		ctx.extendedContext = new Join_namestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRepeatstr(RepeatstrContext ctx){
		super.visitRepeatstr(ctx);
		ctx.extendedContext = new RepeatstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAttherate(AttherateContext ctx){
		super.visitAttherate(ctx);
		ctx.extendedContext = new AttherateContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAttheratestar(AttheratestarContext ctx){
		super.visitAttheratestar(ctx);
		ctx.extendedContext = new AttheratestarContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLparenstarrparen(LparenstarrparenContext ctx){
		super.visitLparenstarrparen(ctx);
		ctx.extendedContext = new LparenstarrparenContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitReturnstr(ReturnstrContext ctx){
		super.visitReturnstr(ctx);
		ctx.extendedContext = new ReturnstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBreakstr(BreakstrContext ctx){
		super.visitBreakstr(ctx);
		ctx.extendedContext = new BreakstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitContinuestr(ContinuestrContext ctx){
		super.visitContinuestr(ctx);
		ctx.extendedContext = new ContinuestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWaitstr(WaitstrContext ctx){
		super.visitWaitstr(ctx);
		ctx.extendedContext = new WaitstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWait_orderstr(Wait_orderstrContext ctx){
		super.visitWait_orderstr(ctx);
		ctx.extendedContext = new Wait_orderstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDerivegt(DerivegtContext ctx){
		super.visitDerivegt(ctx);
		ctx.extendedContext = new DerivegtContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUniquestr(UniquestrContext ctx){
		super.visitUniquestr(ctx);
		ctx.extendedContext = new UniquestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnique0str(Unique0strContext ctx){
		super.visitUnique0str(ctx);
		ctx.extendedContext = new Unique0strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPrioritystr(PrioritystrContext ctx){
		super.visitPrioritystr(ctx);
		ctx.extendedContext = new PrioritystrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMatchesstr(MatchesstrContext ctx){
		super.visitMatchesstr(ctx);
		ctx.extendedContext = new MatchesstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInsidestr(InsidestrContext ctx){
		super.visitInsidestr(ctx);
		ctx.extendedContext = new InsidestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCasezstr(CasezstrContext ctx){
		super.visitCasezstr(ctx);
		ctx.extendedContext = new CasezstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCasexstr(CasexstrContext ctx){
		super.visitCasexstr(ctx);
		ctx.extendedContext = new CasexstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAndandand(AndandandContext ctx){
		super.visitAndandand(ctx);
		ctx.extendedContext = new AndandandContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRandcasestr(RandcasestrContext ctx){
		super.visitRandcasestr(ctx);
		ctx.extendedContext = new RandcasestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscapelcurl(EscapelcurlContext ctx){
		super.visitEscapelcurl(ctx);
		ctx.extendedContext = new EscapelcurlContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitForeverstr(ForeverstrContext ctx){
		super.visitForeverstr(ctx);
		ctx.extendedContext = new ForeverstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWhilestr(WhilestrContext ctx){
		super.visitWhilestr(ctx);
		ctx.extendedContext = new WhilestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDostr(DostrContext ctx){
		super.visitDostr(ctx);
		ctx.extendedContext = new DostrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscapequote(EscapequoteContext ctx){
		super.visitEscapequote(ctx);
		ctx.extendedContext = new EscapequoteContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHash_zero(Hash_zeroContext ctx){
		super.visitHash_zero(ctx);
		ctx.extendedContext = new Hash_zeroContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndclockingstr(EndclockingstrContext ctx){
		super.visitEndclockingstr(ctx);
		ctx.extendedContext = new EndclockingstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGlobalstr(GlobalstrContext ctx){
		super.visitGlobalstr(ctx);
		ctx.extendedContext = new GlobalstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRandsequencestr(RandsequencestrContext ctx){
		super.visitRandsequencestr(ctx);
		ctx.extendedContext = new RandsequencestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOr(OrContext ctx){
		super.visitOr(ctx);
		ctx.extendedContext = new OrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSpecifystr(SpecifystrContext ctx){
		super.visitSpecifystr(ctx);
		ctx.extendedContext = new SpecifystrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndspecifystr(EndspecifystrContext ctx){
		super.visitEndspecifystr(ctx);
		ctx.extendedContext = new EndspecifystrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPulsestyle_oneventstr(Pulsestyle_oneventstrContext ctx){
		super.visitPulsestyle_oneventstr(ctx);
		ctx.extendedContext = new Pulsestyle_oneventstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPulsestyle_ondetectstr(Pulsestyle_ondetectstrContext ctx){
		super.visitPulsestyle_ondetectstr(ctx);
		ctx.extendedContext = new Pulsestyle_ondetectstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitShowcancelledstr(ShowcancelledstrContext ctx){
		super.visitShowcancelledstr(ctx);
		ctx.extendedContext = new ShowcancelledstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNoshowcancelledstr(NoshowcancelledstrContext ctx){
		super.visitNoshowcancelledstr(ctx);
		ctx.extendedContext = new NoshowcancelledstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStargt(StargtContext ctx){
		super.visitStargt(ctx);
		ctx.extendedContext = new StargtContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPosedgestr(PosedgestrContext ctx){
		super.visitPosedgestr(ctx);
		ctx.extendedContext = new PosedgestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNegedgestr(NegedgestrContext ctx){
		super.visitNegedgestr(ctx);
		ctx.extendedContext = new NegedgestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEdgestr(EdgestrContext ctx){
		super.visitEdgestr(ctx);
		ctx.extendedContext = new EdgestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIfnonestr(IfnonestrContext ctx){
		super.visitIfnonestr(ctx);
		ctx.extendedContext = new IfnonestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarsetupstr(DollarsetupstrContext ctx){
		super.visitDollarsetupstr(ctx);
		ctx.extendedContext = new DollarsetupstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarholdstr(DollarholdstrContext ctx){
		super.visitDollarholdstr(ctx);
		ctx.extendedContext = new DollarholdstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarsetupholdstr(DollarsetupholdstrContext ctx){
		super.visitDollarsetupholdstr(ctx);
		ctx.extendedContext = new DollarsetupholdstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarrecoverystr(DollarrecoverystrContext ctx){
		super.visitDollarrecoverystr(ctx);
		ctx.extendedContext = new DollarrecoverystrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarremovalstr(DollarremovalstrContext ctx){
		super.visitDollarremovalstr(ctx);
		ctx.extendedContext = new DollarremovalstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarrecremstr(DollarrecremstrContext ctx){
		super.visitDollarrecremstr(ctx);
		ctx.extendedContext = new DollarrecremstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarskewstr(DollarskewstrContext ctx){
		super.visitDollarskewstr(ctx);
		ctx.extendedContext = new DollarskewstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollartimeskewstr(DollartimeskewstrContext ctx){
		super.visitDollartimeskewstr(ctx);
		ctx.extendedContext = new DollartimeskewstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarfullskewstr(DollarfullskewstrContext ctx){
		super.visitDollarfullskewstr(ctx);
		ctx.extendedContext = new DollarfullskewstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarperiodstr(DollarperiodstrContext ctx){
		super.visitDollarperiodstr(ctx);
		ctx.extendedContext = new DollarperiodstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollaewidthstr(DollaewidthstrContext ctx){
		super.visitDollaewidthstr(ctx);
		ctx.extendedContext = new DollaewidthstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarnochangestr(DollarnochangestrContext ctx){
		super.visitDollarnochangestr(ctx);
		ctx.extendedContext = new DollarnochangestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitZ_or_x(Z_or_xContext ctx){
		super.visitZ_or_x(ctx);
		ctx.extendedContext = new Z_or_xContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCompliment(ComplimentContext ctx){
		super.visitCompliment(ctx);
		ctx.extendedContext = new ComplimentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_equality(Case_equalityContext ctx){
		super.visitCase_equality(ctx);
		ctx.extendedContext = new Case_equalityContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_inequality(Case_inequalityContext ctx){
		super.visitCase_inequality(ctx);
		ctx.extendedContext = new Case_inequalityContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRshift(RshiftContext ctx){
		super.visitRshift(ctx);
		ctx.extendedContext = new RshiftContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLshift(LshiftContext ctx){
		super.visitLshift(ctx);
		ctx.extendedContext = new LshiftContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPluscolon(PluscolonContext ctx){
		super.visitPluscolon(ctx);
		ctx.extendedContext = new PluscolonContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMinuscolon(MinuscolonContext ctx){
		super.visitMinuscolon(ctx);
		ctx.extendedContext = new MinuscolonContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStdcoloncolon(StdcoloncolonContext ctx){
		super.visitStdcoloncolon(ctx);
		ctx.extendedContext = new StdcoloncolonContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRandomizestr(RandomizestrContext ctx){
		super.visitRandomizestr(ctx);
		ctx.extendedContext = new RandomizestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNullstr(NullstrContext ctx){
		super.visitNullstr(ctx);
		ctx.extendedContext = new NullstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAlshift(AlshiftContext ctx){
		super.visitAlshift(ctx);
		ctx.extendedContext = new AlshiftContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitArshift(ArshiftContext ctx){
		super.visitArshift(ctx);
		ctx.extendedContext = new ArshiftContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_q(Case_qContext ctx){
		super.visitCase_q(ctx);
		ctx.extendedContext = new Case_qContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNot_case_q(Not_case_qContext ctx){
		super.visitNot_case_q(ctx);
		ctx.extendedContext = new Not_case_qContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAnd(AndContext ctx){
		super.visitAnd(ctx);
		ctx.extendedContext = new AndContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitXor(XorContext ctx){
		super.visitXor(ctx);
		ctx.extendedContext = new XorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitXnor(XnorContext ctx){
		super.visitXnor(ctx);
		ctx.extendedContext = new XnorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitXorn(XornContext ctx){
		super.visitXorn(ctx);
		ctx.extendedContext = new XornContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitThisstr(ThisstrContext ctx){
		super.visitThisstr(ctx);
		ctx.extendedContext = new ThisstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLocalcoloncolon(LocalcoloncolonContext ctx){
		super.visitLocalcoloncolon(ctx);
		ctx.extendedContext = new LocalcoloncolonContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTime_unit(Time_unitContext ctx){
		super.visitTime_unit(ctx);
		ctx.extendedContext = new Time_unitContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNand(NandContext ctx){
		super.visitNand(ctx);
		ctx.extendedContext = new NandContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNor(NorContext ctx){
		super.visitNor(ctx);
		ctx.extendedContext = new NorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDderive(DderiveContext ctx){
		super.visitDderive(ctx);
		ctx.extendedContext = new DderiveContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitScalar_constant0(Scalar_constant0Context ctx){
		super.visitScalar_constant0(ctx);
		ctx.extendedContext = new Scalar_constant0ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitScalar_constant1(Scalar_constant1Context ctx){
		super.visitScalar_constant1(ctx);
		ctx.extendedContext = new Scalar_constant1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitString(StringContext ctx){
		super.visitString(ctx);
		ctx.extendedContext = new StringContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLparenstar(LparenstarContext ctx){
		super.visitLparenstar(ctx);
		ctx.extendedContext = new LparenstarContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStarrparen(StarrparenContext ctx){
		super.visitStarrparen(ctx);
		ctx.extendedContext = new StarrparenContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEsc_identifier(Esc_identifierContext ctx){
		super.visitEsc_identifier(ctx);
		ctx.extendedContext = new Esc_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarrootstr(DollarrootstrContext ctx){
		super.visitDollarrootstr(ctx);
		ctx.extendedContext = new DollarrootstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarunitstr(DollarunitstrContext ctx){
		super.visitDollarunitstr(ctx);
		ctx.extendedContext = new DollarunitstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTf_id(Tf_idContext ctx){
		super.visitTf_id(ctx);
		ctx.extendedContext = new Tf_idContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOctal_number(Octal_numberContext ctx){
		super.visitOctal_number(ctx);
		ctx.extendedContext = new Octal_numberContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHex_number(Hex_numberContext ctx){
		super.visitHex_number(ctx);
		ctx.extendedContext = new Hex_numberContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPragma_def(Pragma_defContext ctx){
		super.visitPragma_def(ctx);
		ctx.extendedContext = new Pragma_defContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPragma_text(Pragma_textContext ctx){
		super.visitPragma_text(ctx);
		ctx.extendedContext = new Pragma_textContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSource_text(Source_textContext ctx){
		super.visitSource_text(ctx);
		ctx.extendedContext = new Source_textContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDescription(DescriptionContext ctx){
		super.visitDescription(ctx);
		ctx.extendedContext = new DescriptionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_declaration(Module_declarationContext ctx){
		super.visitModule_declaration(ctx);
		ctx.extendedContext = new Module_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_nonansi_header(Module_nonansi_headerContext ctx){
		super.visitModule_nonansi_header(ctx);
		ctx.extendedContext = new Module_nonansi_headerContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_ansi_header(Module_ansi_headerContext ctx){
		super.visitModule_ansi_header(ctx);
		ctx.extendedContext = new Module_ansi_headerContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_keyword(Module_keywordContext ctx){
		super.visitModule_keyword(ctx);
		ctx.extendedContext = new Module_keywordContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterface_declaration(Interface_declarationContext ctx){
		super.visitInterface_declaration(ctx);
		ctx.extendedContext = new Interface_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterface_nonansi_header(Interface_nonansi_headerContext ctx){
		super.visitInterface_nonansi_header(ctx);
		ctx.extendedContext = new Interface_nonansi_headerContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterface_ansi_header(Interface_ansi_headerContext ctx){
		super.visitInterface_ansi_header(ctx);
		ctx.extendedContext = new Interface_ansi_headerContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProgram_declaration(Program_declarationContext ctx){
		super.visitProgram_declaration(ctx);
		ctx.extendedContext = new Program_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProgram_nonansi_header(Program_nonansi_headerContext ctx){
		super.visitProgram_nonansi_header(ctx);
		ctx.extendedContext = new Program_nonansi_headerContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProgram_ansi_header(Program_ansi_headerContext ctx){
		super.visitProgram_ansi_header(ctx);
		ctx.extendedContext = new Program_ansi_headerContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitChecker_declaration(Checker_declarationContext ctx){
		super.visitChecker_declaration(ctx);
		ctx.extendedContext = new Checker_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_declaration(Class_declarationContext ctx){
		super.visitClass_declaration(ctx);
		ctx.extendedContext = new Class_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackage_declaration(Package_declarationContext ctx){
		super.visitPackage_declaration(ctx);
		ctx.extendedContext = new Package_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackage_declaration_part1(Package_declaration_part1Context ctx){
		super.visitPackage_declaration_part1(ctx);
		ctx.extendedContext = new Package_declaration_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTimeunits_declaration(Timeunits_declarationContext ctx){
		super.visitTimeunits_declaration(ctx);
		ctx.extendedContext = new Timeunits_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParameter_port_list(Parameter_port_listContext ctx){
		super.visitParameter_port_list(ctx);
		ctx.extendedContext = new Parameter_port_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_parameter_port_declaration(List_of_parameter_port_declarationContext ctx){
		super.visitList_of_parameter_port_declaration(ctx);
		ctx.extendedContext = new List_of_parameter_port_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParameter_port_declaration(Parameter_port_declarationContext ctx){
		super.visitParameter_port_declaration(ctx);
		ctx.extendedContext = new Parameter_port_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_ports(List_of_portsContext ctx){
		super.visitList_of_ports(ctx);
		ctx.extendedContext = new List_of_portsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_declarations(List_of_port_declarationsContext ctx){
		super.visitList_of_port_declarations(ctx);
		ctx.extendedContext = new List_of_port_declarationsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_declarations_part1(List_of_port_declarations_part1Context ctx){
		super.visitList_of_port_declarations_part1(ctx);
		ctx.extendedContext = new List_of_port_declarations_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPort_declaration(Port_declarationContext ctx){
		super.visitPort_declaration(ctx);
		ctx.extendedContext = new Port_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPort(PortContext ctx){
		super.visitPort(ctx);
		ctx.extendedContext = new PortContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPort_expression(Port_expressionContext ctx){
		super.visitPort_expression(ctx);
		ctx.extendedContext = new Port_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPort_reference(Port_referenceContext ctx){
		super.visitPort_reference(ctx);
		ctx.extendedContext = new Port_referenceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPort_direction(Port_directionContext ctx){
		super.visitPort_direction(ctx);
		ctx.extendedContext = new Port_directionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_port_header(Net_port_headerContext ctx){
		super.visitNet_port_header(ctx);
		ctx.extendedContext = new Net_port_headerContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVariable_port_header(Variable_port_headerContext ctx){
		super.visitVariable_port_header(ctx);
		ctx.extendedContext = new Variable_port_headerContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterface_port_header(Interface_port_headerContext ctx){
		super.visitInterface_port_header(ctx);
		ctx.extendedContext = new Interface_port_headerContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAnsi_port_declaration(Ansi_port_declarationContext ctx){
		super.visitAnsi_port_declaration(ctx);
		ctx.extendedContext = new Ansi_port_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitElaboration_system_task(Elaboration_system_taskContext ctx){
		super.visitElaboration_system_task(ctx);
		ctx.extendedContext = new Elaboration_system_taskContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFinish_number(Finish_numberContext ctx){
		super.visitFinish_number(ctx);
		ctx.extendedContext = new Finish_numberContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_common_item(Module_common_itemContext ctx){
		super.visitModule_common_item(ctx);
		ctx.extendedContext = new Module_common_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_item(Module_itemContext ctx){
		super.visitModule_item(ctx);
		ctx.extendedContext = new Module_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_or_generate_item(Module_or_generate_itemContext ctx){
		super.visitModule_or_generate_item(ctx);
		ctx.extendedContext = new Module_or_generate_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNon_port_module_item(Non_port_module_itemContext ctx){
		super.visitNon_port_module_item(ctx);
		ctx.extendedContext = new Non_port_module_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParameter_override(Parameter_overrideContext ctx){
		super.visitParameter_override(ctx);
		ctx.extendedContext = new Parameter_overrideContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBind_directive(Bind_directiveContext ctx){
		super.visitBind_directive(ctx);
		ctx.extendedContext = new Bind_directiveContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBind_target_scope(Bind_target_scopeContext ctx){
		super.visitBind_target_scope(ctx);
		ctx.extendedContext = new Bind_target_scopeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBind_target_instance(Bind_target_instanceContext ctx){
		super.visitBind_target_instance(ctx);
		ctx.extendedContext = new Bind_target_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBind_target_instance_list(Bind_target_instance_listContext ctx){
		super.visitBind_target_instance_list(ctx);
		ctx.extendedContext = new Bind_target_instance_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBind_instantiation(Bind_instantiationContext ctx){
		super.visitBind_instantiation(ctx);
		ctx.extendedContext = new Bind_instantiationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConfig_declaration(Config_declarationContext ctx){
		super.visitConfig_declaration(ctx);
		ctx.extendedContext = new Config_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDesign_statement(Design_statementContext ctx){
		super.visitDesign_statement(ctx);
		ctx.extendedContext = new Design_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDesign_statement_part1(Design_statement_part1Context ctx){
		super.visitDesign_statement_part1(ctx);
		ctx.extendedContext = new Design_statement_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConfig_rule_statement(Config_rule_statementContext ctx){
		super.visitConfig_rule_statement(ctx);
		ctx.extendedContext = new Config_rule_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefault_clause(Default_clauseContext ctx){
		super.visitDefault_clause(ctx);
		ctx.extendedContext = new Default_clauseContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInst_clause(Inst_clauseContext ctx){
		super.visitInst_clause(ctx);
		ctx.extendedContext = new Inst_clauseContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInst_name(Inst_nameContext ctx){
		super.visitInst_name(ctx);
		ctx.extendedContext = new Inst_nameContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCell_clause(Cell_clauseContext ctx){
		super.visitCell_clause(ctx);
		ctx.extendedContext = new Cell_clauseContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLiblist_clause(Liblist_clauseContext ctx){
		super.visitLiblist_clause(ctx);
		ctx.extendedContext = new Liblist_clauseContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUse_clause(Use_clauseContext ctx){
		super.visitUse_clause(ctx);
		ctx.extendedContext = new Use_clauseContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_or_generate_item_declaration(Module_or_generate_item_declarationContext ctx){
		super.visitModule_or_generate_item_declaration(ctx);
		ctx.extendedContext = new Module_or_generate_item_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterface_or_generate_item(Interface_or_generate_itemContext ctx){
		super.visitInterface_or_generate_item(ctx);
		ctx.extendedContext = new Interface_or_generate_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExtern_tf_declaration(Extern_tf_declarationContext ctx){
		super.visitExtern_tf_declaration(ctx);
		ctx.extendedContext = new Extern_tf_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterface_item(Interface_itemContext ctx){
		super.visitInterface_item(ctx);
		ctx.extendedContext = new Interface_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNon_port_interface_item(Non_port_interface_itemContext ctx){
		super.visitNon_port_interface_item(ctx);
		ctx.extendedContext = new Non_port_interface_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProgram_item(Program_itemContext ctx){
		super.visitProgram_item(ctx);
		ctx.extendedContext = new Program_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNon_port_program_item(Non_port_program_itemContext ctx){
		super.visitNon_port_program_item(ctx);
		ctx.extendedContext = new Non_port_program_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProgram_generate_item(Program_generate_itemContext ctx){
		super.visitProgram_generate_item(ctx);
		ctx.extendedContext = new Program_generate_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitChecker_port_list(Checker_port_listContext ctx){
		super.visitChecker_port_list(ctx);
		ctx.extendedContext = new Checker_port_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitChecker_port_item(Checker_port_itemContext ctx){
		super.visitChecker_port_item(ctx);
		ctx.extendedContext = new Checker_port_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitChecker_or_generate_item(Checker_or_generate_itemContext ctx){
		super.visitChecker_or_generate_item(ctx);
		ctx.extendedContext = new Checker_or_generate_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitChecker_or_generate_item_declaration(Checker_or_generate_item_declarationContext ctx){
		super.visitChecker_or_generate_item_declaration(ctx);
		ctx.extendedContext = new Checker_or_generate_item_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitChecker_generate_item(Checker_generate_itemContext ctx){
		super.visitChecker_generate_item(ctx);
		ctx.extendedContext = new Checker_generate_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitChecker_always_construct(Checker_always_constructContext ctx){
		super.visitChecker_always_construct(ctx);
		ctx.extendedContext = new Checker_always_constructContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_item(Class_itemContext ctx){
		super.visitClass_item(ctx);
		ctx.extendedContext = new Class_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_property(Class_propertyContext ctx){
		super.visitClass_property(ctx);
		ctx.extendedContext = new Class_propertyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_method(Class_methodContext ctx){
		super.visitClass_method(ctx);
		ctx.extendedContext = new Class_methodContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_constructor_prototype(Class_constructor_prototypeContext ctx){
		super.visitClass_constructor_prototype(ctx);
		ctx.extendedContext = new Class_constructor_prototypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_constraint(Class_constraintContext ctx){
		super.visitClass_constraint(ctx);
		ctx.extendedContext = new Class_constraintContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_item_qualifier(Class_item_qualifierContext ctx){
		super.visitClass_item_qualifier(ctx);
		ctx.extendedContext = new Class_item_qualifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_qualifier(Property_qualifierContext ctx){
		super.visitProperty_qualifier(ctx);
		ctx.extendedContext = new Property_qualifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRandom_qualifier(Random_qualifierContext ctx){
		super.visitRandom_qualifier(ctx);
		ctx.extendedContext = new Random_qualifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMethod_qualifier(Method_qualifierContext ctx){
		super.visitMethod_qualifier(ctx);
		ctx.extendedContext = new Method_qualifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMethod_prototype(Method_prototypeContext ctx){
		super.visitMethod_prototype(ctx);
		ctx.extendedContext = new Method_prototypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_constructor_declaration(Class_constructor_declarationContext ctx){
		super.visitClass_constructor_declaration(ctx);
		ctx.extendedContext = new Class_constructor_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstraint_declaration(Constraint_declarationContext ctx){
		super.visitConstraint_declaration(ctx);
		ctx.extendedContext = new Constraint_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstraint_block(Constraint_blockContext ctx){
		super.visitConstraint_block(ctx);
		ctx.extendedContext = new Constraint_blockContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstraint_block_item(Constraint_block_itemContext ctx){
		super.visitConstraint_block_item(ctx);
		ctx.extendedContext = new Constraint_block_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSolve_before_list(Solve_before_listContext ctx){
		super.visitSolve_before_list(ctx);
		ctx.extendedContext = new Solve_before_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSolve_before_primary(Solve_before_primaryContext ctx){
		super.visitSolve_before_primary(ctx);
		ctx.extendedContext = new Solve_before_primaryContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstraint_expression(Constraint_expressionContext ctx){
		super.visitConstraint_expression(ctx);
		ctx.extendedContext = new Constraint_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstraint_set(Constraint_setContext ctx){
		super.visitConstraint_set(ctx);
		ctx.extendedContext = new Constraint_setContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDist_list(Dist_listContext ctx){
		super.visitDist_list(ctx);
		ctx.extendedContext = new Dist_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDist_item(Dist_itemContext ctx){
		super.visitDist_item(ctx);
		ctx.extendedContext = new Dist_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDist_weight(Dist_weightContext ctx){
		super.visitDist_weight(ctx);
		ctx.extendedContext = new Dist_weightContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstraint_prototype(Constraint_prototypeContext ctx){
		super.visitConstraint_prototype(ctx);
		ctx.extendedContext = new Constraint_prototypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExtern_constraint_declaration(Extern_constraint_declarationContext ctx){
		super.visitExtern_constraint_declaration(ctx);
		ctx.extendedContext = new Extern_constraint_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIdentifier_list(Identifier_listContext ctx){
		super.visitIdentifier_list(ctx);
		ctx.extendedContext = new Identifier_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackage_item(Package_itemContext ctx){
		super.visitPackage_item(ctx);
		ctx.extendedContext = new Package_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackage_or_generate_item_declaration(Package_or_generate_item_declarationContext ctx){
		super.visitPackage_or_generate_item_declaration(ctx);
		ctx.extendedContext = new Package_or_generate_item_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAnonymous_program(Anonymous_programContext ctx){
		super.visitAnonymous_program(ctx);
		ctx.extendedContext = new Anonymous_programContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAnonymous_program_item(Anonymous_program_itemContext ctx){
		super.visitAnonymous_program_item(ctx);
		ctx.extendedContext = new Anonymous_program_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLocal_parameter_declaration(Local_parameter_declarationContext ctx){
		super.visitLocal_parameter_declaration(ctx);
		ctx.extendedContext = new Local_parameter_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParameter_declaration(Parameter_declarationContext ctx){
		super.visitParameter_declaration(ctx);
		ctx.extendedContext = new Parameter_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSpecparam_declaration(Specparam_declarationContext ctx){
		super.visitSpecparam_declaration(ctx);
		ctx.extendedContext = new Specparam_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInout_declaration(Inout_declarationContext ctx){
		super.visitInout_declaration(ctx);
		ctx.extendedContext = new Inout_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInput_declaration(Input_declarationContext ctx){
		super.visitInput_declaration(ctx);
		ctx.extendedContext = new Input_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOutput_declaration(Output_declarationContext ctx){
		super.visitOutput_declaration(ctx);
		ctx.extendedContext = new Output_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterface_port_declaration(Interface_port_declarationContext ctx){
		super.visitInterface_port_declaration(ctx);
		ctx.extendedContext = new Interface_port_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRef_declaration(Ref_declarationContext ctx){
		super.visitRef_declaration(ctx);
		ctx.extendedContext = new Ref_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitData_declaration(Data_declarationContext ctx){
		super.visitData_declaration(ctx);
		ctx.extendedContext = new Data_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackage_import_declaration(Package_import_declarationContext ctx){
		super.visitPackage_import_declaration(ctx);
		ctx.extendedContext = new Package_import_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackage_import_item(Package_import_itemContext ctx){
		super.visitPackage_import_item(ctx);
		ctx.extendedContext = new Package_import_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackage_export_declaration(Package_export_declarationContext ctx){
		super.visitPackage_export_declaration(ctx);
		ctx.extendedContext = new Package_export_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenvar_declaration(Genvar_declarationContext ctx){
		super.visitGenvar_declaration(ctx);
		ctx.extendedContext = new Genvar_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_declaration(Net_declarationContext ctx){
		super.visitNet_declaration(ctx);
		ctx.extendedContext = new Net_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitType_declaration(Type_declarationContext ctx){
		super.visitType_declaration(ctx);
		ctx.extendedContext = new Type_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLifetime(LifetimeContext ctx){
		super.visitLifetime(ctx);
		ctx.extendedContext = new LifetimeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCasting_type(Casting_typeContext ctx){
		super.visitCasting_type(ctx);
		ctx.extendedContext = new Casting_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitData_type(Data_typeContext ctx){
		super.visitData_type(ctx);
		ctx.extendedContext = new Data_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitData_type_or_implicit(Data_type_or_implicitContext ctx){
		super.visitData_type_or_implicit(ctx);
		ctx.extendedContext = new Data_type_or_implicitContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitImplicit_data_type(Implicit_data_typeContext ctx){
		super.visitImplicit_data_type(ctx);
		ctx.extendedContext = new Implicit_data_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEnum_base_type(Enum_base_typeContext ctx){
		super.visitEnum_base_type(ctx);
		ctx.extendedContext = new Enum_base_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEnum_name_declaration(Enum_name_declarationContext ctx){
		super.visitEnum_name_declaration(ctx);
		ctx.extendedContext = new Enum_name_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEnum_name_declaration_part1(Enum_name_declaration_part1Context ctx){
		super.visitEnum_name_declaration_part1(ctx);
		ctx.extendedContext = new Enum_name_declaration_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_scope(Class_scopeContext ctx){
		super.visitClass_scope(ctx);
		ctx.extendedContext = new Class_scopeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_type(Class_typeContext ctx){
		super.visitClass_type(ctx);
		ctx.extendedContext = new Class_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_type_part1(Class_type_part1Context ctx){
		super.visitClass_type_part1(ctx);
		ctx.extendedContext = new Class_type_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInteger_type(Integer_typeContext ctx){
		super.visitInteger_type(ctx);
		ctx.extendedContext = new Integer_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInteger_atom_type(Integer_atom_typeContext ctx){
		super.visitInteger_atom_type(ctx);
		ctx.extendedContext = new Integer_atom_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInteger_vector_type(Integer_vector_typeContext ctx){
		super.visitInteger_vector_type(ctx);
		ctx.extendedContext = new Integer_vector_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNon_integer_type(Non_integer_typeContext ctx){
		super.visitNon_integer_type(ctx);
		ctx.extendedContext = new Non_integer_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_type(Net_typeContext ctx){
		super.visitNet_type(ctx);
		ctx.extendedContext = new Net_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_port_type(Net_port_typeContext ctx){
		super.visitNet_port_type(ctx);
		ctx.extendedContext = new Net_port_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVariable_port_type(Variable_port_typeContext ctx){
		super.visitVariable_port_type(ctx);
		ctx.extendedContext = new Variable_port_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVar_data_type(Var_data_typeContext ctx){
		super.visitVar_data_type(ctx);
		ctx.extendedContext = new Var_data_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSigning(SigningContext ctx){
		super.visitSigning(ctx);
		ctx.extendedContext = new SigningContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_type(Simple_typeContext ctx){
		super.visitSimple_type(ctx);
		ctx.extendedContext = new Simple_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStruct_union_member(Struct_union_memberContext ctx){
		super.visitStruct_union_member(ctx);
		ctx.extendedContext = new Struct_union_memberContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitData_type_or_void(Data_type_or_voidContext ctx){
		super.visitData_type_or_void(ctx);
		ctx.extendedContext = new Data_type_or_voidContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStruct_union(Struct_unionContext ctx){
		super.visitStruct_union(ctx);
		ctx.extendedContext = new Struct_unionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitType_reference(Type_referenceContext ctx){
		super.visitType_reference(ctx);
		ctx.extendedContext = new Type_referenceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDrive_strength(Drive_strengthContext ctx){
		super.visitDrive_strength(ctx);
		ctx.extendedContext = new Drive_strengthContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStrength0(Strength0Context ctx){
		super.visitStrength0(ctx);
		ctx.extendedContext = new Strength0ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStrength1(Strength1Context ctx){
		super.visitStrength1(ctx);
		ctx.extendedContext = new Strength1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCharge_strength(Charge_strengthContext ctx){
		super.visitCharge_strength(ctx);
		ctx.extendedContext = new Charge_strengthContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDelay3(Delay3Context ctx){
		super.visitDelay3(ctx);
		ctx.extendedContext = new Delay3ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDelay2(Delay2Context ctx){
		super.visitDelay2(ctx);
		ctx.extendedContext = new Delay2ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDelay_value(Delay_valueContext ctx){
		super.visitDelay_value(ctx);
		ctx.extendedContext = new Delay_valueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_defparam_assignments(List_of_defparam_assignmentsContext ctx){
		super.visitList_of_defparam_assignments(ctx);
		ctx.extendedContext = new List_of_defparam_assignmentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_genvar_identifiers(List_of_genvar_identifiersContext ctx){
		super.visitList_of_genvar_identifiers(ctx);
		ctx.extendedContext = new List_of_genvar_identifiersContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_interface_identifiers(List_of_interface_identifiersContext ctx){
		super.visitList_of_interface_identifiers(ctx);
		ctx.extendedContext = new List_of_interface_identifiersContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_interface_identifiers_part1(List_of_interface_identifiers_part1Context ctx){
		super.visitList_of_interface_identifiers_part1(ctx);
		ctx.extendedContext = new List_of_interface_identifiers_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_param_assignments(List_of_param_assignmentsContext ctx){
		super.visitList_of_param_assignments(ctx);
		ctx.extendedContext = new List_of_param_assignmentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_identifiers(List_of_port_identifiersContext ctx){
		super.visitList_of_port_identifiers(ctx);
		ctx.extendedContext = new List_of_port_identifiersContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_identifiers_part1(List_of_port_identifiers_part1Context ctx){
		super.visitList_of_port_identifiers_part1(ctx);
		ctx.extendedContext = new List_of_port_identifiers_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_udp_port_identifiers(List_of_udp_port_identifiersContext ctx){
		super.visitList_of_udp_port_identifiers(ctx);
		ctx.extendedContext = new List_of_udp_port_identifiersContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_specparam_assignments(List_of_specparam_assignmentsContext ctx){
		super.visitList_of_specparam_assignments(ctx);
		ctx.extendedContext = new List_of_specparam_assignmentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_tf_variable_identifiers(List_of_tf_variable_identifiersContext ctx){
		super.visitList_of_tf_variable_identifiers(ctx);
		ctx.extendedContext = new List_of_tf_variable_identifiersContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_tf_variable_identifiers_part1(List_of_tf_variable_identifiers_part1Context ctx){
		super.visitList_of_tf_variable_identifiers_part1(ctx);
		ctx.extendedContext = new List_of_tf_variable_identifiers_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_type_assignments(List_of_type_assignmentsContext ctx){
		super.visitList_of_type_assignments(ctx);
		ctx.extendedContext = new List_of_type_assignmentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_decl_assignments(List_of_variable_decl_assignmentsContext ctx){
		super.visitList_of_variable_decl_assignments(ctx);
		ctx.extendedContext = new List_of_variable_decl_assignmentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_identifiers(List_of_variable_identifiersContext ctx){
		super.visitList_of_variable_identifiers(ctx);
		ctx.extendedContext = new List_of_variable_identifiersContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_identifiers_part1(List_of_variable_identifiers_part1Context ctx){
		super.visitList_of_variable_identifiers_part1(ctx);
		ctx.extendedContext = new List_of_variable_identifiers_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_port_identifiers(List_of_variable_port_identifiersContext ctx){
		super.visitList_of_variable_port_identifiers(ctx);
		ctx.extendedContext = new List_of_variable_port_identifiersContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_port_identifiers_part1(List_of_variable_port_identifiers_part1Context ctx){
		super.visitList_of_variable_port_identifiers_part1(ctx);
		ctx.extendedContext = new List_of_variable_port_identifiers_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_virtual_interface_decl(List_of_virtual_interface_declContext ctx){
		super.visitList_of_virtual_interface_decl(ctx);
		ctx.extendedContext = new List_of_virtual_interface_declContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_virtual_interface_decl_part1(List_of_virtual_interface_decl_part1Context ctx){
		super.visitList_of_virtual_interface_decl_part1(ctx);
		ctx.extendedContext = new List_of_virtual_interface_decl_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefparam_assignment(Defparam_assignmentContext ctx){
		super.visitDefparam_assignment(ctx);
		ctx.extendedContext = new Defparam_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_net_decl_assignments(List_of_net_decl_assignmentsContext ctx){
		super.visitList_of_net_decl_assignments(ctx);
		ctx.extendedContext = new List_of_net_decl_assignmentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_decl_assignment(Net_decl_assignmentContext ctx){
		super.visitNet_decl_assignment(ctx);
		ctx.extendedContext = new Net_decl_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParam_assignment(Param_assignmentContext ctx){
		super.visitParam_assignment(ctx);
		ctx.extendedContext = new Param_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSpecparam_assignment(Specparam_assignmentContext ctx){
		super.visitSpecparam_assignment(ctx);
		ctx.extendedContext = new Specparam_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitType_assignment(Type_assignmentContext ctx){
		super.visitType_assignment(ctx);
		ctx.extendedContext = new Type_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPulse_control_specparam(Pulse_control_specparamContext ctx){
		super.visitPulse_control_specparam(ctx);
		ctx.extendedContext = new Pulse_control_specparamContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitError_limit_value(Error_limit_valueContext ctx){
		super.visitError_limit_value(ctx);
		ctx.extendedContext = new Error_limit_valueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitReject_limit_value(Reject_limit_valueContext ctx){
		super.visitReject_limit_value(ctx);
		ctx.extendedContext = new Reject_limit_valueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLimit_value(Limit_valueContext ctx){
		super.visitLimit_value(ctx);
		ctx.extendedContext = new Limit_valueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVariable_decl_assignment(Variable_decl_assignmentContext ctx){
		super.visitVariable_decl_assignment(ctx);
		ctx.extendedContext = new Variable_decl_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_new(Class_newContext ctx){
		super.visitClass_new(ctx);
		ctx.extendedContext = new Class_newContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDynamic_array_new(Dynamic_array_newContext ctx){
		super.visitDynamic_array_new(ctx);
		ctx.extendedContext = new Dynamic_array_newContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnpacked_dimension(Unpacked_dimensionContext ctx){
		super.visitUnpacked_dimension(ctx);
		ctx.extendedContext = new Unpacked_dimensionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPacked_dimension(Packed_dimensionContext ctx){
		super.visitPacked_dimension(ctx);
		ctx.extendedContext = new Packed_dimensionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssociative_dimension(Associative_dimensionContext ctx){
		super.visitAssociative_dimension(ctx);
		ctx.extendedContext = new Associative_dimensionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVariable_dimension(Variable_dimensionContext ctx){
		super.visitVariable_dimension(ctx);
		ctx.extendedContext = new Variable_dimensionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitQueue_dimension(Queue_dimensionContext ctx){
		super.visitQueue_dimension(ctx);
		ctx.extendedContext = new Queue_dimensionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnsized_dimension(Unsized_dimensionContext ctx){
		super.visitUnsized_dimension(ctx);
		ctx.extendedContext = new Unsized_dimensionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFunction_data_type_or_implicit(Function_data_type_or_implicitContext ctx){
		super.visitFunction_data_type_or_implicit(ctx);
		ctx.extendedContext = new Function_data_type_or_implicitContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFunction_declaration(Function_declarationContext ctx){
		super.visitFunction_declaration(ctx);
		ctx.extendedContext = new Function_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFunction_body_declaration(Function_body_declarationContext ctx){
		super.visitFunction_body_declaration(ctx);
		ctx.extendedContext = new Function_body_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFunction_prototype(Function_prototypeContext ctx){
		super.visitFunction_prototype(ctx);
		ctx.extendedContext = new Function_prototypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDpi_import_export(Dpi_import_exportContext ctx){
		super.visitDpi_import_export(ctx);
		ctx.extendedContext = new Dpi_import_exportContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDpi_spec_string(Dpi_spec_stringContext ctx){
		super.visitDpi_spec_string(ctx);
		ctx.extendedContext = new Dpi_spec_stringContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDpi_function_import_property(Dpi_function_import_propertyContext ctx){
		super.visitDpi_function_import_property(ctx);
		ctx.extendedContext = new Dpi_function_import_propertyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDpi_task_import_property(Dpi_task_import_propertyContext ctx){
		super.visitDpi_task_import_property(ctx);
		ctx.extendedContext = new Dpi_task_import_propertyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDpi_function_proto(Dpi_function_protoContext ctx){
		super.visitDpi_function_proto(ctx);
		ctx.extendedContext = new Dpi_function_protoContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDpi_task_proto(Dpi_task_protoContext ctx){
		super.visitDpi_task_proto(ctx);
		ctx.extendedContext = new Dpi_task_protoContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTask_declaration(Task_declarationContext ctx){
		super.visitTask_declaration(ctx);
		ctx.extendedContext = new Task_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTask_body_declaration(Task_body_declarationContext ctx){
		super.visitTask_body_declaration(ctx);
		ctx.extendedContext = new Task_body_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTf_item_declaration(Tf_item_declarationContext ctx){
		super.visitTf_item_declaration(ctx);
		ctx.extendedContext = new Tf_item_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTf_port_list(Tf_port_listContext ctx){
		super.visitTf_port_list(ctx);
		ctx.extendedContext = new Tf_port_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTf_port_item(Tf_port_itemContext ctx){
		super.visitTf_port_item(ctx);
		ctx.extendedContext = new Tf_port_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTf_port_direction(Tf_port_directionContext ctx){
		super.visitTf_port_direction(ctx);
		ctx.extendedContext = new Tf_port_directionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTf_port_declaration(Tf_port_declarationContext ctx){
		super.visitTf_port_declaration(ctx);
		ctx.extendedContext = new Tf_port_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTask_prototype(Task_prototypeContext ctx){
		super.visitTask_prototype(ctx);
		ctx.extendedContext = new Task_prototypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBlock_item_declaration(Block_item_declarationContext ctx){
		super.visitBlock_item_declaration(ctx);
		ctx.extendedContext = new Block_item_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOverload_declaration(Overload_declarationContext ctx){
		super.visitOverload_declaration(ctx);
		ctx.extendedContext = new Overload_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOverload_operator(Overload_operatorContext ctx){
		super.visitOverload_operator(ctx);
		ctx.extendedContext = new Overload_operatorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOverload_proto_formals(Overload_proto_formalsContext ctx){
		super.visitOverload_proto_formals(ctx);
		ctx.extendedContext = new Overload_proto_formalsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVirtual_interface_declaration(Virtual_interface_declarationContext ctx){
		super.visitVirtual_interface_declaration(ctx);
		ctx.extendedContext = new Virtual_interface_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModport_declaration(Modport_declarationContext ctx){
		super.visitModport_declaration(ctx);
		ctx.extendedContext = new Modport_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModport_item(Modport_itemContext ctx){
		super.visitModport_item(ctx);
		ctx.extendedContext = new Modport_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModport_ports_declaration(Modport_ports_declarationContext ctx){
		super.visitModport_ports_declaration(ctx);
		ctx.extendedContext = new Modport_ports_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModport_clocking_declaration(Modport_clocking_declarationContext ctx){
		super.visitModport_clocking_declaration(ctx);
		ctx.extendedContext = new Modport_clocking_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModport_simple_ports_declaration(Modport_simple_ports_declarationContext ctx){
		super.visitModport_simple_ports_declaration(ctx);
		ctx.extendedContext = new Modport_simple_ports_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModport_simple_port(Modport_simple_portContext ctx){
		super.visitModport_simple_port(ctx);
		ctx.extendedContext = new Modport_simple_portContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModport_tf_ports_declaration(Modport_tf_ports_declarationContext ctx){
		super.visitModport_tf_ports_declaration(ctx);
		ctx.extendedContext = new Modport_tf_ports_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModport_tf_port(Modport_tf_portContext ctx){
		super.visitModport_tf_port(ctx);
		ctx.extendedContext = new Modport_tf_portContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitImport_export(Import_exportContext ctx){
		super.visitImport_export(ctx);
		ctx.extendedContext = new Import_exportContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConcurrent_assertion_item(Concurrent_assertion_itemContext ctx){
		super.visitConcurrent_assertion_item(ctx);
		ctx.extendedContext = new Concurrent_assertion_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConcurrent_assertion_statement(Concurrent_assertion_statementContext ctx){
		super.visitConcurrent_assertion_statement(ctx);
		ctx.extendedContext = new Concurrent_assertion_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssert_property_statement(Assert_property_statementContext ctx){
		super.visitAssert_property_statement(ctx);
		ctx.extendedContext = new Assert_property_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssume_property_statement(Assume_property_statementContext ctx){
		super.visitAssume_property_statement(ctx);
		ctx.extendedContext = new Assume_property_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCover_property_statement(Cover_property_statementContext ctx){
		super.visitCover_property_statement(ctx);
		ctx.extendedContext = new Cover_property_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpect_property_statement(Expect_property_statementContext ctx){
		super.visitExpect_property_statement(ctx);
		ctx.extendedContext = new Expect_property_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCover_sequence_statement(Cover_sequence_statementContext ctx){
		super.visitCover_sequence_statement(ctx);
		ctx.extendedContext = new Cover_sequence_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRestrict_property_statement(Restrict_property_statementContext ctx){
		super.visitRestrict_property_statement(ctx);
		ctx.extendedContext = new Restrict_property_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_instance(Property_instanceContext ctx){
		super.visitProperty_instance(ctx);
		ctx.extendedContext = new Property_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_list_of_arguments(Property_list_of_argumentsContext ctx){
		super.visitProperty_list_of_arguments(ctx);
		ctx.extendedContext = new Property_list_of_argumentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_list_of_arguments_part1(Property_list_of_arguments_part1Context ctx){
		super.visitProperty_list_of_arguments_part1(ctx);
		ctx.extendedContext = new Property_list_of_arguments_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_list_of_arguments_part2(Property_list_of_arguments_part2Context ctx){
		super.visitProperty_list_of_arguments_part2(ctx);
		ctx.extendedContext = new Property_list_of_arguments_part2ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_actual_arg(Property_actual_argContext ctx){
		super.visitProperty_actual_arg(ctx);
		ctx.extendedContext = new Property_actual_argContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssertion_item_declaration(Assertion_item_declarationContext ctx){
		super.visitAssertion_item_declaration(ctx);
		ctx.extendedContext = new Assertion_item_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_declaration(Property_declarationContext ctx){
		super.visitProperty_declaration(ctx);
		ctx.extendedContext = new Property_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_port_list(Property_port_listContext ctx){
		super.visitProperty_port_list(ctx);
		ctx.extendedContext = new Property_port_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_port_item(Property_port_itemContext ctx){
		super.visitProperty_port_item(ctx);
		ctx.extendedContext = new Property_port_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_lvar_port_direction(Property_lvar_port_directionContext ctx){
		super.visitProperty_lvar_port_direction(ctx);
		ctx.extendedContext = new Property_lvar_port_directionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_formal_type(Property_formal_typeContext ctx){
		super.visitProperty_formal_type(ctx);
		ctx.extendedContext = new Property_formal_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_spec(Property_specContext ctx){
		super.visitProperty_spec(ctx);
		ctx.extendedContext = new Property_specContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_statement_spec(Property_statement_specContext ctx){
		super.visitProperty_statement_spec(ctx);
		ctx.extendedContext = new Property_statement_specContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_statement(Property_statementContext ctx){
		super.visitProperty_statement(ctx);
		ctx.extendedContext = new Property_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_case_item(Property_case_itemContext ctx){
		super.visitProperty_case_item(ctx);
		ctx.extendedContext = new Property_case_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_expr(Property_exprContext ctx){
		super.visitProperty_expr(ctx);
		ctx.extendedContext = new Property_exprContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_declaration(Sequence_declarationContext ctx){
		super.visitSequence_declaration(ctx);
		ctx.extendedContext = new Sequence_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_port_list(Sequence_port_listContext ctx){
		super.visitSequence_port_list(ctx);
		ctx.extendedContext = new Sequence_port_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_port_item(Sequence_port_itemContext ctx){
		super.visitSequence_port_item(ctx);
		ctx.extendedContext = new Sequence_port_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_lvar_port_direction(Sequence_lvar_port_directionContext ctx){
		super.visitSequence_lvar_port_direction(ctx);
		ctx.extendedContext = new Sequence_lvar_port_directionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_formal_type(Sequence_formal_typeContext ctx){
		super.visitSequence_formal_type(ctx);
		ctx.extendedContext = new Sequence_formal_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_expr(Sequence_exprContext ctx){
		super.visitSequence_expr(ctx);
		ctx.extendedContext = new Sequence_exprContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCycle_delay_range(Cycle_delay_rangeContext ctx){
		super.visitCycle_delay_range(ctx);
		ctx.extendedContext = new Cycle_delay_rangeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_method_call(Sequence_method_callContext ctx){
		super.visitSequence_method_call(ctx);
		ctx.extendedContext = new Sequence_method_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_match_item(Sequence_match_itemContext ctx){
		super.visitSequence_match_item(ctx);
		ctx.extendedContext = new Sequence_match_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_instance(Sequence_instanceContext ctx){
		super.visitSequence_instance(ctx);
		ctx.extendedContext = new Sequence_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_list_of_arguments(Sequence_list_of_argumentsContext ctx){
		super.visitSequence_list_of_arguments(ctx);
		ctx.extendedContext = new Sequence_list_of_argumentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_list_of_arguments_part1(Sequence_list_of_arguments_part1Context ctx){
		super.visitSequence_list_of_arguments_part1(ctx);
		ctx.extendedContext = new Sequence_list_of_arguments_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_list_of_arguments_part2(Sequence_list_of_arguments_part2Context ctx){
		super.visitSequence_list_of_arguments_part2(ctx);
		ctx.extendedContext = new Sequence_list_of_arguments_part2ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_actual_arg(Sequence_actual_argContext ctx){
		super.visitSequence_actual_arg(ctx);
		ctx.extendedContext = new Sequence_actual_argContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBoolean_abbrev(Boolean_abbrevContext ctx){
		super.visitBoolean_abbrev(ctx);
		ctx.extendedContext = new Boolean_abbrevContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_abbrev(Sequence_abbrevContext ctx){
		super.visitSequence_abbrev(ctx);
		ctx.extendedContext = new Sequence_abbrevContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConsecutive_repetition(Consecutive_repetitionContext ctx){
		super.visitConsecutive_repetition(ctx);
		ctx.extendedContext = new Consecutive_repetitionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNon_consecutive_repetition(Non_consecutive_repetitionContext ctx){
		super.visitNon_consecutive_repetition(ctx);
		ctx.extendedContext = new Non_consecutive_repetitionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGoto_repetition(Goto_repetitionContext ctx){
		super.visitGoto_repetition(ctx);
		ctx.extendedContext = new Goto_repetitionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_or_range_expression(Const_or_range_expressionContext ctx){
		super.visitConst_or_range_expression(ctx);
		ctx.extendedContext = new Const_or_range_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCycle_delay_const_range_expression(Cycle_delay_const_range_expressionContext ctx){
		super.visitCycle_delay_const_range_expression(ctx);
		ctx.extendedContext = new Cycle_delay_const_range_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_or_dist(Expression_or_distContext ctx){
		super.visitExpression_or_dist(ctx);
		ctx.extendedContext = new Expression_or_distContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssertion_variable_declaration(Assertion_variable_declarationContext ctx){
		super.visitAssertion_variable_declaration(ctx);
		ctx.extendedContext = new Assertion_variable_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLet_declaration(Let_declarationContext ctx){
		super.visitLet_declaration(ctx);
		ctx.extendedContext = new Let_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLet_identifier(Let_identifierContext ctx){
		super.visitLet_identifier(ctx);
		ctx.extendedContext = new Let_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLet_port_list(Let_port_listContext ctx){
		super.visitLet_port_list(ctx);
		ctx.extendedContext = new Let_port_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLet_port_item(Let_port_itemContext ctx){
		super.visitLet_port_item(ctx);
		ctx.extendedContext = new Let_port_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLet_formal_type(Let_formal_typeContext ctx){
		super.visitLet_formal_type(ctx);
		ctx.extendedContext = new Let_formal_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLet_expression(Let_expressionContext ctx){
		super.visitLet_expression(ctx);
		ctx.extendedContext = new Let_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLet_list_of_arguments(Let_list_of_argumentsContext ctx){
		super.visitLet_list_of_arguments(ctx);
		ctx.extendedContext = new Let_list_of_argumentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLet_list_of_arguments_part1(Let_list_of_arguments_part1Context ctx){
		super.visitLet_list_of_arguments_part1(ctx);
		ctx.extendedContext = new Let_list_of_arguments_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLet_list_of_arguments_part2(Let_list_of_arguments_part2Context ctx){
		super.visitLet_list_of_arguments_part2(ctx);
		ctx.extendedContext = new Let_list_of_arguments_part2ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLet_actual_arg(Let_actual_argContext ctx){
		super.visitLet_actual_arg(ctx);
		ctx.extendedContext = new Let_actual_argContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCovergroup_declaration(Covergroup_declarationContext ctx){
		super.visitCovergroup_declaration(ctx);
		ctx.extendedContext = new Covergroup_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCoverage_spec_or_option(Coverage_spec_or_optionContext ctx){
		super.visitCoverage_spec_or_option(ctx);
		ctx.extendedContext = new Coverage_spec_or_optionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCoverage_option(Coverage_optionContext ctx){
		super.visitCoverage_option(ctx);
		ctx.extendedContext = new Coverage_optionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCoverage_spec(Coverage_specContext ctx){
		super.visitCoverage_spec(ctx);
		ctx.extendedContext = new Coverage_specContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCoverage_event(Coverage_eventContext ctx){
		super.visitCoverage_event(ctx);
		ctx.extendedContext = new Coverage_eventContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBlock_event_expression(Block_event_expressionContext ctx){
		super.visitBlock_event_expression(ctx);
		ctx.extendedContext = new Block_event_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_btf_identifier(Hierarchical_btf_identifierContext ctx){
		super.visitHierarchical_btf_identifier(ctx);
		ctx.extendedContext = new Hierarchical_btf_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCover_point(Cover_pointContext ctx){
		super.visitCover_point(ctx);
		ctx.extendedContext = new Cover_pointContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBins_or_empty(Bins_or_emptyContext ctx){
		super.visitBins_or_empty(ctx);
		ctx.extendedContext = new Bins_or_emptyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBins_or_options(Bins_or_optionsContext ctx){
		super.visitBins_or_options(ctx);
		ctx.extendedContext = new Bins_or_optionsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBins_or_options_part1(Bins_or_options_part1Context ctx){
		super.visitBins_or_options_part1(ctx);
		ctx.extendedContext = new Bins_or_options_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBins_keyword(Bins_keywordContext ctx){
		super.visitBins_keyword(ctx);
		ctx.extendedContext = new Bins_keywordContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRange_list(Range_listContext ctx){
		super.visitRange_list(ctx);
		ctx.extendedContext = new Range_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTrans_list(Trans_listContext ctx){
		super.visitTrans_list(ctx);
		ctx.extendedContext = new Trans_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTrans_set(Trans_setContext ctx){
		super.visitTrans_set(ctx);
		ctx.extendedContext = new Trans_setContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTrans_range_list(Trans_range_listContext ctx){
		super.visitTrans_range_list(ctx);
		ctx.extendedContext = new Trans_range_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTrans_item(Trans_itemContext ctx){
		super.visitTrans_item(ctx);
		ctx.extendedContext = new Trans_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRepeat_range(Repeat_rangeContext ctx){
		super.visitRepeat_range(ctx);
		ctx.extendedContext = new Repeat_rangeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCover_cross(Cover_crossContext ctx){
		super.visitCover_cross(ctx);
		ctx.extendedContext = new Cover_crossContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_coverpoints(List_of_coverpointsContext ctx){
		super.visitList_of_coverpoints(ctx);
		ctx.extendedContext = new List_of_coverpointsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCross_item(Cross_itemContext ctx){
		super.visitCross_item(ctx);
		ctx.extendedContext = new Cross_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSelect_bins_or_empty(Select_bins_or_emptyContext ctx){
		super.visitSelect_bins_or_empty(ctx);
		ctx.extendedContext = new Select_bins_or_emptyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBins_selection_or_option(Bins_selection_or_optionContext ctx){
		super.visitBins_selection_or_option(ctx);
		ctx.extendedContext = new Bins_selection_or_optionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBins_selection(Bins_selectionContext ctx){
		super.visitBins_selection(ctx);
		ctx.extendedContext = new Bins_selectionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSelect_expression(Select_expressionContext ctx){
		super.visitSelect_expression(ctx);
		ctx.extendedContext = new Select_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSelect_expression_part1(Select_expression_part1Context ctx){
		super.visitSelect_expression_part1(ctx);
		ctx.extendedContext = new Select_expression_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSelect_condition(Select_conditionContext ctx){
		super.visitSelect_condition(ctx);
		ctx.extendedContext = new Select_conditionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBins_expression(Bins_expressionContext ctx){
		super.visitBins_expression(ctx);
		ctx.extendedContext = new Bins_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOpen_range_list(Open_range_listContext ctx){
		super.visitOpen_range_list(ctx);
		ctx.extendedContext = new Open_range_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOpen_value_range(Open_value_rangeContext ctx){
		super.visitOpen_value_range(ctx);
		ctx.extendedContext = new Open_value_rangeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGate_instantiation(Gate_instantiationContext ctx){
		super.visitGate_instantiation(ctx);
		ctx.extendedContext = new Gate_instantiationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCmos_switch_instance(Cmos_switch_instanceContext ctx){
		super.visitCmos_switch_instance(ctx);
		ctx.extendedContext = new Cmos_switch_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEnable_gate_instance(Enable_gate_instanceContext ctx){
		super.visitEnable_gate_instance(ctx);
		ctx.extendedContext = new Enable_gate_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMos_switch_instance(Mos_switch_instanceContext ctx){
		super.visitMos_switch_instance(ctx);
		ctx.extendedContext = new Mos_switch_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitN_input_gate_instance(N_input_gate_instanceContext ctx){
		super.visitN_input_gate_instance(ctx);
		ctx.extendedContext = new N_input_gate_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitN_output_gate_instance(N_output_gate_instanceContext ctx){
		super.visitN_output_gate_instance(ctx);
		ctx.extendedContext = new N_output_gate_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPass_switch_instance(Pass_switch_instanceContext ctx){
		super.visitPass_switch_instance(ctx);
		ctx.extendedContext = new Pass_switch_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPass_enable_switch_instance(Pass_enable_switch_instanceContext ctx){
		super.visitPass_enable_switch_instance(ctx);
		ctx.extendedContext = new Pass_enable_switch_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPull_gate_instance(Pull_gate_instanceContext ctx){
		super.visitPull_gate_instance(ctx);
		ctx.extendedContext = new Pull_gate_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPulldown_strength(Pulldown_strengthContext ctx){
		super.visitPulldown_strength(ctx);
		ctx.extendedContext = new Pulldown_strengthContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPullup_strength(Pullup_strengthContext ctx){
		super.visitPullup_strength(ctx);
		ctx.extendedContext = new Pullup_strengthContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEnable_terminal(Enable_terminalContext ctx){
		super.visitEnable_terminal(ctx);
		ctx.extendedContext = new Enable_terminalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInout_terminal(Inout_terminalContext ctx){
		super.visitInout_terminal(ctx);
		ctx.extendedContext = new Inout_terminalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInput_terminal(Input_terminalContext ctx){
		super.visitInput_terminal(ctx);
		ctx.extendedContext = new Input_terminalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNcontrol_terminal(Ncontrol_terminalContext ctx){
		super.visitNcontrol_terminal(ctx);
		ctx.extendedContext = new Ncontrol_terminalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOutput_terminal(Output_terminalContext ctx){
		super.visitOutput_terminal(ctx);
		ctx.extendedContext = new Output_terminalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPcontrol_terminal(Pcontrol_terminalContext ctx){
		super.visitPcontrol_terminal(ctx);
		ctx.extendedContext = new Pcontrol_terminalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCmos_switchtype(Cmos_switchtypeContext ctx){
		super.visitCmos_switchtype(ctx);
		ctx.extendedContext = new Cmos_switchtypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEnable_gatetype(Enable_gatetypeContext ctx){
		super.visitEnable_gatetype(ctx);
		ctx.extendedContext = new Enable_gatetypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMos_switchtype(Mos_switchtypeContext ctx){
		super.visitMos_switchtype(ctx);
		ctx.extendedContext = new Mos_switchtypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitN_input_gatetype(N_input_gatetypeContext ctx){
		super.visitN_input_gatetype(ctx);
		ctx.extendedContext = new N_input_gatetypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitN_output_gatetype(N_output_gatetypeContext ctx){
		super.visitN_output_gatetype(ctx);
		ctx.extendedContext = new N_output_gatetypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPass_en_switchtype(Pass_en_switchtypeContext ctx){
		super.visitPass_en_switchtype(ctx);
		ctx.extendedContext = new Pass_en_switchtypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPass_switchtype(Pass_switchtypeContext ctx){
		super.visitPass_switchtype(ctx);
		ctx.extendedContext = new Pass_switchtypeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_instantiation(Module_instantiationContext ctx){
		super.visitModule_instantiation(ctx);
		ctx.extendedContext = new Module_instantiationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParameter_value_assignment(Parameter_value_assignmentContext ctx){
		super.visitParameter_value_assignment(ctx);
		ctx.extendedContext = new Parameter_value_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_parameter_assignments(List_of_parameter_assignmentsContext ctx){
		super.visitList_of_parameter_assignments(ctx);
		ctx.extendedContext = new List_of_parameter_assignmentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOrdered_parameter_assignment(Ordered_parameter_assignmentContext ctx){
		super.visitOrdered_parameter_assignment(ctx);
		ctx.extendedContext = new Ordered_parameter_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNamed_parameter_assignment(Named_parameter_assignmentContext ctx){
		super.visitNamed_parameter_assignment(ctx);
		ctx.extendedContext = new Named_parameter_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_instance(Hierarchical_instanceContext ctx){
		super.visitHierarchical_instance(ctx);
		ctx.extendedContext = new Hierarchical_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitName_of_instance(Name_of_instanceContext ctx){
		super.visitName_of_instance(ctx);
		ctx.extendedContext = new Name_of_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_connections(List_of_port_connectionsContext ctx){
		super.visitList_of_port_connections(ctx);
		ctx.extendedContext = new List_of_port_connectionsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOrdered_port_connection(Ordered_port_connectionContext ctx){
		super.visitOrdered_port_connection(ctx);
		ctx.extendedContext = new Ordered_port_connectionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNamed_port_connection(Named_port_connectionContext ctx){
		super.visitNamed_port_connection(ctx);
		ctx.extendedContext = new Named_port_connectionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterface_instantiation(Interface_instantiationContext ctx){
		super.visitInterface_instantiation(ctx);
		ctx.extendedContext = new Interface_instantiationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProgram_instantiation(Program_instantiationContext ctx){
		super.visitProgram_instantiation(ctx);
		ctx.extendedContext = new Program_instantiationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitChecker_instantiation(Checker_instantiationContext ctx){
		super.visitChecker_instantiation(ctx);
		ctx.extendedContext = new Checker_instantiationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_checker_port_connections(List_of_checker_port_connectionsContext ctx){
		super.visitList_of_checker_port_connections(ctx);
		ctx.extendedContext = new List_of_checker_port_connectionsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOrdered_checker_port_connection(Ordered_checker_port_connectionContext ctx){
		super.visitOrdered_checker_port_connection(ctx);
		ctx.extendedContext = new Ordered_checker_port_connectionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNamed_checker_port_connection(Named_checker_port_connectionContext ctx){
		super.visitNamed_checker_port_connection(ctx);
		ctx.extendedContext = new Named_checker_port_connectionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenerate_region(Generate_regionContext ctx){
		super.visitGenerate_region(ctx);
		ctx.extendedContext = new Generate_regionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLoop_generate_construct(Loop_generate_constructContext ctx){
		super.visitLoop_generate_construct(ctx);
		ctx.extendedContext = new Loop_generate_constructContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenvar_initialization(Genvar_initializationContext ctx){
		super.visitGenvar_initialization(ctx);
		ctx.extendedContext = new Genvar_initializationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_generate_construct(Conditional_generate_constructContext ctx){
		super.visitConditional_generate_construct(ctx);
		ctx.extendedContext = new Conditional_generate_constructContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIf_generate_construct(If_generate_constructContext ctx){
		super.visitIf_generate_construct(ctx);
		ctx.extendedContext = new If_generate_constructContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_generate_construct(Case_generate_constructContext ctx){
		super.visitCase_generate_construct(ctx);
		ctx.extendedContext = new Case_generate_constructContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_generate_item(Case_generate_itemContext ctx){
		super.visitCase_generate_item(ctx);
		ctx.extendedContext = new Case_generate_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenerate_block(Generate_blockContext ctx){
		super.visitGenerate_block(ctx);
		ctx.extendedContext = new Generate_blockContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenerate_block_part1(Generate_block_part1Context ctx){
		super.visitGenerate_block_part1(ctx);
		ctx.extendedContext = new Generate_block_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenerate_block_part2(Generate_block_part2Context ctx){
		super.visitGenerate_block_part2(ctx);
		ctx.extendedContext = new Generate_block_part2ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenerate_block_part3(Generate_block_part3Context ctx){
		super.visitGenerate_block_part3(ctx);
		ctx.extendedContext = new Generate_block_part3ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenerate_item(Generate_itemContext ctx){
		super.visitGenerate_item(ctx);
		ctx.extendedContext = new Generate_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_nonansi_declaration(Udp_nonansi_declarationContext ctx){
		super.visitUdp_nonansi_declaration(ctx);
		ctx.extendedContext = new Udp_nonansi_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenvar_iteration(Genvar_iterationContext ctx){
		super.visitGenvar_iteration(ctx);
		ctx.extendedContext = new Genvar_iterationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_ansi_declaration(Udp_ansi_declarationContext ctx){
		super.visitUdp_ansi_declaration(ctx);
		ctx.extendedContext = new Udp_ansi_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_declaration(Udp_declarationContext ctx){
		super.visitUdp_declaration(ctx);
		ctx.extendedContext = new Udp_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_port_list(Udp_port_listContext ctx){
		super.visitUdp_port_list(ctx);
		ctx.extendedContext = new Udp_port_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_declaration_port_list(Udp_declaration_port_listContext ctx){
		super.visitUdp_declaration_port_list(ctx);
		ctx.extendedContext = new Udp_declaration_port_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_port_declaration(Udp_port_declarationContext ctx){
		super.visitUdp_port_declaration(ctx);
		ctx.extendedContext = new Udp_port_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_output_declaration(Udp_output_declarationContext ctx){
		super.visitUdp_output_declaration(ctx);
		ctx.extendedContext = new Udp_output_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_input_declaration(Udp_input_declarationContext ctx){
		super.visitUdp_input_declaration(ctx);
		ctx.extendedContext = new Udp_input_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_reg_declaration(Udp_reg_declarationContext ctx){
		super.visitUdp_reg_declaration(ctx);
		ctx.extendedContext = new Udp_reg_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_body(Udp_bodyContext ctx){
		super.visitUdp_body(ctx);
		ctx.extendedContext = new Udp_bodyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCombinational_body(Combinational_bodyContext ctx){
		super.visitCombinational_body(ctx);
		ctx.extendedContext = new Combinational_bodyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCombinational_entry(Combinational_entryContext ctx){
		super.visitCombinational_entry(ctx);
		ctx.extendedContext = new Combinational_entryContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequential_body(Sequential_bodyContext ctx){
		super.visitSequential_body(ctx);
		ctx.extendedContext = new Sequential_bodyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_initial_statement(Udp_initial_statementContext ctx){
		super.visitUdp_initial_statement(ctx);
		ctx.extendedContext = new Udp_initial_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInit_val(Init_valContext ctx){
		super.visitInit_val(ctx);
		ctx.extendedContext = new Init_valContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequential_entry(Sequential_entryContext ctx){
		super.visitSequential_entry(ctx);
		ctx.extendedContext = new Sequential_entryContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSeq_input_list(Seq_input_listContext ctx){
		super.visitSeq_input_list(ctx);
		ctx.extendedContext = new Seq_input_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLevel_input_list(Level_input_listContext ctx){
		super.visitLevel_input_list(ctx);
		ctx.extendedContext = new Level_input_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEdge_input_list(Edge_input_listContext ctx){
		super.visitEdge_input_list(ctx);
		ctx.extendedContext = new Edge_input_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEdge_input_list_part1(Edge_input_list_part1Context ctx){
		super.visitEdge_input_list_part1(ctx);
		ctx.extendedContext = new Edge_input_list_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEdge_indicator(Edge_indicatorContext ctx){
		super.visitEdge_indicator(ctx);
		ctx.extendedContext = new Edge_indicatorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCurrent_state(Current_stateContext ctx){
		super.visitCurrent_state(ctx);
		ctx.extendedContext = new Current_stateContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNext_state(Next_stateContext ctx){
		super.visitNext_state(ctx);
		ctx.extendedContext = new Next_stateContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOutput_symbol(Output_symbolContext ctx){
		super.visitOutput_symbol(ctx);
		ctx.extendedContext = new Output_symbolContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLevel_symbol(Level_symbolContext ctx){
		super.visitLevel_symbol(ctx);
		ctx.extendedContext = new Level_symbolContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEdge_symbol(Edge_symbolContext ctx){
		super.visitEdge_symbol(ctx);
		ctx.extendedContext = new Edge_symbolContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_instantiation(Udp_instantiationContext ctx){
		super.visitUdp_instantiation(ctx);
		ctx.extendedContext = new Udp_instantiationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_instance(Udp_instanceContext ctx){
		super.visitUdp_instance(ctx);
		ctx.extendedContext = new Udp_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitContinuous_assign(Continuous_assignContext ctx){
		super.visitContinuous_assign(ctx);
		ctx.extendedContext = new Continuous_assignContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_net_assignments(List_of_net_assignmentsContext ctx){
		super.visitList_of_net_assignments(ctx);
		ctx.extendedContext = new List_of_net_assignmentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_variable_assignments(List_of_variable_assignmentsContext ctx){
		super.visitList_of_variable_assignments(ctx);
		ctx.extendedContext = new List_of_variable_assignmentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_alias(Net_aliasContext ctx){
		super.visitNet_alias(ctx);
		ctx.extendedContext = new Net_aliasContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_assignment(Net_assignmentContext ctx){
		super.visitNet_assignment(ctx);
		ctx.extendedContext = new Net_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInitial_construct(Initial_constructContext ctx){
		super.visitInitial_construct(ctx);
		ctx.extendedContext = new Initial_constructContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAlways_construct(Always_constructContext ctx){
		super.visitAlways_construct(ctx);
		ctx.extendedContext = new Always_constructContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAlways_keyword(Always_keywordContext ctx){
		super.visitAlways_keyword(ctx);
		ctx.extendedContext = new Always_keywordContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFinal_construct(Final_constructContext ctx){
		super.visitFinal_construct(ctx);
		ctx.extendedContext = new Final_constructContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBlocking_assignment(Blocking_assignmentContext ctx){
		super.visitBlocking_assignment(ctx);
		ctx.extendedContext = new Blocking_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOperator_assignment(Operator_assignmentContext ctx){
		super.visitOperator_assignment(ctx);
		ctx.extendedContext = new Operator_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssignment_operator(Assignment_operatorContext ctx){
		super.visitAssignment_operator(ctx);
		ctx.extendedContext = new Assignment_operatorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNonblocking_assignment(Nonblocking_assignmentContext ctx){
		super.visitNonblocking_assignment(ctx);
		ctx.extendedContext = new Nonblocking_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProcedural_continuous_assignment(Procedural_continuous_assignmentContext ctx){
		super.visitProcedural_continuous_assignment(ctx);
		ctx.extendedContext = new Procedural_continuous_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAction_block(Action_blockContext ctx){
		super.visitAction_block(ctx);
		ctx.extendedContext = new Action_blockContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSeq_block(Seq_blockContext ctx){
		super.visitSeq_block(ctx);
		ctx.extendedContext = new Seq_blockContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSeq_block_part1(Seq_block_part1Context ctx){
		super.visitSeq_block_part1(ctx);
		ctx.extendedContext = new Seq_block_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPar_block(Par_blockContext ctx){
		super.visitPar_block(ctx);
		ctx.extendedContext = new Par_blockContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPar_block_part1(Par_block_part1Context ctx){
		super.visitPar_block_part1(ctx);
		ctx.extendedContext = new Par_block_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitJoin_keyword(Join_keywordContext ctx){
		super.visitJoin_keyword(ctx);
		ctx.extendedContext = new Join_keywordContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStatement_or_null(Statement_or_nullContext ctx){
		super.visitStatement_or_null(ctx);
		ctx.extendedContext = new Statement_or_nullContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStatement(StatementContext ctx){
		super.visitStatement(ctx);
		ctx.extendedContext = new StatementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStatement_item(Statement_itemContext ctx){
		super.visitStatement_item(ctx);
		ctx.extendedContext = new Statement_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFunction_statement(Function_statementContext ctx){
		super.visitFunction_statement(ctx);
		ctx.extendedContext = new Function_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFunction_statement_or_null(Function_statement_or_nullContext ctx){
		super.visitFunction_statement_or_null(ctx);
		ctx.extendedContext = new Function_statement_or_nullContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVariable_identifier_list(Variable_identifier_listContext ctx){
		super.visitVariable_identifier_list(ctx);
		ctx.extendedContext = new Variable_identifier_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProcedural_timing_control_statement(Procedural_timing_control_statementContext ctx){
		super.visitProcedural_timing_control_statement(ctx);
		ctx.extendedContext = new Procedural_timing_control_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDelay_or_event_control(Delay_or_event_controlContext ctx){
		super.visitDelay_or_event_control(ctx);
		ctx.extendedContext = new Delay_or_event_controlContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDelay_control(Delay_controlContext ctx){
		super.visitDelay_control(ctx);
		ctx.extendedContext = new Delay_controlContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEvent_control(Event_controlContext ctx){
		super.visitEvent_control(ctx);
		ctx.extendedContext = new Event_controlContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEvent_expression(Event_expressionContext ctx){
		super.visitEvent_expression(ctx);
		ctx.extendedContext = new Event_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProcedural_timing_control(Procedural_timing_controlContext ctx){
		super.visitProcedural_timing_control(ctx);
		ctx.extendedContext = new Procedural_timing_controlContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitJump_statement(Jump_statementContext ctx){
		super.visitJump_statement(ctx);
		ctx.extendedContext = new Jump_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWait_statement(Wait_statementContext ctx){
		super.visitWait_statement(ctx);
		ctx.extendedContext = new Wait_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEvent_trigger(Event_triggerContext ctx){
		super.visitEvent_trigger(ctx);
		ctx.extendedContext = new Event_triggerContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDisable_statement(Disable_statementContext ctx){
		super.visitDisable_statement(ctx);
		ctx.extendedContext = new Disable_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement(Conditional_statementContext ctx){
		super.visitConditional_statement(ctx);
		ctx.extendedContext = new Conditional_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnique_priority(Unique_priorityContext ctx){
		super.visitUnique_priority(ctx);
		ctx.extendedContext = new Unique_priorityContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_statement(Case_statementContext ctx){
		super.visitCase_statement(ctx);
		ctx.extendedContext = new Case_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_keyword(Case_keywordContext ctx){
		super.visitCase_keyword(ctx);
		ctx.extendedContext = new Case_keywordContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_expression(Case_expressionContext ctx){
		super.visitCase_expression(ctx);
		ctx.extendedContext = new Case_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_item(Case_itemContext ctx){
		super.visitCase_item(ctx);
		ctx.extendedContext = new Case_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_pattern_item(Case_pattern_itemContext ctx){
		super.visitCase_pattern_item(ctx);
		ctx.extendedContext = new Case_pattern_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_inside_item(Case_inside_itemContext ctx){
		super.visitCase_inside_item(ctx);
		ctx.extendedContext = new Case_inside_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCase_item_expression(Case_item_expressionContext ctx){
		super.visitCase_item_expression(ctx);
		ctx.extendedContext = new Case_item_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRandcase_statement(Randcase_statementContext ctx){
		super.visitRandcase_statement(ctx);
		ctx.extendedContext = new Randcase_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRandcase_item(Randcase_itemContext ctx){
		super.visitRandcase_item(ctx);
		ctx.extendedContext = new Randcase_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPattern(PatternContext ctx){
		super.visitPattern(ctx);
		ctx.extendedContext = new PatternContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern(Assignment_patternContext ctx){
		super.visitAssignment_pattern(ctx);
		ctx.extendedContext = new Assignment_patternContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStructure_pattern_key(Structure_pattern_keyContext ctx){
		super.visitStructure_pattern_key(ctx);
		ctx.extendedContext = new Structure_pattern_keyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitArray_pattern_key(Array_pattern_keyContext ctx){
		super.visitArray_pattern_key(ctx);
		ctx.extendedContext = new Array_pattern_keyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern_key(Assignment_pattern_keyContext ctx){
		super.visitAssignment_pattern_key(ctx);
		ctx.extendedContext = new Assignment_pattern_keyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVariable_assignment(Variable_assignmentContext ctx){
		super.visitVariable_assignment(ctx);
		ctx.extendedContext = new Variable_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern_expression(Assignment_pattern_expressionContext ctx){
		super.visitAssignment_pattern_expression(ctx);
		ctx.extendedContext = new Assignment_pattern_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern_expression_type(Assignment_pattern_expression_typeContext ctx){
		super.visitAssignment_pattern_expression_type(ctx);
		ctx.extendedContext = new Assignment_pattern_expression_typeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_assignment_pattern_expression(Constant_assignment_pattern_expressionContext ctx){
		super.visitConstant_assignment_pattern_expression(ctx);
		ctx.extendedContext = new Constant_assignment_pattern_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern_net_lvalue(Assignment_pattern_net_lvalueContext ctx){
		super.visitAssignment_pattern_net_lvalue(ctx);
		ctx.extendedContext = new Assignment_pattern_net_lvalueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssignment_pattern_variable_lvalue(Assignment_pattern_variable_lvalueContext ctx){
		super.visitAssignment_pattern_variable_lvalue(ctx);
		ctx.extendedContext = new Assignment_pattern_variable_lvalueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLoop_statement(Loop_statementContext ctx){
		super.visitLoop_statement(ctx);
		ctx.extendedContext = new Loop_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFor_initialization(For_initializationContext ctx){
		super.visitFor_initialization(ctx);
		ctx.extendedContext = new For_initializationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFor_variable_declaration(For_variable_declarationContext ctx){
		super.visitFor_variable_declaration(ctx);
		ctx.extendedContext = new For_variable_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFor_step(For_stepContext ctx){
		super.visitFor_step(ctx);
		ctx.extendedContext = new For_stepContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFor_step_assignment(For_step_assignmentContext ctx){
		super.visitFor_step_assignment(ctx);
		ctx.extendedContext = new For_step_assignmentContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLoop_variables(Loop_variablesContext ctx){
		super.visitLoop_variables(ctx);
		ctx.extendedContext = new Loop_variablesContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLoop_variables_part1(Loop_variables_part1Context ctx){
		super.visitLoop_variables_part1(ctx);
		ctx.extendedContext = new Loop_variables_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSubroutine_call_statement(Subroutine_call_statementContext ctx){
		super.visitSubroutine_call_statement(ctx);
		ctx.extendedContext = new Subroutine_call_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssertion_item(Assertion_itemContext ctx){
		super.visitAssertion_item(ctx);
		ctx.extendedContext = new Assertion_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDeferred_immediate_assertion_item(Deferred_immediate_assertion_itemContext ctx){
		super.visitDeferred_immediate_assertion_item(ctx);
		ctx.extendedContext = new Deferred_immediate_assertion_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProcedural_assertion_statement(Procedural_assertion_statementContext ctx){
		super.visitProcedural_assertion_statement(ctx);
		ctx.extendedContext = new Procedural_assertion_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitImmediate_assertion_statement(Immediate_assertion_statementContext ctx){
		super.visitImmediate_assertion_statement(ctx);
		ctx.extendedContext = new Immediate_assertion_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_immediate_assertion_statement(Simple_immediate_assertion_statementContext ctx){
		super.visitSimple_immediate_assertion_statement(ctx);
		ctx.extendedContext = new Simple_immediate_assertion_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_immediate_assert_statement(Simple_immediate_assert_statementContext ctx){
		super.visitSimple_immediate_assert_statement(ctx);
		ctx.extendedContext = new Simple_immediate_assert_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_immediate_assume_statement(Simple_immediate_assume_statementContext ctx){
		super.visitSimple_immediate_assume_statement(ctx);
		ctx.extendedContext = new Simple_immediate_assume_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_immediate_cover_statement(Simple_immediate_cover_statementContext ctx){
		super.visitSimple_immediate_cover_statement(ctx);
		ctx.extendedContext = new Simple_immediate_cover_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDeferred_immediate_assertion_statement(Deferred_immediate_assertion_statementContext ctx){
		super.visitDeferred_immediate_assertion_statement(ctx);
		ctx.extendedContext = new Deferred_immediate_assertion_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDeferred_immediate_assert_statement(Deferred_immediate_assert_statementContext ctx){
		super.visitDeferred_immediate_assert_statement(ctx);
		ctx.extendedContext = new Deferred_immediate_assert_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDeferred_immediate_assume_statement(Deferred_immediate_assume_statementContext ctx){
		super.visitDeferred_immediate_assume_statement(ctx);
		ctx.extendedContext = new Deferred_immediate_assume_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDeferred_immediate_cover_statement(Deferred_immediate_cover_statementContext ctx){
		super.visitDeferred_immediate_cover_statement(ctx);
		ctx.extendedContext = new Deferred_immediate_cover_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClocking_declaration(Clocking_declarationContext ctx){
		super.visitClocking_declaration(ctx);
		ctx.extendedContext = new Clocking_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClocking_declaration_part1(Clocking_declaration_part1Context ctx){
		super.visitClocking_declaration_part1(ctx);
		ctx.extendedContext = new Clocking_declaration_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClocking_event(Clocking_eventContext ctx){
		super.visitClocking_event(ctx);
		ctx.extendedContext = new Clocking_eventContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClocking_item(Clocking_itemContext ctx){
		super.visitClocking_item(ctx);
		ctx.extendedContext = new Clocking_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefault_skew(Default_skewContext ctx){
		super.visitDefault_skew(ctx);
		ctx.extendedContext = new Default_skewContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClocking_direction(Clocking_directionContext ctx){
		super.visitClocking_direction(ctx);
		ctx.extendedContext = new Clocking_directionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClocking_direction_part1(Clocking_direction_part1Context ctx){
		super.visitClocking_direction_part1(ctx);
		ctx.extendedContext = new Clocking_direction_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_clocking_decl_assign(List_of_clocking_decl_assignContext ctx){
		super.visitList_of_clocking_decl_assign(ctx);
		ctx.extendedContext = new List_of_clocking_decl_assignContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClocking_decl_assign(Clocking_decl_assignContext ctx){
		super.visitClocking_decl_assign(ctx);
		ctx.extendedContext = new Clocking_decl_assignContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClocking_skew(Clocking_skewContext ctx){
		super.visitClocking_skew(ctx);
		ctx.extendedContext = new Clocking_skewContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClocking_drive(Clocking_driveContext ctx){
		super.visitClocking_drive(ctx);
		ctx.extendedContext = new Clocking_driveContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCycle_delay(Cycle_delayContext ctx){
		super.visitCycle_delay(ctx);
		ctx.extendedContext = new Cycle_delayContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClockvar(ClockvarContext ctx){
		super.visitClockvar(ctx);
		ctx.extendedContext = new ClockvarContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClockvar_expression(Clockvar_expressionContext ctx){
		super.visitClockvar_expression(ctx);
		ctx.extendedContext = new Clockvar_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRandsequence_statement(Randsequence_statementContext ctx){
		super.visitRandsequence_statement(ctx);
		ctx.extendedContext = new Randsequence_statementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProduction(ProductionContext ctx){
		super.visitProduction(ctx);
		ctx.extendedContext = new ProductionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRs_rule(Rs_ruleContext ctx){
		super.visitRs_rule(ctx);
		ctx.extendedContext = new Rs_ruleContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRs_production_list(Rs_production_listContext ctx){
		super.visitRs_production_list(ctx);
		ctx.extendedContext = new Rs_production_listContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWeight_specification(Weight_specificationContext ctx){
		super.visitWeight_specification(ctx);
		ctx.extendedContext = new Weight_specificationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRs_code_block(Rs_code_blockContext ctx){
		super.visitRs_code_block(ctx);
		ctx.extendedContext = new Rs_code_blockContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRs_prod(Rs_prodContext ctx){
		super.visitRs_prod(ctx);
		ctx.extendedContext = new Rs_prodContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProduction_item(Production_itemContext ctx){
		super.visitProduction_item(ctx);
		ctx.extendedContext = new Production_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRs_if_else(Rs_if_elseContext ctx){
		super.visitRs_if_else(ctx);
		ctx.extendedContext = new Rs_if_elseContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRs_repeat(Rs_repeatContext ctx){
		super.visitRs_repeat(ctx);
		ctx.extendedContext = new Rs_repeatContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRs_case(Rs_caseContext ctx){
		super.visitRs_case(ctx);
		ctx.extendedContext = new Rs_caseContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRs_case_item(Rs_case_itemContext ctx){
		super.visitRs_case_item(ctx);
		ctx.extendedContext = new Rs_case_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSpecify_block(Specify_blockContext ctx){
		super.visitSpecify_block(ctx);
		ctx.extendedContext = new Specify_blockContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSpecify_item(Specify_itemContext ctx){
		super.visitSpecify_item(ctx);
		ctx.extendedContext = new Specify_itemContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPulsestyle_declaration(Pulsestyle_declarationContext ctx){
		super.visitPulsestyle_declaration(ctx);
		ctx.extendedContext = new Pulsestyle_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitShowcancelled_declaration(Showcancelled_declarationContext ctx){
		super.visitShowcancelled_declaration(ctx);
		ctx.extendedContext = new Showcancelled_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPath_declaration(Path_declarationContext ctx){
		super.visitPath_declaration(ctx);
		ctx.extendedContext = new Path_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_path_declaration(Simple_path_declarationContext ctx){
		super.visitSimple_path_declaration(ctx);
		ctx.extendedContext = new Simple_path_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParallel_path_description(Parallel_path_descriptionContext ctx){
		super.visitParallel_path_description(ctx);
		ctx.extendedContext = new Parallel_path_descriptionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFull_path_description(Full_path_descriptionContext ctx){
		super.visitFull_path_description(ctx);
		ctx.extendedContext = new Full_path_descriptionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_path_inputs(List_of_path_inputsContext ctx){
		super.visitList_of_path_inputs(ctx);
		ctx.extendedContext = new List_of_path_inputsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_path_outputs(List_of_path_outputsContext ctx){
		super.visitList_of_path_outputs(ctx);
		ctx.extendedContext = new List_of_path_outputsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSpecify_input_terminal_descriptor(Specify_input_terminal_descriptorContext ctx){
		super.visitSpecify_input_terminal_descriptor(ctx);
		ctx.extendedContext = new Specify_input_terminal_descriptorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSpecify_output_terminal_descriptor(Specify_output_terminal_descriptorContext ctx){
		super.visitSpecify_output_terminal_descriptor(ctx);
		ctx.extendedContext = new Specify_output_terminal_descriptorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInput_identifier(Input_identifierContext ctx){
		super.visitInput_identifier(ctx);
		ctx.extendedContext = new Input_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOutput_identifier(Output_identifierContext ctx){
		super.visitOutput_identifier(ctx);
		ctx.extendedContext = new Output_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPath_delay_value(Path_delay_valueContext ctx){
		super.visitPath_delay_value(ctx);
		ctx.extendedContext = new Path_delay_valueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_path_delay_expressions(List_of_path_delay_expressionsContext ctx){
		super.visitList_of_path_delay_expressions(ctx);
		ctx.extendedContext = new List_of_path_delay_expressionsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitT_path_delay_expression(T_path_delay_expressionContext ctx){
		super.visitT_path_delay_expression(ctx);
		ctx.extendedContext = new T_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTrise_path_delay_expression(Trise_path_delay_expressionContext ctx){
		super.visitTrise_path_delay_expression(ctx);
		ctx.extendedContext = new Trise_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTfall_path_delay_expression(Tfall_path_delay_expressionContext ctx){
		super.visitTfall_path_delay_expression(ctx);
		ctx.extendedContext = new Tfall_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTz_path_delay_expression(Tz_path_delay_expressionContext ctx){
		super.visitTz_path_delay_expression(ctx);
		ctx.extendedContext = new Tz_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitT01_path_delay_expression(T01_path_delay_expressionContext ctx){
		super.visitT01_path_delay_expression(ctx);
		ctx.extendedContext = new T01_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitT10_path_delay_expression(T10_path_delay_expressionContext ctx){
		super.visitT10_path_delay_expression(ctx);
		ctx.extendedContext = new T10_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitT0z_path_delay_expression(T0z_path_delay_expressionContext ctx){
		super.visitT0z_path_delay_expression(ctx);
		ctx.extendedContext = new T0z_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTz1_path_delay_expression(Tz1_path_delay_expressionContext ctx){
		super.visitTz1_path_delay_expression(ctx);
		ctx.extendedContext = new Tz1_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitT1z_path_delay_expression(T1z_path_delay_expressionContext ctx){
		super.visitT1z_path_delay_expression(ctx);
		ctx.extendedContext = new T1z_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTz0_path_delay_expression(Tz0_path_delay_expressionContext ctx){
		super.visitTz0_path_delay_expression(ctx);
		ctx.extendedContext = new Tz0_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitT0x_path_delay_expression(T0x_path_delay_expressionContext ctx){
		super.visitT0x_path_delay_expression(ctx);
		ctx.extendedContext = new T0x_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTx1_path_delay_expression(Tx1_path_delay_expressionContext ctx){
		super.visitTx1_path_delay_expression(ctx);
		ctx.extendedContext = new Tx1_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitT1x_path_delay_expression(T1x_path_delay_expressionContext ctx){
		super.visitT1x_path_delay_expression(ctx);
		ctx.extendedContext = new T1x_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTx0_path_delay_expression(Tx0_path_delay_expressionContext ctx){
		super.visitTx0_path_delay_expression(ctx);
		ctx.extendedContext = new Tx0_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTxz_path_delay_expression(Txz_path_delay_expressionContext ctx){
		super.visitTxz_path_delay_expression(ctx);
		ctx.extendedContext = new Txz_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTzx_path_delay_expression(Tzx_path_delay_expressionContext ctx){
		super.visitTzx_path_delay_expression(ctx);
		ctx.extendedContext = new Tzx_path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPath_delay_expression(Path_delay_expressionContext ctx){
		super.visitPath_delay_expression(ctx);
		ctx.extendedContext = new Path_delay_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEdge_sensitive_path_declaration(Edge_sensitive_path_declarationContext ctx){
		super.visitEdge_sensitive_path_declaration(ctx);
		ctx.extendedContext = new Edge_sensitive_path_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParallel_edge_sensitive_path_description(Parallel_edge_sensitive_path_descriptionContext ctx){
		super.visitParallel_edge_sensitive_path_description(ctx);
		ctx.extendedContext = new Parallel_edge_sensitive_path_descriptionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFull_edge_sensitive_path_description(Full_edge_sensitive_path_descriptionContext ctx){
		super.visitFull_edge_sensitive_path_description(ctx);
		ctx.extendedContext = new Full_edge_sensitive_path_descriptionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitData_source_expression(Data_source_expressionContext ctx){
		super.visitData_source_expression(ctx);
		ctx.extendedContext = new Data_source_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEdge_identifier(Edge_identifierContext ctx){
		super.visitEdge_identifier(ctx);
		ctx.extendedContext = new Edge_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitState_dependent_path_declaration(State_dependent_path_declarationContext ctx){
		super.visitState_dependent_path_declaration(ctx);
		ctx.extendedContext = new State_dependent_path_declarationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPolarity_operator(Polarity_operatorContext ctx){
		super.visitPolarity_operator(ctx);
		ctx.extendedContext = new Polarity_operatorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSystem_timing_check(System_timing_checkContext ctx){
		super.visitSystem_timing_check(ctx);
		ctx.extendedContext = new System_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSetup_timing_check(Setup_timing_checkContext ctx){
		super.visitSetup_timing_check(ctx);
		ctx.extendedContext = new Setup_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHold_timing_check(Hold_timing_checkContext ctx){
		super.visitHold_timing_check(ctx);
		ctx.extendedContext = new Hold_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSetuphold_timing_check(Setuphold_timing_checkContext ctx){
		super.visitSetuphold_timing_check(ctx);
		ctx.extendedContext = new Setuphold_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRecovery_timing_check(Recovery_timing_checkContext ctx){
		super.visitRecovery_timing_check(ctx);
		ctx.extendedContext = new Recovery_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRemoval_timing_check(Removal_timing_checkContext ctx){
		super.visitRemoval_timing_check(ctx);
		ctx.extendedContext = new Removal_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRecrem_timing_check(Recrem_timing_checkContext ctx){
		super.visitRecrem_timing_check(ctx);
		ctx.extendedContext = new Recrem_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSkew_timing_check(Skew_timing_checkContext ctx){
		super.visitSkew_timing_check(ctx);
		ctx.extendedContext = new Skew_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTimeskew_timing_check(Timeskew_timing_checkContext ctx){
		super.visitTimeskew_timing_check(ctx);
		ctx.extendedContext = new Timeskew_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFullskew_timing_check(Fullskew_timing_checkContext ctx){
		super.visitFullskew_timing_check(ctx);
		ctx.extendedContext = new Fullskew_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPeriod_timing_check(Period_timing_checkContext ctx){
		super.visitPeriod_timing_check(ctx);
		ctx.extendedContext = new Period_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWidth_timing_check(Width_timing_checkContext ctx){
		super.visitWidth_timing_check(ctx);
		ctx.extendedContext = new Width_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNochange_timing_check(Nochange_timing_checkContext ctx){
		super.visitNochange_timing_check(ctx);
		ctx.extendedContext = new Nochange_timing_checkContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTimecheck_condition(Timecheck_conditionContext ctx){
		super.visitTimecheck_condition(ctx);
		ctx.extendedContext = new Timecheck_conditionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitControlled_reference_event(Controlled_reference_eventContext ctx){
		super.visitControlled_reference_event(ctx);
		ctx.extendedContext = new Controlled_reference_eventContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitData_event(Data_eventContext ctx){
		super.visitData_event(ctx);
		ctx.extendedContext = new Data_eventContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDelayed_data(Delayed_dataContext ctx){
		super.visitDelayed_data(ctx);
		ctx.extendedContext = new Delayed_dataContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDelayed_reference(Delayed_referenceContext ctx){
		super.visitDelayed_reference(ctx);
		ctx.extendedContext = new Delayed_referenceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEnd_edge_offset(End_edge_offsetContext ctx){
		super.visitEnd_edge_offset(ctx);
		ctx.extendedContext = new End_edge_offsetContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEvent_based_flag(Event_based_flagContext ctx){
		super.visitEvent_based_flag(ctx);
		ctx.extendedContext = new Event_based_flagContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNotifier(NotifierContext ctx){
		super.visitNotifier(ctx);
		ctx.extendedContext = new NotifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitReference_event(Reference_eventContext ctx){
		super.visitReference_event(ctx);
		ctx.extendedContext = new Reference_eventContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRemain_active_flag(Remain_active_flagContext ctx){
		super.visitRemain_active_flag(ctx);
		ctx.extendedContext = new Remain_active_flagContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTimestamp_condition(Timestamp_conditionContext ctx){
		super.visitTimestamp_condition(ctx);
		ctx.extendedContext = new Timestamp_conditionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStart_edge_offset(Start_edge_offsetContext ctx){
		super.visitStart_edge_offset(ctx);
		ctx.extendedContext = new Start_edge_offsetContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitThreshold(ThresholdContext ctx){
		super.visitThreshold(ctx);
		ctx.extendedContext = new ThresholdContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTiming_check_limit(Timing_check_limitContext ctx){
		super.visitTiming_check_limit(ctx);
		ctx.extendedContext = new Timing_check_limitContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTiming_check_event(Timing_check_eventContext ctx){
		super.visitTiming_check_event(ctx);
		ctx.extendedContext = new Timing_check_eventContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitControlled_timing_check_event(Controlled_timing_check_eventContext ctx){
		super.visitControlled_timing_check_event(ctx);
		ctx.extendedContext = new Controlled_timing_check_eventContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTiming_check_event_control(Timing_check_event_controlContext ctx){
		super.visitTiming_check_event_control(ctx);
		ctx.extendedContext = new Timing_check_event_controlContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSpecify_terminal_descriptor(Specify_terminal_descriptorContext ctx){
		super.visitSpecify_terminal_descriptor(ctx);
		ctx.extendedContext = new Specify_terminal_descriptorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEdge_control_specifier(Edge_control_specifierContext ctx){
		super.visitEdge_control_specifier(ctx);
		ctx.extendedContext = new Edge_control_specifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEdge_descriptor(Edge_descriptorContext ctx){
		super.visitEdge_descriptor(ctx);
		ctx.extendedContext = new Edge_descriptorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTiming_check_condition(Timing_check_conditionContext ctx){
		super.visitTiming_check_condition(ctx);
		ctx.extendedContext = new Timing_check_conditionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitScalar_timing_check_condition(Scalar_timing_check_conditionContext ctx){
		super.visitScalar_timing_check_condition(ctx);
		ctx.extendedContext = new Scalar_timing_check_conditionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitScalar_constant(Scalar_constantContext ctx){
		super.visitScalar_constant(ctx);
		ctx.extendedContext = new Scalar_constantContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConcatenation(ConcatenationContext ctx){
		super.visitConcatenation(ctx);
		ctx.extendedContext = new ConcatenationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_concatenation(Constant_concatenationContext ctx){
		super.visitConstant_concatenation(ctx);
		ctx.extendedContext = new Constant_concatenationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_multiple_concatenation(Constant_multiple_concatenationContext ctx){
		super.visitConstant_multiple_concatenation(ctx);
		ctx.extendedContext = new Constant_multiple_concatenationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_path_concatenation(Module_path_concatenationContext ctx){
		super.visitModule_path_concatenation(ctx);
		ctx.extendedContext = new Module_path_concatenationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_path_multiple_concatenation(Module_path_multiple_concatenationContext ctx){
		super.visitModule_path_multiple_concatenation(ctx);
		ctx.extendedContext = new Module_path_multiple_concatenationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMultiple_concatenation(Multiple_concatenationContext ctx){
		super.visitMultiple_concatenation(ctx);
		ctx.extendedContext = new Multiple_concatenationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStreaming_concatenation(Streaming_concatenationContext ctx){
		super.visitStreaming_concatenation(ctx);
		ctx.extendedContext = new Streaming_concatenationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStream_operator(Stream_operatorContext ctx){
		super.visitStream_operator(ctx);
		ctx.extendedContext = new Stream_operatorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSlice_size(Slice_sizeContext ctx){
		super.visitSlice_size(ctx);
		ctx.extendedContext = new Slice_sizeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStream_concatenation(Stream_concatenationContext ctx){
		super.visitStream_concatenation(ctx);
		ctx.extendedContext = new Stream_concatenationContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStream_expression(Stream_expressionContext ctx){
		super.visitStream_expression(ctx);
		ctx.extendedContext = new Stream_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitArray_range_expression(Array_range_expressionContext ctx){
		super.visitArray_range_expression(ctx);
		ctx.extendedContext = new Array_range_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEmpty_queue(Empty_queueContext ctx){
		super.visitEmpty_queue(ctx);
		ctx.extendedContext = new Empty_queueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_function_call(Constant_function_callContext ctx){
		super.visitConstant_function_call(ctx);
		ctx.extendedContext = new Constant_function_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTf_call(Tf_callContext ctx){
		super.visitTf_call(ctx);
		ctx.extendedContext = new Tf_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSystem_tf_call(System_tf_callContext ctx){
		super.visitSystem_tf_call(ctx);
		ctx.extendedContext = new System_tf_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSubroutine_call(Subroutine_callContext ctx){
		super.visitSubroutine_call(ctx);
		ctx.extendedContext = new Subroutine_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFunction_subroutine_call(Function_subroutine_callContext ctx){
		super.visitFunction_subroutine_call(ctx);
		ctx.extendedContext = new Function_subroutine_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_arguments(List_of_argumentsContext ctx){
		super.visitList_of_arguments(ctx);
		ctx.extendedContext = new List_of_argumentsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_arguments_part1(List_of_arguments_part1Context ctx){
		super.visitList_of_arguments_part1(ctx);
		ctx.extendedContext = new List_of_arguments_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_arguments_part2(List_of_arguments_part2Context ctx){
		super.visitList_of_arguments_part2(ctx);
		ctx.extendedContext = new List_of_arguments_part2ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMethod_call(Method_callContext ctx){
		super.visitMethod_call(ctx);
		ctx.extendedContext = new Method_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMethod_call_body(Method_call_bodyContext ctx){
		super.visitMethod_call_body(ctx);
		ctx.extendedContext = new Method_call_bodyContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBuilt_in_method_call(Built_in_method_callContext ctx){
		super.visitBuilt_in_method_call(ctx);
		ctx.extendedContext = new Built_in_method_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitArray_manipulation_call(Array_manipulation_callContext ctx){
		super.visitArray_manipulation_call(ctx);
		ctx.extendedContext = new Array_manipulation_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRandomize_call(Randomize_callContext ctx){
		super.visitRandomize_call(ctx);
		ctx.extendedContext = new Randomize_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMethod_call_root(Method_call_rootContext ctx){
		super.visitMethod_call_root(ctx);
		ctx.extendedContext = new Method_call_rootContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitArray_method_name(Array_method_nameContext ctx){
		super.visitArray_method_name(ctx);
		ctx.extendedContext = new Array_method_nameContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInc_or_dec_expression(Inc_or_dec_expressionContext ctx){
		super.visitInc_or_dec_expression(ctx);
		ctx.extendedContext = new Inc_or_dec_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInc_or_dec_expression_part1(Inc_or_dec_expression_part1Context ctx){
		super.visitInc_or_dec_expression_part1(ctx);
		ctx.extendedContext = new Inc_or_dec_expression_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInc_or_dec_expression_part2(Inc_or_dec_expression_part2Context ctx){
		super.visitInc_or_dec_expression_part2(ctx);
		ctx.extendedContext = new Inc_or_dec_expression_part2ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_binary_and(Const_expr_binary_andContext ctx){
		super.visitConst_expr_binary_and(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_mutl(Const_expr_mutlContext ctx){
		super.visitConst_expr_mutl(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_add(Const_expr_addContext ctx){
		super.visitConst_expr_add(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_equality(Const_expr_equalityContext ctx){
		super.visitConst_expr_equality(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_comp(Const_expr_compContext ctx){
		super.visitConst_expr_comp(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_log_or(Const_expr_log_orContext ctx){
		super.visitConst_expr_log_or(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_binary_or(Const_expr_binary_orContext ctx){
		super.visitConst_expr_binary_or(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_only_primary(Const_expr_only_primaryContext ctx){
		super.visitConst_expr_only_primary(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_binary_xor(Const_expr_binary_xorContext ctx){
		super.visitConst_expr_binary_xor(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_log_and(Const_expr_log_andContext ctx){
		super.visitConst_expr_log_and(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_shift(Const_expr_shiftContext ctx){
		super.visitConst_expr_shift(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_st_st(Const_expr_st_stContext ctx){
		super.visitConst_expr_st_st(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_conditional(Const_expr_conditionalContext ctx){
		super.visitConst_expr_conditional(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_expr_unary_op(Const_expr_unary_opContext ctx){
		super.visitConst_expr_unary_op(ctx);
		ctx.extendedContext = new Constant_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_mintypmax_expression(Constant_mintypmax_expressionContext ctx){
		super.visitConstant_mintypmax_expression(ctx);
		ctx.extendedContext = new Constant_mintypmax_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_param_expression(Constant_param_expressionContext ctx){
		super.visitConstant_param_expression(ctx);
		ctx.extendedContext = new Constant_param_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParam_expression(Param_expressionContext ctx){
		super.visitParam_expression(ctx);
		ctx.extendedContext = new Param_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_range_expression(Constant_range_expressionContext ctx){
		super.visitConstant_range_expression(ctx);
		ctx.extendedContext = new Constant_range_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_part_select_range(Constant_part_select_rangeContext ctx){
		super.visitConstant_part_select_range(ctx);
		ctx.extendedContext = new Constant_part_select_rangeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_range(Constant_rangeContext ctx){
		super.visitConstant_range(ctx);
		ctx.extendedContext = new Constant_rangeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_indexed_range(Constant_indexed_rangeContext ctx){
		super.visitConstant_indexed_range(ctx);
		ctx.extendedContext = new Constant_indexed_rangeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpr_(Expr_Context ctx){
		super.visitExpr_(ctx);
		ctx.extendedContext = new Expr_ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_binary_or(Expression_binary_orContext ctx){
		super.visitExpression_binary_or(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_binary_xor(Expression_binary_xorContext ctx){
		super.visitExpression_binary_xor(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_add(Expression_addContext ctx){
		super.visitExpression_add(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_log_or(Expression_log_orContext ctx){
		super.visitExpression_log_or(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_only_primary(Expression_only_primaryContext ctx){
		super.visitExpression_only_primary(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_log_and(Expression_log_andContext ctx){
		super.visitExpression_log_and(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_inc_or_dec(Expression_inc_or_decContext ctx){
		super.visitExpression_inc_or_dec(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_tagged_union(Expression_tagged_unionContext ctx){
		super.visitExpression_tagged_union(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_conditional_exp(Expression_conditional_expContext ctx){
		super.visitExpression_conditional_exp(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_comp(Expression_compContext ctx){
		super.visitExpression_comp(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_inside_exp(Expression_inside_expContext ctx){
		super.visitExpression_inside_exp(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_mult(Expression_multContext ctx){
		super.visitExpression_mult(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_binary_and(Expression_binary_andContext ctx){
		super.visitExpression_binary_and(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_equality(Expression_equalityContext ctx){
		super.visitExpression_equality(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_shift(Expression_shiftContext ctx){
		super.visitExpression_shift(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_op_assign(Expression_op_assignContext ctx){
		super.visitExpression_op_assign(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_st_st(Expression_st_stContext ctx){
		super.visitExpression_st_st(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression_unary_op(Expression_unary_opContext ctx){
		super.visitExpression_unary_op(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMatches_pattern(Matches_patternContext ctx){
		super.visitMatches_pattern(ctx);
		ctx.extendedContext = new Matches_patternContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTagged_union_expression(Tagged_union_expressionContext ctx){
		super.visitTagged_union_expression(ctx);
		ctx.extendedContext = new Tagged_union_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitValue_range(Value_rangeContext ctx){
		super.visitValue_range(ctx);
		ctx.extendedContext = new Value_rangeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMintypmax_expression(Mintypmax_expressionContext ctx){
		super.visitMintypmax_expression(ctx);
		ctx.extendedContext = new Mintypmax_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_path_expression(Module_path_expressionContext ctx){
		super.visitModule_path_expression(ctx);
		ctx.extendedContext = new Module_path_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_path_conditional_expression(Module_path_conditional_expressionContext ctx){
		super.visitModule_path_conditional_expression(ctx);
		ctx.extendedContext = new Module_path_conditional_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_path_binary_expression(Module_path_binary_expressionContext ctx){
		super.visitModule_path_binary_expression(ctx);
		ctx.extendedContext = new Module_path_binary_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_path_unary_expression(Module_path_unary_expressionContext ctx){
		super.visitModule_path_unary_expression(ctx);
		ctx.extendedContext = new Module_path_unary_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_path_mintypmax_expression(Module_path_mintypmax_expressionContext ctx){
		super.visitModule_path_mintypmax_expression(ctx);
		ctx.extendedContext = new Module_path_mintypmax_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPart_select_range(Part_select_rangeContext ctx){
		super.visitPart_select_range(ctx);
		ctx.extendedContext = new Part_select_rangeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIndexed_range(Indexed_rangeContext ctx){
		super.visitIndexed_range(ctx);
		ctx.extendedContext = new Indexed_rangeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenvar_expression(Genvar_expressionContext ctx){
		super.visitGenvar_expression(ctx);
		ctx.extendedContext = new Genvar_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_primary(Constant_primaryContext ctx){
		super.visitConstant_primary(ctx);
		ctx.extendedContext = new Constant_primaryContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_path_primary(Module_path_primaryContext ctx){
		super.visitModule_path_primary(ctx);
		ctx.extendedContext = new Module_path_primaryContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPrimary_no_function_call(Primary_no_function_callContext ctx){
		super.visitPrimary_no_function_call(ctx);
		ctx.extendedContext = new Primary_no_function_callContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPrimary(PrimaryContext ctx){
		super.visitPrimary(ctx);
		ctx.extendedContext = new PrimaryContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_qualifier(Class_qualifierContext ctx){
		super.visitClass_qualifier(ctx);
		ctx.extendedContext = new Class_qualifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRange_expression(Range_expressionContext ctx){
		super.visitRange_expression(ctx);
		ctx.extendedContext = new Range_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPrimary_literal(Primary_literalContext ctx){
		super.visitPrimary_literal(ctx);
		ctx.extendedContext = new Primary_literalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTime_literal(Time_literalContext ctx){
		super.visitTime_literal(ctx);
		ctx.extendedContext = new Time_literalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitImplicit_class_handle(Implicit_class_handleContext ctx){
		super.visitImplicit_class_handle(ctx);
		ctx.extendedContext = new Implicit_class_handleContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBit_select(Bit_selectContext ctx){
		super.visitBit_select(ctx);
		ctx.extendedContext = new Bit_selectContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSelect(SelectContext ctx){
		super.visitSelect(ctx);
		ctx.extendedContext = new SelectContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNonrange_select(Nonrange_selectContext ctx){
		super.visitNonrange_select(ctx);
		ctx.extendedContext = new Nonrange_selectContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_bit_select(Constant_bit_selectContext ctx){
		super.visitConstant_bit_select(ctx);
		ctx.extendedContext = new Constant_bit_selectContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_select(Constant_selectContext ctx){
		super.visitConstant_select(ctx);
		ctx.extendedContext = new Constant_selectContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_cast(Constant_castContext ctx){
		super.visitConstant_cast(ctx);
		ctx.extendedContext = new Constant_castContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstant_let_expression(Constant_let_expressionContext ctx){
		super.visitConstant_let_expression(ctx);
		ctx.extendedContext = new Constant_let_expressionContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCast(CastContext ctx){
		super.visitCast(ctx);
		ctx.extendedContext = new CastContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_lvalue(Net_lvalueContext ctx){
		super.visitNet_lvalue(ctx);
		ctx.extendedContext = new Net_lvalueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVariable_lvalue(Variable_lvalueContext ctx){
		super.visitVariable_lvalue(ctx);
		ctx.extendedContext = new Variable_lvalueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNonrange_variable_lvalue(Nonrange_variable_lvalueContext ctx){
		super.visitNonrange_variable_lvalue(ctx);
		ctx.extendedContext = new Nonrange_variable_lvalueContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnary_operator(Unary_operatorContext ctx){
		super.visitUnary_operator(ctx);
		ctx.extendedContext = new Unary_operatorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBinary_operator(Binary_operatorContext ctx){
		super.visitBinary_operator(ctx);
		ctx.extendedContext = new Binary_operatorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInc_or_dec_operator(Inc_or_dec_operatorContext ctx){
		super.visitInc_or_dec_operator(ctx);
		ctx.extendedContext = new Inc_or_dec_operatorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIncrement(IncrementContext ctx){
		super.visitIncrement(ctx);
		ctx.extendedContext = new IncrementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDecrement(DecrementContext ctx){
		super.visitDecrement(ctx);
		ctx.extendedContext = new DecrementContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnary_module_path_operator(Unary_module_path_operatorContext ctx){
		super.visitUnary_module_path_operator(ctx);
		ctx.extendedContext = new Unary_module_path_operatorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBinary_module_path_operator(Binary_module_path_operatorContext ctx){
		super.visitBinary_module_path_operator(ctx);
		ctx.extendedContext = new Binary_module_path_operatorContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnbased_unsized_literal(Unbased_unsized_literalContext ctx){
		super.visitUnbased_unsized_literal(ctx);
		ctx.extendedContext = new Unbased_unsized_literalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitString_literal(String_literalContext ctx){
		super.visitString_literal(ctx);
		ctx.extendedContext = new String_literalContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAttribute_instance(Attribute_instanceContext ctx){
		super.visitAttribute_instance(ctx);
		ctx.extendedContext = new Attribute_instanceContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAttr_spec(Attr_specContext ctx){
		super.visitAttr_spec(ctx);
		ctx.extendedContext = new Attr_specContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAttr_name(Attr_nameContext ctx){
		super.visitAttr_name(ctx);
		ctx.extendedContext = new Attr_nameContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitArray_identifier(Array_identifierContext ctx){
		super.visitArray_identifier(ctx);
		ctx.extendedContext = new Array_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBlock_identifier(Block_identifierContext ctx){
		super.visitBlock_identifier(ctx);
		ctx.extendedContext = new Block_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBin_identifier(Bin_identifierContext ctx){
		super.visitBin_identifier(ctx);
		ctx.extendedContext = new Bin_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitC_identifier(C_identifierContext ctx){
		super.visitC_identifier(ctx);
		ctx.extendedContext = new C_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCell_identifier(Cell_identifierContext ctx){
		super.visitCell_identifier(ctx);
		ctx.extendedContext = new Cell_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitChecker_identifier(Checker_identifierContext ctx){
		super.visitChecker_identifier(ctx);
		ctx.extendedContext = new Checker_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_identifier(Class_identifierContext ctx){
		super.visitClass_identifier(ctx);
		ctx.extendedContext = new Class_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClass_variable_identifier(Class_variable_identifierContext ctx){
		super.visitClass_variable_identifier(ctx);
		ctx.extendedContext = new Class_variable_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClocking_identifier(Clocking_identifierContext ctx){
		super.visitClocking_identifier(ctx);
		ctx.extendedContext = new Clocking_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConfig_identifier(Config_identifierContext ctx){
		super.visitConfig_identifier(ctx);
		ctx.extendedContext = new Config_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConst_identifier(Const_identifierContext ctx){
		super.visitConst_identifier(ctx);
		ctx.extendedContext = new Const_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstraint_identifier(Constraint_identifierContext ctx){
		super.visitConstraint_identifier(ctx);
		ctx.extendedContext = new Constraint_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCovergroup_identifier(Covergroup_identifierContext ctx){
		super.visitCovergroup_identifier(ctx);
		ctx.extendedContext = new Covergroup_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCovergroup_variable_identifier(Covergroup_variable_identifierContext ctx){
		super.visitCovergroup_variable_identifier(ctx);
		ctx.extendedContext = new Covergroup_variable_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCover_point_identifier(Cover_point_identifierContext ctx){
		super.visitCover_point_identifier(ctx);
		ctx.extendedContext = new Cover_point_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCross_identifier(Cross_identifierContext ctx){
		super.visitCross_identifier(ctx);
		ctx.extendedContext = new Cross_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDynamic_array_variable_identifier(Dynamic_array_variable_identifierContext ctx){
		super.visitDynamic_array_variable_identifier(ctx);
		ctx.extendedContext = new Dynamic_array_variable_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEnum_identifier(Enum_identifierContext ctx){
		super.visitEnum_identifier(ctx);
		ctx.extendedContext = new Enum_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_identifier(Escaped_identifierContext ctx){
		super.visitEscaped_identifier(ctx);
		ctx.extendedContext = new Escaped_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFormal_identifier(Formal_identifierContext ctx){
		super.visitFormal_identifier(ctx);
		ctx.extendedContext = new Formal_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFunction_identifier(Function_identifierContext ctx){
		super.visitFunction_identifier(ctx);
		ctx.extendedContext = new Function_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenerate_block_identifier(Generate_block_identifierContext ctx){
		super.visitGenerate_block_identifier(ctx);
		ctx.extendedContext = new Generate_block_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenvar_identifier(Genvar_identifierContext ctx){
		super.visitGenvar_identifier(ctx);
		ctx.extendedContext = new Genvar_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_array_identifier(Hierarchical_array_identifierContext ctx){
		super.visitHierarchical_array_identifier(ctx);
		ctx.extendedContext = new Hierarchical_array_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_block_identifier(Hierarchical_block_identifierContext ctx){
		super.visitHierarchical_block_identifier(ctx);
		ctx.extendedContext = new Hierarchical_block_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_event_identifier(Hierarchical_event_identifierContext ctx){
		super.visitHierarchical_event_identifier(ctx);
		ctx.extendedContext = new Hierarchical_event_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_identifier(Hierarchical_identifierContext ctx){
		super.visitHierarchical_identifier(ctx);
		ctx.extendedContext = new Hierarchical_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_net_identifier(Hierarchical_net_identifierContext ctx){
		super.visitHierarchical_net_identifier(ctx);
		ctx.extendedContext = new Hierarchical_net_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_parameter_identifier(Hierarchical_parameter_identifierContext ctx){
		super.visitHierarchical_parameter_identifier(ctx);
		ctx.extendedContext = new Hierarchical_parameter_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_property_identifier(Hierarchical_property_identifierContext ctx){
		super.visitHierarchical_property_identifier(ctx);
		ctx.extendedContext = new Hierarchical_property_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_sequence_identifier(Hierarchical_sequence_identifierContext ctx){
		super.visitHierarchical_sequence_identifier(ctx);
		ctx.extendedContext = new Hierarchical_sequence_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_task_identifier(Hierarchical_task_identifierContext ctx){
		super.visitHierarchical_task_identifier(ctx);
		ctx.extendedContext = new Hierarchical_task_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_tf_identifier(Hierarchical_tf_identifierContext ctx){
		super.visitHierarchical_tf_identifier(ctx);
		ctx.extendedContext = new Hierarchical_tf_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_variable_identifier(Hierarchical_variable_identifierContext ctx){
		super.visitHierarchical_variable_identifier(ctx);
		ctx.extendedContext = new Hierarchical_variable_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIdentifier(IdentifierContext ctx){
		super.visitIdentifier(ctx);
		ctx.extendedContext = new IdentifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIndex_variable_identifier(Index_variable_identifierContext ctx){
		super.visitIndex_variable_identifier(ctx);
		ctx.extendedContext = new Index_variable_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterface_identifier(Interface_identifierContext ctx){
		super.visitInterface_identifier(ctx);
		ctx.extendedContext = new Interface_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterface_instance_identifier(Interface_instance_identifierContext ctx){
		super.visitInterface_instance_identifier(ctx);
		ctx.extendedContext = new Interface_instance_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInout_port_identifier(Inout_port_identifierContext ctx){
		super.visitInout_port_identifier(ctx);
		ctx.extendedContext = new Inout_port_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInput_port_identifier(Input_port_identifierContext ctx){
		super.visitInput_port_identifier(ctx);
		ctx.extendedContext = new Input_port_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInstance_identifier(Instance_identifierContext ctx){
		super.visitInstance_identifier(ctx);
		ctx.extendedContext = new Instance_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLibrary_identifier(Library_identifierContext ctx){
		super.visitLibrary_identifier(ctx);
		ctx.extendedContext = new Library_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMember_identifier(Member_identifierContext ctx){
		super.visitMember_identifier(ctx);
		ctx.extendedContext = new Member_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMethod_identifier(Method_identifierContext ctx){
		super.visitMethod_identifier(ctx);
		ctx.extendedContext = new Method_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModport_identifier(Modport_identifierContext ctx){
		super.visitModport_identifier(ctx);
		ctx.extendedContext = new Modport_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_identifier(Module_identifierContext ctx){
		super.visitModule_identifier(ctx);
		ctx.extendedContext = new Module_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_identifier(Net_identifierContext ctx){
		super.visitNet_identifier(ctx);
		ctx.extendedContext = new Net_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOutput_port_identifier(Output_port_identifierContext ctx){
		super.visitOutput_port_identifier(ctx);
		ctx.extendedContext = new Output_port_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackage_identifier(Package_identifierContext ctx){
		super.visitPackage_identifier(ctx);
		ctx.extendedContext = new Package_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackage_scope(Package_scopeContext ctx){
		super.visitPackage_scope(ctx);
		ctx.extendedContext = new Package_scopeContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParameter_identifier(Parameter_identifierContext ctx){
		super.visitParameter_identifier(ctx);
		ctx.extendedContext = new Parameter_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPort_identifier(Port_identifierContext ctx){
		super.visitPort_identifier(ctx);
		ctx.extendedContext = new Port_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProduction_identifier(Production_identifierContext ctx){
		super.visitProduction_identifier(ctx);
		ctx.extendedContext = new Production_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProgram_identifier(Program_identifierContext ctx){
		super.visitProgram_identifier(ctx);
		ctx.extendedContext = new Program_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProperty_identifier(Property_identifierContext ctx){
		super.visitProperty_identifier(ctx);
		ctx.extendedContext = new Property_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_class_identifier(Ps_class_identifierContext ctx){
		super.visitPs_class_identifier(ctx);
		ctx.extendedContext = new Ps_class_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_covergroup_identifier(Ps_covergroup_identifierContext ctx){
		super.visitPs_covergroup_identifier(ctx);
		ctx.extendedContext = new Ps_covergroup_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_identifier(Ps_identifierContext ctx){
		super.visitPs_identifier(ctx);
		ctx.extendedContext = new Ps_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_array_identifier(Ps_or_hierarchical_array_identifierContext ctx){
		super.visitPs_or_hierarchical_array_identifier(ctx);
		ctx.extendedContext = new Ps_or_hierarchical_array_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_array_identifier_part1(Ps_or_hierarchical_array_identifier_part1Context ctx){
		super.visitPs_or_hierarchical_array_identifier_part1(ctx);
		ctx.extendedContext = new Ps_or_hierarchical_array_identifier_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_net_identifier(Ps_or_hierarchical_net_identifierContext ctx){
		super.visitPs_or_hierarchical_net_identifier(ctx);
		ctx.extendedContext = new Ps_or_hierarchical_net_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_property_identifier(Ps_or_hierarchical_property_identifierContext ctx){
		super.visitPs_or_hierarchical_property_identifier(ctx);
		ctx.extendedContext = new Ps_or_hierarchical_property_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_sequence_identifier(Ps_or_hierarchical_sequence_identifierContext ctx){
		super.visitPs_or_hierarchical_sequence_identifier(ctx);
		ctx.extendedContext = new Ps_or_hierarchical_sequence_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_or_hierarchical_tf_identifier(Ps_or_hierarchical_tf_identifierContext ctx){
		super.visitPs_or_hierarchical_tf_identifier(ctx);
		ctx.extendedContext = new Ps_or_hierarchical_tf_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_parameter_identifier(Ps_parameter_identifierContext ctx){
		super.visitPs_parameter_identifier(ctx);
		ctx.extendedContext = new Ps_parameter_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_parameter_identifier_part1(Ps_parameter_identifier_part1Context ctx){
		super.visitPs_parameter_identifier_part1(ctx);
		ctx.extendedContext = new Ps_parameter_identifier_part1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPs_type_identifier(Ps_type_identifierContext ctx){
		super.visitPs_type_identifier(ctx);
		ctx.extendedContext = new Ps_type_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSequence_identifier(Sequence_identifierContext ctx){
		super.visitSequence_identifier(ctx);
		ctx.extendedContext = new Sequence_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSignal_identifier(Signal_identifierContext ctx){
		super.visitSignal_identifier(ctx);
		ctx.extendedContext = new Signal_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_identifier(Simple_identifierContext ctx){
		super.visitSimple_identifier(ctx);
		ctx.extendedContext = new Simple_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSpecparam_identifier(Specparam_identifierContext ctx){
		super.visitSpecparam_identifier(ctx);
		ctx.extendedContext = new Specparam_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSystem_tf_identifier(System_tf_identifierContext ctx){
		super.visitSystem_tf_identifier(ctx);
		ctx.extendedContext = new System_tf_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTask_identifier(Task_identifierContext ctx){
		super.visitTask_identifier(ctx);
		ctx.extendedContext = new Task_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTf_identifier(Tf_identifierContext ctx){
		super.visitTf_identifier(ctx);
		ctx.extendedContext = new Tf_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTerminal_identifier(Terminal_identifierContext ctx){
		super.visitTerminal_identifier(ctx);
		ctx.extendedContext = new Terminal_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTopmodule_identifier(Topmodule_identifierContext ctx){
		super.visitTopmodule_identifier(ctx);
		ctx.extendedContext = new Topmodule_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitType_identifier(Type_identifierContext ctx){
		super.visitType_identifier(ctx);
		ctx.extendedContext = new Type_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUdp_identifier(Udp_identifierContext ctx){
		super.visitUdp_identifier(ctx);
		ctx.extendedContext = new Udp_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBins_identifier(Bins_identifierContext ctx){
		super.visitBins_identifier(ctx);
		ctx.extendedContext = new Bins_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVariable_identifier(Variable_identifierContext ctx){
		super.visitVariable_identifier(ctx);
		ctx.extendedContext = new Variable_identifierContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNumber(NumberContext ctx){
		super.visitNumber(ctx);
		ctx.extendedContext = new NumberContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEof(EofContext ctx){
		super.visitEof(ctx);
		ctx.extendedContext = new EofContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndmodulestr(EndmodulestrContext ctx){
		super.visitEndmodulestr(ctx);
		ctx.extendedContext = new EndmodulestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitColon(ColonContext ctx){
		super.visitColon(ctx);
		ctx.extendedContext = new ColonContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExternstr(ExternstrContext ctx){
		super.visitExternstr(ctx);
		ctx.extendedContext = new ExternstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSemi(SemiContext ctx){
		super.visitSemi(ctx);
		ctx.extendedContext = new SemiContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModulestr(ModulestrContext ctx){
		super.visitModulestr(ctx);
		ctx.extendedContext = new ModulestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMacromodulestr(MacromodulestrContext ctx){
		super.visitMacromodulestr(ctx);
		ctx.extendedContext = new MacromodulestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndinterfacestr(EndinterfacestrContext ctx){
		super.visitEndinterfacestr(ctx);
		ctx.extendedContext = new EndinterfacestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInterfacestr(InterfacestrContext ctx){
		super.visitInterfacestr(ctx);
		ctx.extendedContext = new InterfacestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLparen(LparenContext ctx){
		super.visitLparen(ctx);
		ctx.extendedContext = new LparenContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDotstar(DotstarContext ctx){
		super.visitDotstar(ctx);
		ctx.extendedContext = new DotstarContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRparen(RparenContext ctx){
		super.visitRparen(ctx);
		ctx.extendedContext = new RparenContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndprogramstr(EndprogramstrContext ctx){
		super.visitEndprogramstr(ctx);
		ctx.extendedContext = new EndprogramstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProgramstr(ProgramstrContext ctx){
		super.visitProgramstr(ctx);
		ctx.extendedContext = new ProgramstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCheckerstr(CheckerstrContext ctx){
		super.visitCheckerstr(ctx);
		ctx.extendedContext = new CheckerstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndcheckerstr(EndcheckerstrContext ctx){
		super.visitEndcheckerstr(ctx);
		ctx.extendedContext = new EndcheckerstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVirtualstr(VirtualstrContext ctx){
		super.visitVirtualstr(ctx);
		ctx.extendedContext = new VirtualstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClassstr(ClassstrContext ctx){
		super.visitClassstr(ctx);
		ctx.extendedContext = new ClassstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExtendsstr(ExtendsstrContext ctx){
		super.visitExtendsstr(ctx);
		ctx.extendedContext = new ExtendsstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndclassstr(EndclassstrContext ctx){
		super.visitEndclassstr(ctx);
		ctx.extendedContext = new EndclassstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackagestr(PackagestrContext ctx){
		super.visitPackagestr(ctx);
		ctx.extendedContext = new PackagestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndpackagestr(EndpackagestrContext ctx){
		super.visitEndpackagestr(ctx);
		ctx.extendedContext = new EndpackagestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTimeunit(TimeunitContext ctx){
		super.visitTimeunit(ctx);
		ctx.extendedContext = new TimeunitContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDiv(DivContext ctx){
		super.visitDiv(ctx);
		ctx.extendedContext = new DivContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHash(HashContext ctx){
		super.visitHash(ctx);
		ctx.extendedContext = new HashContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitComma(CommaContext ctx){
		super.visitComma(ctx);
		ctx.extendedContext = new CommaContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTypestr(TypestrContext ctx){
		super.visitTypestr(ctx);
		ctx.extendedContext = new TypestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDot(DotContext ctx){
		super.visitDot(ctx);
		ctx.extendedContext = new DotContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLcurl(LcurlContext ctx){
		super.visitLcurl(ctx);
		ctx.extendedContext = new LcurlContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRcurl(RcurlContext ctx){
		super.visitRcurl(ctx);
		ctx.extendedContext = new RcurlContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInputstr(InputstrContext ctx){
		super.visitInputstr(ctx);
		ctx.extendedContext = new InputstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOutputstr(OutputstrContext ctx){
		super.visitOutputstr(ctx);
		ctx.extendedContext = new OutputstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInoutstr(InoutstrContext ctx){
		super.visitInoutstr(ctx);
		ctx.extendedContext = new InoutstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRefstr(RefstrContext ctx){
		super.visitRefstr(ctx);
		ctx.extendedContext = new RefstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssign(AssignContext ctx){
		super.visitAssign(ctx);
		ctx.extendedContext = new AssignContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarfatalstr(DollarfatalstrContext ctx){
		super.visitDollarfatalstr(ctx);
		ctx.extendedContext = new DollarfatalstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarerrorstr(DollarerrorstrContext ctx){
		super.visitDollarerrorstr(ctx);
		ctx.extendedContext = new DollarerrorstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarwarningstr(DollarwarningstrContext ctx){
		super.visitDollarwarningstr(ctx);
		ctx.extendedContext = new DollarwarningstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDollarinfostr(DollarinfostrContext ctx){
		super.visitDollarinfostr(ctx);
		ctx.extendedContext = new DollarinfostrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefparamstr(DefparamstrContext ctx){
		super.visitDefparamstr(ctx);
		ctx.extendedContext = new DefparamstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBindstr(BindstrContext ctx){
		super.visitBindstr(ctx);
		ctx.extendedContext = new BindstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConfigstr(ConfigstrContext ctx){
		super.visitConfigstr(ctx);
		ctx.extendedContext = new ConfigstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndconfigstr(EndconfigstrContext ctx){
		super.visitEndconfigstr(ctx);
		ctx.extendedContext = new EndconfigstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDesignstr(DesignstrContext ctx){
		super.visitDesignstr(ctx);
		ctx.extendedContext = new DesignstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefaultstr(DefaultstrContext ctx){
		super.visitDefaultstr(ctx);
		ctx.extendedContext = new DefaultstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInstancestr(InstancestrContext ctx){
		super.visitInstancestr(ctx);
		ctx.extendedContext = new InstancestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitCellstr(CellstrContext ctx){
		super.visitCellstr(ctx);
		ctx.extendedContext = new CellstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLibliststr(LibliststrContext ctx){
		super.visitLibliststr(ctx);
		ctx.extendedContext = new LibliststrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUsestr(UsestrContext ctx){
		super.visitUsestr(ctx);
		ctx.extendedContext = new UsestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitClockingstr(ClockingstrContext ctx){
		super.visitClockingstr(ctx);
		ctx.extendedContext = new ClockingstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDisablestr(DisablestrContext ctx){
		super.visitDisablestr(ctx);
		ctx.extendedContext = new DisablestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIffstr(IffstrContext ctx){
		super.visitIffstr(ctx);
		ctx.extendedContext = new IffstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitForkjoinstr(ForkjoinstrContext ctx){
		super.visitForkjoinstr(ctx);
		ctx.extendedContext = new ForkjoinstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAlwaysstr(AlwaysstrContext ctx){
		super.visitAlwaysstr(ctx);
		ctx.extendedContext = new AlwaysstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConststr(ConststrContext ctx){
		super.visitConststr(ctx);
		ctx.extendedContext = new ConststrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFunctionstr(FunctionstrContext ctx){
		super.visitFunctionstr(ctx);
		ctx.extendedContext = new FunctionstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNewstr(NewstrContext ctx){
		super.visitNewstr(ctx);
		ctx.extendedContext = new NewstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStaticstr(StaticstrContext ctx){
		super.visitStaticstr(ctx);
		ctx.extendedContext = new StaticstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitProtectedstr(ProtectedstrContext ctx){
		super.visitProtectedstr(ctx);
		ctx.extendedContext = new ProtectedstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLocalstr(LocalstrContext ctx){
		super.visitLocalstr(ctx);
		ctx.extendedContext = new LocalstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRandstr(RandstrContext ctx){
		super.visitRandstr(ctx);
		ctx.extendedContext = new RandstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRandcstr(RandcstrContext ctx){
		super.visitRandcstr(ctx);
		ctx.extendedContext = new RandcstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPurestr(PurestrContext ctx){
		super.visitPurestr(ctx);
		ctx.extendedContext = new PurestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSuperstr(SuperstrContext ctx){
		super.visitSuperstr(ctx);
		ctx.extendedContext = new SuperstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndfunctionstr(EndfunctionstrContext ctx){
		super.visitEndfunctionstr(ctx);
		ctx.extendedContext = new EndfunctionstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConstraintstr(ConstraintstrContext ctx){
		super.visitConstraintstr(ctx);
		ctx.extendedContext = new ConstraintstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSolvestr(SolvestrContext ctx){
		super.visitSolvestr(ctx);
		ctx.extendedContext = new SolvestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBeforestr(BeforestrContext ctx){
		super.visitBeforestr(ctx);
		ctx.extendedContext = new BeforestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDerive(DeriveContext ctx){
		super.visitDerive(ctx);
		ctx.extendedContext = new DeriveContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIfstr(IfstrContext ctx){
		super.visitIfstr(ctx);
		ctx.extendedContext = new IfstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitElsestr(ElsestrContext ctx){
		super.visitElsestr(ctx);
		ctx.extendedContext = new ElsestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitForeachstr(ForeachstrContext ctx){
		super.visitForeachstr(ctx);
		ctx.extendedContext = new ForeachstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLbrack(LbrackContext ctx){
		super.visitLbrack(ctx);
		ctx.extendedContext = new LbrackContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRbrack(RbrackContext ctx){
		super.visitRbrack(ctx);
		ctx.extendedContext = new RbrackContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitColonequals(ColonequalsContext ctx){
		super.visitColonequals(ctx);
		ctx.extendedContext = new ColonequalsContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitColonslash(ColonslashContext ctx){
		super.visitColonslash(ctx);
		ctx.extendedContext = new ColonslashContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLocalparamstr(LocalparamstrContext ctx){
		super.visitLocalparamstr(ctx);
		ctx.extendedContext = new LocalparamstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParameterstr(ParameterstrContext ctx){
		super.visitParameterstr(ctx);
		ctx.extendedContext = new ParameterstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSpecparamstr(SpecparamstrContext ctx){
		super.visitSpecparamstr(ctx);
		ctx.extendedContext = new SpecparamstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVarstr(VarstrContext ctx){
		super.visitVarstr(ctx);
		ctx.extendedContext = new VarstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitImportstr(ImportstrContext ctx){
		super.visitImportstr(ctx);
		ctx.extendedContext = new ImportstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitColoncolon(ColoncolonContext ctx){
		super.visitColoncolon(ctx);
		ctx.extendedContext = new ColoncolonContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStar(StarContext ctx){
		super.visitStar(ctx);
		ctx.extendedContext = new StarContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExport(ExportContext ctx){
		super.visitExport(ctx);
		ctx.extendedContext = new ExportContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStartcoloncolonstar(StartcoloncolonstarContext ctx){
		super.visitStartcoloncolonstar(ctx);
		ctx.extendedContext = new StartcoloncolonstarContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitGenvarstr(GenvarstrContext ctx){
		super.visitGenvarstr(ctx);
		ctx.extendedContext = new GenvarstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVectoredstr(VectoredstrContext ctx){
		super.visitVectoredstr(ctx);
		ctx.extendedContext = new VectoredstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitScalaredstr(ScalaredstrContext ctx){
		super.visitScalaredstr(ctx);
		ctx.extendedContext = new ScalaredstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTypedefstr(TypedefstrContext ctx){
		super.visitTypedefstr(ctx);
		ctx.extendedContext = new TypedefstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEnumstr(EnumstrContext ctx){
		super.visitEnumstr(ctx);
		ctx.extendedContext = new EnumstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStructstr(StructstrContext ctx){
		super.visitStructstr(ctx);
		ctx.extendedContext = new StructstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnionstr(UnionstrContext ctx){
		super.visitUnionstr(ctx);
		ctx.extendedContext = new UnionstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAutomaticstr(AutomaticstrContext ctx){
		super.visitAutomaticstr(ctx);
		ctx.extendedContext = new AutomaticstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStringstr(StringstrContext ctx){
		super.visitStringstr(ctx);
		ctx.extendedContext = new StringstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPackedstr(PackedstrContext ctx){
		super.visitPackedstr(ctx);
		ctx.extendedContext = new PackedstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitChandlestr(ChandlestrContext ctx){
		super.visitChandlestr(ctx);
		ctx.extendedContext = new ChandlestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEventstr(EventstrContext ctx){
		super.visitEventstr(ctx);
		ctx.extendedContext = new EventstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitZero_or_one(Zero_or_oneContext ctx){
		super.visitZero_or_one(ctx);
		ctx.extendedContext = new Zero_or_oneContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEdge_spec(Edge_specContext ctx){
		super.visitEdge_spec(ctx);
		ctx.extendedContext = new Edge_specContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDecimal_number(Decimal_numberContext ctx){
		super.visitDecimal_number(ctx);
		ctx.extendedContext = new Decimal_numberContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBytestr(BytestrContext ctx){
		super.visitBytestr(ctx);
		ctx.extendedContext = new BytestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitShortintstr(ShortintstrContext ctx){
		super.visitShortintstr(ctx);
		ctx.extendedContext = new ShortintstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIntstr(IntstrContext ctx){
		super.visitIntstr(ctx);
		ctx.extendedContext = new IntstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLongintstr(LongintstrContext ctx){
		super.visitLongintstr(ctx);
		ctx.extendedContext = new LongintstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIntegerstr(IntegerstrContext ctx){
		super.visitIntegerstr(ctx);
		ctx.extendedContext = new IntegerstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTimestr(TimestrContext ctx){
		super.visitTimestr(ctx);
		ctx.extendedContext = new TimestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitBitstr(BitstrContext ctx){
		super.visitBitstr(ctx);
		ctx.extendedContext = new BitstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLogicstr(LogicstrContext ctx){
		super.visitLogicstr(ctx);
		ctx.extendedContext = new LogicstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRegstr(RegstrContext ctx){
		super.visitRegstr(ctx);
		ctx.extendedContext = new RegstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitShortreal(ShortrealContext ctx){
		super.visitShortreal(ctx);
		ctx.extendedContext = new ShortrealContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRealstr(RealstrContext ctx){
		super.visitRealstr(ctx);
		ctx.extendedContext = new RealstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRealtimestr(RealtimestrContext ctx){
		super.visitRealtimestr(ctx);
		ctx.extendedContext = new RealtimestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSupply0str(Supply0strContext ctx){
		super.visitSupply0str(ctx);
		ctx.extendedContext = new Supply0strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSupply1str(Supply1strContext ctx){
		super.visitSupply1str(ctx);
		ctx.extendedContext = new Supply1strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTristr(TristrContext ctx){
		super.visitTristr(ctx);
		ctx.extendedContext = new TristrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTriandstr(TriandstrContext ctx){
		super.visitTriandstr(ctx);
		ctx.extendedContext = new TriandstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTriorstr(TriorstrContext ctx){
		super.visitTriorstr(ctx);
		ctx.extendedContext = new TriorstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTriregstr(TriregstrContext ctx){
		super.visitTriregstr(ctx);
		ctx.extendedContext = new TriregstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTri0str(Tri0strContext ctx){
		super.visitTri0str(ctx);
		ctx.extendedContext = new Tri0strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTri1str(Tri1strContext ctx){
		super.visitTri1str(ctx);
		ctx.extendedContext = new Tri1strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUwirestr(UwirestrContext ctx){
		super.visitUwirestr(ctx);
		ctx.extendedContext = new UwirestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWirestr(WirestrContext ctx){
		super.visitWirestr(ctx);
		ctx.extendedContext = new WirestrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWandstr(WandstrContext ctx){
		super.visitWandstr(ctx);
		ctx.extendedContext = new WandstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWorstr(WorstrContext ctx){
		super.visitWorstr(ctx);
		ctx.extendedContext = new WorstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSignedstr(SignedstrContext ctx){
		super.visitSignedstr(ctx);
		ctx.extendedContext = new SignedstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUnsignedstr(UnsignedstrContext ctx){
		super.visitUnsignedstr(ctx);
		ctx.extendedContext = new UnsignedstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitVoidstr(VoidstrContext ctx){
		super.visitVoidstr(ctx);
		ctx.extendedContext = new VoidstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTaggedstr(TaggedstrContext ctx){
		super.visitTaggedstr(ctx);
		ctx.extendedContext = new TaggedstrContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHighz1str(Highz1strContext ctx){
		super.visitHighz1str(ctx);
		ctx.extendedContext = new Highz1strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHighz0str(Highz0strContext ctx){
		super.visitHighz0str(ctx);
		ctx.extendedContext = new Highz0strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStrong0(Strong0Context ctx){
		super.visitStrong0(ctx);
		ctx.extendedContext = new Strong0ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPull0str(Pull0strContext ctx){
		super.visitPull0str(ctx);
		ctx.extendedContext = new Pull0strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWeak0str(Weak0strContext ctx){
		super.visitWeak0str(ctx);
		ctx.extendedContext = new Weak0strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStrong1(Strong1Context ctx){
		super.visitStrong1(ctx);
		ctx.extendedContext = new Strong1ContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPull1str(Pull1strContext ctx){
		super.visitPull1str(ctx);
		ctx.extendedContext = new Pull1strContextExt(ctx);return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitWeak1str(Weak1strContext ctx){
		super.visitWeak1str(ctx);
		ctx.extendedContext = new Weak1strContextExt(ctx);return ctx;
	}

}
