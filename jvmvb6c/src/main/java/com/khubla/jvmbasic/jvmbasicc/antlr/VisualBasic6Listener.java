// Generated from VisualBasic6.g4 by ANTLR 4.5
package com.khubla.jvmbasic.jvmbasicc.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VisualBasic6Parser}.
 */
public interface VisualBasic6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(VisualBasic6Parser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(VisualBasic6Parser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(VisualBasic6Parser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(VisualBasic6Parser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#moduleHeader}.
	 * @param ctx the parse tree
	 */
	void enterModuleHeader(VisualBasic6Parser.ModuleHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#moduleHeader}.
	 * @param ctx the parse tree
	 */
	void exitModuleHeader(VisualBasic6Parser.ModuleHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#moduleConfig}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfig(VisualBasic6Parser.ModuleConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#moduleConfig}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfig(VisualBasic6Parser.ModuleConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfigElement(VisualBasic6Parser.ModuleConfigElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfigElement(VisualBasic6Parser.ModuleConfigElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#moduleAttributes}.
	 * @param ctx the parse tree
	 */
	void enterModuleAttributes(VisualBasic6Parser.ModuleAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#moduleAttributes}.
	 * @param ctx the parse tree
	 */
	void exitModuleAttributes(VisualBasic6Parser.ModuleAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#moduleOptions}.
	 * @param ctx the parse tree
	 */
	void enterModuleOptions(VisualBasic6Parser.ModuleOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#moduleOptions}.
	 * @param ctx the parse tree
	 */
	void exitModuleOptions(VisualBasic6Parser.ModuleOptionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionBaseStmt(VisualBasic6Parser.OptionBaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionBaseStmt(VisualBasic6Parser.OptionBaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionCompareStmt(VisualBasic6Parser.OptionCompareStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionCompareStmt(VisualBasic6Parser.OptionCompareStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionExplicitStmt(VisualBasic6Parser.OptionExplicitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionExplicitStmt(VisualBasic6Parser.OptionExplicitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionPrivateModuleStmt(VisualBasic6Parser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionPrivateModuleStmt(VisualBasic6Parser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(VisualBasic6Parser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(VisualBasic6Parser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#moduleBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleBodyElement(VisualBasic6Parser.ModuleBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#moduleBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleBodyElement(VisualBasic6Parser.ModuleBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#moduleBlock}.
	 * @param ctx the parse tree
	 */
	void enterModuleBlock(VisualBasic6Parser.ModuleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#moduleBlock}.
	 * @param ctx the parse tree
	 */
	void exitModuleBlock(VisualBasic6Parser.ModuleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#attributeStmt}.
	 * @param ctx the parse tree
	 */
	void enterAttributeStmt(VisualBasic6Parser.AttributeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#attributeStmt}.
	 * @param ctx the parse tree
	 */
	void exitAttributeStmt(VisualBasic6Parser.AttributeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(VisualBasic6Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(VisualBasic6Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(VisualBasic6Parser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(VisualBasic6Parser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#appactivateStmt}.
	 * @param ctx the parse tree
	 */
	void enterAppactivateStmt(VisualBasic6Parser.AppactivateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#appactivateStmt}.
	 * @param ctx the parse tree
	 */
	void exitAppactivateStmt(VisualBasic6Parser.AppactivateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#beepStmt}.
	 * @param ctx the parse tree
	 */
	void enterBeepStmt(VisualBasic6Parser.BeepStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#beepStmt}.
	 * @param ctx the parse tree
	 */
	void exitBeepStmt(VisualBasic6Parser.BeepStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#chdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterChdirStmt(VisualBasic6Parser.ChdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#chdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitChdirStmt(VisualBasic6Parser.ChdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#chdriveStmt}.
	 * @param ctx the parse tree
	 */
	void enterChdriveStmt(VisualBasic6Parser.ChdriveStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#chdriveStmt}.
	 * @param ctx the parse tree
	 */
	void exitChdriveStmt(VisualBasic6Parser.ChdriveStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#closeStmt}.
	 * @param ctx the parse tree
	 */
	void enterCloseStmt(VisualBasic6Parser.CloseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#closeStmt}.
	 * @param ctx the parse tree
	 */
	void exitCloseStmt(VisualBasic6Parser.CloseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#constStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstStmt(VisualBasic6Parser.ConstStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#constStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstStmt(VisualBasic6Parser.ConstStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#constSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstSubStmt(VisualBasic6Parser.ConstSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#constSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstSubStmt(VisualBasic6Parser.ConstSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#dateStmt}.
	 * @param ctx the parse tree
	 */
	void enterDateStmt(VisualBasic6Parser.DateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#dateStmt}.
	 * @param ctx the parse tree
	 */
	void exitDateStmt(VisualBasic6Parser.DateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStmt(VisualBasic6Parser.DeclareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStmt(VisualBasic6Parser.DeclareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#deftypeStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeftypeStmt(VisualBasic6Parser.DeftypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#deftypeStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeftypeStmt(VisualBasic6Parser.DeftypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#deleteSettingStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSettingStmt(VisualBasic6Parser.DeleteSettingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#deleteSettingStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSettingStmt(VisualBasic6Parser.DeleteSettingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#doLoopStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoLoopStmt(VisualBasic6Parser.DoLoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#doLoopStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoLoopStmt(VisualBasic6Parser.DoLoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#endStmt}.
	 * @param ctx the parse tree
	 */
	void enterEndStmt(VisualBasic6Parser.EndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#endStmt}.
	 * @param ctx the parse tree
	 */
	void exitEndStmt(VisualBasic6Parser.EndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#enumerationStmt}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationStmt(VisualBasic6Parser.EnumerationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#enumerationStmt}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationStmt(VisualBasic6Parser.EnumerationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationStmt_Constant(VisualBasic6Parser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationStmt_Constant(VisualBasic6Parser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void enterEraseStmt(VisualBasic6Parser.EraseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void exitEraseStmt(VisualBasic6Parser.EraseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void enterErrorStmt(VisualBasic6Parser.ErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void exitErrorStmt(VisualBasic6Parser.ErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#eventStmt}.
	 * @param ctx the parse tree
	 */
	void enterEventStmt(VisualBasic6Parser.EventStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#eventStmt}.
	 * @param ctx the parse tree
	 */
	void exitEventStmt(VisualBasic6Parser.EventStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(VisualBasic6Parser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(VisualBasic6Parser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#filecopyStmt}.
	 * @param ctx the parse tree
	 */
	void enterFilecopyStmt(VisualBasic6Parser.FilecopyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#filecopyStmt}.
	 * @param ctx the parse tree
	 */
	void exitFilecopyStmt(VisualBasic6Parser.FilecopyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForEachStmt(VisualBasic6Parser.ForEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForEachStmt(VisualBasic6Parser.ForEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#forNextStmt}.
	 * @param ctx the parse tree
	 */
	void enterForNextStmt(VisualBasic6Parser.ForNextStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#forNextStmt}.
	 * @param ctx the parse tree
	 */
	void exitForNextStmt(VisualBasic6Parser.ForNextStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStmt(VisualBasic6Parser.FunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStmt(VisualBasic6Parser.FunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#getStmt}.
	 * @param ctx the parse tree
	 */
	void enterGetStmt(VisualBasic6Parser.GetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#getStmt}.
	 * @param ctx the parse tree
	 */
	void exitGetStmt(VisualBasic6Parser.GetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#goSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoSubStmt(VisualBasic6Parser.GoSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#goSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoSubStmt(VisualBasic6Parser.GoSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#goToStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoToStmt(VisualBasic6Parser.GoToStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#goToStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoToStmt(VisualBasic6Parser.GoToStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineIfThenElse}
	 * labeled alternative in {@link VisualBasic6Parser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterInlineIfThenElse(VisualBasic6Parser.InlineIfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineIfThenElse}
	 * labeled alternative in {@link VisualBasic6Parser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitInlineIfThenElse(VisualBasic6Parser.InlineIfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockIfThenElse}
	 * labeled alternative in {@link VisualBasic6Parser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockIfThenElse(VisualBasic6Parser.BlockIfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockIfThenElse}
	 * labeled alternative in {@link VisualBasic6Parser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockIfThenElse(VisualBasic6Parser.BlockIfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#ifBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfBlockStmt(VisualBasic6Parser.IfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#ifBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfBlockStmt(VisualBasic6Parser.IfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#ifConditionStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionStmt(VisualBasic6Parser.IfConditionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#ifConditionStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionStmt(VisualBasic6Parser.IfConditionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#ifElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIfBlockStmt(VisualBasic6Parser.IfElseIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#ifElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIfBlockStmt(VisualBasic6Parser.IfElseIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#ifElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseBlockStmt(VisualBasic6Parser.IfElseBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#ifElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseBlockStmt(VisualBasic6Parser.IfElseBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#implementsStmt}.
	 * @param ctx the parse tree
	 */
	void enterImplementsStmt(VisualBasic6Parser.ImplementsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#implementsStmt}.
	 * @param ctx the parse tree
	 */
	void exitImplementsStmt(VisualBasic6Parser.ImplementsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(VisualBasic6Parser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(VisualBasic6Parser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#killStmt}.
	 * @param ctx the parse tree
	 */
	void enterKillStmt(VisualBasic6Parser.KillStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#killStmt}.
	 * @param ctx the parse tree
	 */
	void exitKillStmt(VisualBasic6Parser.KillStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(VisualBasic6Parser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(VisualBasic6Parser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#lineInputStmt}.
	 * @param ctx the parse tree
	 */
	void enterLineInputStmt(VisualBasic6Parser.LineInputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#lineInputStmt}.
	 * @param ctx the parse tree
	 */
	void exitLineInputStmt(VisualBasic6Parser.LineInputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoadStmt(VisualBasic6Parser.LoadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoadStmt(VisualBasic6Parser.LoadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void enterLockStmt(VisualBasic6Parser.LockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void exitLockStmt(VisualBasic6Parser.LockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#lsetStmt}.
	 * @param ctx the parse tree
	 */
	void enterLsetStmt(VisualBasic6Parser.LsetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#lsetStmt}.
	 * @param ctx the parse tree
	 */
	void exitLsetStmt(VisualBasic6Parser.LsetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#macroIfThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroIfThenElseStmt(VisualBasic6Parser.MacroIfThenElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#macroIfThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroIfThenElseStmt(VisualBasic6Parser.MacroIfThenElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#macroIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroIfBlockStmt(VisualBasic6Parser.MacroIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#macroIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroIfBlockStmt(VisualBasic6Parser.MacroIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#macroElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroElseIfBlockStmt(VisualBasic6Parser.MacroElseIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#macroElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroElseIfBlockStmt(VisualBasic6Parser.MacroElseIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#macroElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroElseBlockStmt(VisualBasic6Parser.MacroElseBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#macroElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroElseBlockStmt(VisualBasic6Parser.MacroElseBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#midStmt}.
	 * @param ctx the parse tree
	 */
	void enterMidStmt(VisualBasic6Parser.MidStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#midStmt}.
	 * @param ctx the parse tree
	 */
	void exitMidStmt(VisualBasic6Parser.MidStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#mkdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterMkdirStmt(VisualBasic6Parser.MkdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#mkdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitMkdirStmt(VisualBasic6Parser.MkdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#nameStmt}.
	 * @param ctx the parse tree
	 */
	void enterNameStmt(VisualBasic6Parser.NameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#nameStmt}.
	 * @param ctx the parse tree
	 */
	void exitNameStmt(VisualBasic6Parser.NameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#onErrorStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnErrorStmt(VisualBasic6Parser.OnErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#onErrorStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnErrorStmt(VisualBasic6Parser.OnErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#onGoToStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnGoToStmt(VisualBasic6Parser.OnGoToStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#onGoToStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnGoToStmt(VisualBasic6Parser.OnGoToStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#onGoSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnGoSubStmt(VisualBasic6Parser.OnGoSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#onGoSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnGoSubStmt(VisualBasic6Parser.OnGoSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#openStmt}.
	 * @param ctx the parse tree
	 */
	void enterOpenStmt(VisualBasic6Parser.OpenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#openStmt}.
	 * @param ctx the parse tree
	 */
	void exitOpenStmt(VisualBasic6Parser.OpenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#outputList}.
	 * @param ctx the parse tree
	 */
	void enterOutputList(VisualBasic6Parser.OutputListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#outputList}.
	 * @param ctx the parse tree
	 */
	void exitOutputList(VisualBasic6Parser.OutputListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#outputList_Expression}.
	 * @param ctx the parse tree
	 */
	void enterOutputList_Expression(VisualBasic6Parser.OutputList_ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#outputList_Expression}.
	 * @param ctx the parse tree
	 */
	void exitOutputList_Expression(VisualBasic6Parser.OutputList_ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(VisualBasic6Parser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(VisualBasic6Parser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#propertyGetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetStmt(VisualBasic6Parser.PropertyGetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#propertyGetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetStmt(VisualBasic6Parser.PropertyGetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#propertySetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetStmt(VisualBasic6Parser.PropertySetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#propertySetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetStmt(VisualBasic6Parser.PropertySetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#propertyLetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertyLetStmt(VisualBasic6Parser.PropertyLetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#propertyLetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertyLetStmt(VisualBasic6Parser.PropertyLetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#putStmt}.
	 * @param ctx the parse tree
	 */
	void enterPutStmt(VisualBasic6Parser.PutStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#putStmt}.
	 * @param ctx the parse tree
	 */
	void exitPutStmt(VisualBasic6Parser.PutStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#raiseEventStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseEventStmt(VisualBasic6Parser.RaiseEventStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#raiseEventStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseEventStmt(VisualBasic6Parser.RaiseEventStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#randomizeStmt}.
	 * @param ctx the parse tree
	 */
	void enterRandomizeStmt(VisualBasic6Parser.RandomizeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#randomizeStmt}.
	 * @param ctx the parse tree
	 */
	void exitRandomizeStmt(VisualBasic6Parser.RandomizeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#redimStmt}.
	 * @param ctx the parse tree
	 */
	void enterRedimStmt(VisualBasic6Parser.RedimStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#redimStmt}.
	 * @param ctx the parse tree
	 */
	void exitRedimStmt(VisualBasic6Parser.RedimStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#redimSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterRedimSubStmt(VisualBasic6Parser.RedimSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#redimSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitRedimSubStmt(VisualBasic6Parser.RedimSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#resetStmt}.
	 * @param ctx the parse tree
	 */
	void enterResetStmt(VisualBasic6Parser.ResetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#resetStmt}.
	 * @param ctx the parse tree
	 */
	void exitResetStmt(VisualBasic6Parser.ResetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#resumeStmt}.
	 * @param ctx the parse tree
	 */
	void enterResumeStmt(VisualBasic6Parser.ResumeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#resumeStmt}.
	 * @param ctx the parse tree
	 */
	void exitResumeStmt(VisualBasic6Parser.ResumeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(VisualBasic6Parser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(VisualBasic6Parser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#rmdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterRmdirStmt(VisualBasic6Parser.RmdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#rmdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitRmdirStmt(VisualBasic6Parser.RmdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#rsetStmt}.
	 * @param ctx the parse tree
	 */
	void enterRsetStmt(VisualBasic6Parser.RsetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#rsetStmt}.
	 * @param ctx the parse tree
	 */
	void exitRsetStmt(VisualBasic6Parser.RsetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#savepictureStmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepictureStmt(VisualBasic6Parser.SavepictureStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#savepictureStmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepictureStmt(VisualBasic6Parser.SavepictureStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#saveSettingStmt}.
	 * @param ctx the parse tree
	 */
	void enterSaveSettingStmt(VisualBasic6Parser.SaveSettingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#saveSettingStmt}.
	 * @param ctx the parse tree
	 */
	void exitSaveSettingStmt(VisualBasic6Parser.SaveSettingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#seekStmt}.
	 * @param ctx the parse tree
	 */
	void enterSeekStmt(VisualBasic6Parser.SeekStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#seekStmt}.
	 * @param ctx the parse tree
	 */
	void exitSeekStmt(VisualBasic6Parser.SeekStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#selectCaseStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectCaseStmt(VisualBasic6Parser.SelectCaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#selectCaseStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectCaseStmt(VisualBasic6Parser.SelectCaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#sC_Case}.
	 * @param ctx the parse tree
	 */
	void enterSC_Case(VisualBasic6Parser.SC_CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#sC_Case}.
	 * @param ctx the parse tree
	 */
	void exitSC_Case(VisualBasic6Parser.SC_CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondElse}
	 * labeled alternative in {@link VisualBasic6Parser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondElse(VisualBasic6Parser.CaseCondElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondElse}
	 * labeled alternative in {@link VisualBasic6Parser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondElse(VisualBasic6Parser.CaseCondElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondIs}
	 * labeled alternative in {@link VisualBasic6Parser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondIs(VisualBasic6Parser.CaseCondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondIs}
	 * labeled alternative in {@link VisualBasic6Parser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondIs(VisualBasic6Parser.CaseCondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondValue}
	 * labeled alternative in {@link VisualBasic6Parser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondValue(VisualBasic6Parser.CaseCondValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondValue}
	 * labeled alternative in {@link VisualBasic6Parser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondValue(VisualBasic6Parser.CaseCondValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondTo}
	 * labeled alternative in {@link VisualBasic6Parser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondTo(VisualBasic6Parser.CaseCondToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondTo}
	 * labeled alternative in {@link VisualBasic6Parser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondTo(VisualBasic6Parser.CaseCondToContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#sendkeysStmt}.
	 * @param ctx the parse tree
	 */
	void enterSendkeysStmt(VisualBasic6Parser.SendkeysStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#sendkeysStmt}.
	 * @param ctx the parse tree
	 */
	void exitSendkeysStmt(VisualBasic6Parser.SendkeysStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#setattrStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetattrStmt(VisualBasic6Parser.SetattrStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#setattrStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetattrStmt(VisualBasic6Parser.SetattrStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(VisualBasic6Parser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(VisualBasic6Parser.SetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void enterStopStmt(VisualBasic6Parser.StopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void exitStopStmt(VisualBasic6Parser.StopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#subStmt}.
	 * @param ctx the parse tree
	 */
	void enterSubStmt(VisualBasic6Parser.SubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#subStmt}.
	 * @param ctx the parse tree
	 */
	void exitSubStmt(VisualBasic6Parser.SubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#timeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTimeStmt(VisualBasic6Parser.TimeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#timeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTimeStmt(VisualBasic6Parser.TimeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#typeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeStmt(VisualBasic6Parser.TypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#typeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeStmt(VisualBasic6Parser.TypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#typeStmt_Element}.
	 * @param ctx the parse tree
	 */
	void enterTypeStmt_Element(VisualBasic6Parser.TypeStmt_ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#typeStmt_Element}.
	 * @param ctx the parse tree
	 */
	void exitTypeStmt_Element(VisualBasic6Parser.TypeStmt_ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#typeOfStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfStmt(VisualBasic6Parser.TypeOfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#typeOfStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfStmt(VisualBasic6Parser.TypeOfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#unloadStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnloadStmt(VisualBasic6Parser.UnloadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#unloadStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnloadStmt(VisualBasic6Parser.UnloadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#unlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnlockStmt(VisualBasic6Parser.UnlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#unlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnlockStmt(VisualBasic6Parser.UnlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsStruct}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsStruct(VisualBasic6Parser.VsStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsStruct}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsStruct(VisualBasic6Parser.VsStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAdd}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAdd(VisualBasic6Parser.VsAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAdd}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAdd(VisualBasic6Parser.VsAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLt}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLt(VisualBasic6Parser.VsLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLt}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLt(VisualBasic6Parser.VsLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAddressOf}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAddressOf(VisualBasic6Parser.VsAddressOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAddressOf}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAddressOf(VisualBasic6Parser.VsAddressOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNew}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNew(VisualBasic6Parser.VsNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNew}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNew(VisualBasic6Parser.VsNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMult}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMult(VisualBasic6Parser.VsMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMult}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMult(VisualBasic6Parser.VsMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNegation}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNegation(VisualBasic6Parser.VsNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNegation}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNegation(VisualBasic6Parser.VsNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAssign}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAssign(VisualBasic6Parser.VsAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAssign}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAssign(VisualBasic6Parser.VsAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLike}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLike(VisualBasic6Parser.VsLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLike}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLike(VisualBasic6Parser.VsLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsDiv}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsDiv(VisualBasic6Parser.VsDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsDiv}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsDiv(VisualBasic6Parser.VsDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsPlus}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsPlus(VisualBasic6Parser.VsPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsPlus}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsPlus(VisualBasic6Parser.VsPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNot}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNot(VisualBasic6Parser.VsNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNot}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNot(VisualBasic6Parser.VsNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsGeq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsGeq(VisualBasic6Parser.VsGeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsGeq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsGeq(VisualBasic6Parser.VsGeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsTypeOf}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsTypeOf(VisualBasic6Parser.VsTypeOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsTypeOf}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsTypeOf(VisualBasic6Parser.VsTypeOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsICS}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsICS(VisualBasic6Parser.VsICSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsICS}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsICS(VisualBasic6Parser.VsICSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNeq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNeq(VisualBasic6Parser.VsNeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNeq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNeq(VisualBasic6Parser.VsNeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsXor}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsXor(VisualBasic6Parser.VsXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsXor}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsXor(VisualBasic6Parser.VsXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAnd}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAnd(VisualBasic6Parser.VsAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAnd}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAnd(VisualBasic6Parser.VsAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLeq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLeq(VisualBasic6Parser.VsLeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLeq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLeq(VisualBasic6Parser.VsLeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsPow}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsPow(VisualBasic6Parser.VsPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsPow}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsPow(VisualBasic6Parser.VsPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsIs}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsIs(VisualBasic6Parser.VsIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsIs}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsIs(VisualBasic6Parser.VsIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMod}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMod(VisualBasic6Parser.VsModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMod}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMod(VisualBasic6Parser.VsModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAmp}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAmp(VisualBasic6Parser.VsAmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAmp}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAmp(VisualBasic6Parser.VsAmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsOr}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsOr(VisualBasic6Parser.VsOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsOr}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsOr(VisualBasic6Parser.VsOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMinus}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMinus(VisualBasic6Parser.VsMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMinus}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMinus(VisualBasic6Parser.VsMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLiteral}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLiteral(VisualBasic6Parser.VsLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLiteral}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLiteral(VisualBasic6Parser.VsLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsEqv}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsEqv(VisualBasic6Parser.VsEqvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsEqv}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsEqv(VisualBasic6Parser.VsEqvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsImp}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsImp(VisualBasic6Parser.VsImpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsImp}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsImp(VisualBasic6Parser.VsImpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsGt}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsGt(VisualBasic6Parser.VsGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsGt}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsGt(VisualBasic6Parser.VsGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsEq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsEq(VisualBasic6Parser.VsEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsEq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsEq(VisualBasic6Parser.VsEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMid}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMid(VisualBasic6Parser.VsMidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMid}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMid(VisualBasic6Parser.VsMidContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableStmt(VisualBasic6Parser.VariableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableStmt(VisualBasic6Parser.VariableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#variableListStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableListStmt(VisualBasic6Parser.VariableListStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#variableListStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableListStmt(VisualBasic6Parser.VariableListStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#variableSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableSubStmt(VisualBasic6Parser.VariableSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#variableSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableSubStmt(VisualBasic6Parser.VariableSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#whileWendStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileWendStmt(VisualBasic6Parser.WhileWendStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#whileWendStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileWendStmt(VisualBasic6Parser.WhileWendStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#widthStmt}.
	 * @param ctx the parse tree
	 */
	void enterWidthStmt(VisualBasic6Parser.WidthStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#widthStmt}.
	 * @param ctx the parse tree
	 */
	void exitWidthStmt(VisualBasic6Parser.WidthStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#withStmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(VisualBasic6Parser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#withStmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(VisualBasic6Parser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(VisualBasic6Parser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(VisualBasic6Parser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#explicitCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplicitCallStmt(VisualBasic6Parser.ExplicitCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#explicitCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplicitCallStmt(VisualBasic6Parser.ExplicitCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#eCS_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterECS_ProcedureCall(VisualBasic6Parser.ECS_ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#eCS_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitECS_ProcedureCall(VisualBasic6Parser.ECS_ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#eCS_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterECS_MemberProcedureCall(VisualBasic6Parser.ECS_MemberProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#eCS_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitECS_MemberProcedureCall(VisualBasic6Parser.ECS_MemberProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#implicitCallStmt_InBlock}.
	 * @param ctx the parse tree
	 */
	void enterImplicitCallStmt_InBlock(VisualBasic6Parser.ImplicitCallStmt_InBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#implicitCallStmt_InBlock}.
	 * @param ctx the parse tree
	 */
	void exitImplicitCallStmt_InBlock(VisualBasic6Parser.ImplicitCallStmt_InBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#iCS_B_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_B_ProcedureCall(VisualBasic6Parser.ICS_B_ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#iCS_B_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_B_ProcedureCall(VisualBasic6Parser.ICS_B_ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#iCS_B_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_B_MemberProcedureCall(VisualBasic6Parser.ICS_B_MemberProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#iCS_B_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_B_MemberProcedureCall(VisualBasic6Parser.ICS_B_MemberProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#implicitCallStmt_InStmt}.
	 * @param ctx the parse tree
	 */
	void enterImplicitCallStmt_InStmt(VisualBasic6Parser.ImplicitCallStmt_InStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#implicitCallStmt_InStmt}.
	 * @param ctx the parse tree
	 */
	void exitImplicitCallStmt_InStmt(VisualBasic6Parser.ImplicitCallStmt_InStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#iCS_S_VariableOrProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_VariableOrProcedureCall(VisualBasic6Parser.ICS_S_VariableOrProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#iCS_S_VariableOrProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_VariableOrProcedureCall(VisualBasic6Parser.ICS_S_VariableOrProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#iCS_S_ProcedureOrArrayCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_ProcedureOrArrayCall(VisualBasic6Parser.ICS_S_ProcedureOrArrayCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#iCS_S_ProcedureOrArrayCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_ProcedureOrArrayCall(VisualBasic6Parser.ICS_S_ProcedureOrArrayCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#iCS_S_MembersCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_MembersCall(VisualBasic6Parser.ICS_S_MembersCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#iCS_S_MembersCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_MembersCall(VisualBasic6Parser.ICS_S_MembersCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#iCS_S_MemberCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_MemberCall(VisualBasic6Parser.ICS_S_MemberCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#iCS_S_MemberCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_MemberCall(VisualBasic6Parser.ICS_S_MemberCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#iCS_S_DictionaryCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_DictionaryCall(VisualBasic6Parser.ICS_S_DictionaryCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#iCS_S_DictionaryCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_DictionaryCall(VisualBasic6Parser.ICS_S_DictionaryCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#argsCall}.
	 * @param ctx the parse tree
	 */
	void enterArgsCall(VisualBasic6Parser.ArgsCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#argsCall}.
	 * @param ctx the parse tree
	 */
	void exitArgsCall(VisualBasic6Parser.ArgsCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#argCall}.
	 * @param ctx the parse tree
	 */
	void enterArgCall(VisualBasic6Parser.ArgCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#argCall}.
	 * @param ctx the parse tree
	 */
	void exitArgCall(VisualBasic6Parser.ArgCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#dictionaryCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryCallStmt(VisualBasic6Parser.DictionaryCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#dictionaryCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryCallStmt(VisualBasic6Parser.DictionaryCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(VisualBasic6Parser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(VisualBasic6Parser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(VisualBasic6Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(VisualBasic6Parser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#argDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterArgDefaultValue(VisualBasic6Parser.ArgDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#argDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitArgDefaultValue(VisualBasic6Parser.ArgDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(VisualBasic6Parser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(VisualBasic6Parser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(VisualBasic6Parser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(VisualBasic6Parser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#ambiguousIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousIdentifier(VisualBasic6Parser.AmbiguousIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#ambiguousIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousIdentifier(VisualBasic6Parser.AmbiguousIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#asTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeClause(VisualBasic6Parser.AsTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#asTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeClause(VisualBasic6Parser.AsTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(VisualBasic6Parser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(VisualBasic6Parser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#certainIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCertainIdentifier(VisualBasic6Parser.CertainIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#certainIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCertainIdentifier(VisualBasic6Parser.CertainIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(VisualBasic6Parser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(VisualBasic6Parser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(VisualBasic6Parser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(VisualBasic6Parser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(VisualBasic6Parser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(VisualBasic6Parser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#letterrange}.
	 * @param ctx the parse tree
	 */
	void enterLetterrange(VisualBasic6Parser.LetterrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#letterrange}.
	 * @param ctx the parse tree
	 */
	void exitLetterrange(VisualBasic6Parser.LetterrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#lineLabel}.
	 * @param ctx the parse tree
	 */
	void enterLineLabel(VisualBasic6Parser.LineLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#lineLabel}.
	 * @param ctx the parse tree
	 */
	void exitLineLabel(VisualBasic6Parser.LineLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(VisualBasic6Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(VisualBasic6Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(VisualBasic6Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(VisualBasic6Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#typeHint}.
	 * @param ctx the parse tree
	 */
	void enterTypeHint(VisualBasic6Parser.TypeHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#typeHint}.
	 * @param ctx the parse tree
	 */
	void exitTypeHint(VisualBasic6Parser.TypeHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(VisualBasic6Parser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(VisualBasic6Parser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasic6Parser#ambiguousKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousKeyword(VisualBasic6Parser.AmbiguousKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasic6Parser#ambiguousKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousKeyword(VisualBasic6Parser.AmbiguousKeywordContext ctx);
}