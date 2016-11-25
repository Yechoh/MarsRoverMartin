package robot.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import robot.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'forward'", "'backward'", "'stop'", "'touchLeft'", "'touchRight'", "'NONE'", "'BLACK'", "'BLUE'", "'GREEN'", "'YELLOW'", "'RED'", "'WHITE'", "'BROWN'", "'Behavior'", "'IF'", "'THEN'", "'END'", "'leftMotor'", "'rightMotor'", "'rotate'", "'AND'", "'OR'", "'('", "')'", "'touch:'", "'color:'", "'sonar:'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }


    	private DSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRobotBehavior"
    // InternalDSL.g:53:1: entryRuleRobotBehavior : ruleRobotBehavior EOF ;
    public final void entryRuleRobotBehavior() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleRobotBehavior EOF )
            // InternalDSL.g:55:1: ruleRobotBehavior EOF
            {
             before(grammarAccess.getRobotBehaviorRule()); 
            pushFollow(FOLLOW_1);
            ruleRobotBehavior();

            state._fsp--;

             after(grammarAccess.getRobotBehaviorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobotBehavior"


    // $ANTLR start "ruleRobotBehavior"
    // InternalDSL.g:62:1: ruleRobotBehavior : ( ( ( rule__RobotBehavior__BehaviorlistAssignment ) ) ( ( rule__RobotBehavior__BehaviorlistAssignment )* ) ) ;
    public final void ruleRobotBehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( ( rule__RobotBehavior__BehaviorlistAssignment ) ) ( ( rule__RobotBehavior__BehaviorlistAssignment )* ) ) )
            // InternalDSL.g:67:2: ( ( ( rule__RobotBehavior__BehaviorlistAssignment ) ) ( ( rule__RobotBehavior__BehaviorlistAssignment )* ) )
            {
            // InternalDSL.g:67:2: ( ( ( rule__RobotBehavior__BehaviorlistAssignment ) ) ( ( rule__RobotBehavior__BehaviorlistAssignment )* ) )
            // InternalDSL.g:68:3: ( ( rule__RobotBehavior__BehaviorlistAssignment ) ) ( ( rule__RobotBehavior__BehaviorlistAssignment )* )
            {
            // InternalDSL.g:68:3: ( ( rule__RobotBehavior__BehaviorlistAssignment ) )
            // InternalDSL.g:69:4: ( rule__RobotBehavior__BehaviorlistAssignment )
            {
             before(grammarAccess.getRobotBehaviorAccess().getBehaviorlistAssignment()); 
            // InternalDSL.g:70:4: ( rule__RobotBehavior__BehaviorlistAssignment )
            // InternalDSL.g:70:5: rule__RobotBehavior__BehaviorlistAssignment
            {
            pushFollow(FOLLOW_3);
            rule__RobotBehavior__BehaviorlistAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRobotBehaviorAccess().getBehaviorlistAssignment()); 

            }

            // InternalDSL.g:73:3: ( ( rule__RobotBehavior__BehaviorlistAssignment )* )
            // InternalDSL.g:74:4: ( rule__RobotBehavior__BehaviorlistAssignment )*
            {
             before(grammarAccess.getRobotBehaviorAccess().getBehaviorlistAssignment()); 
            // InternalDSL.g:75:4: ( rule__RobotBehavior__BehaviorlistAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDSL.g:75:5: rule__RobotBehavior__BehaviorlistAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__RobotBehavior__BehaviorlistAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRobotBehaviorAccess().getBehaviorlistAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobotBehavior"


    // $ANTLR start "entryRuleBehaviors"
    // InternalDSL.g:85:1: entryRuleBehaviors : ruleBehaviors EOF ;
    public final void entryRuleBehaviors() throws RecognitionException {
        try {
            // InternalDSL.g:86:1: ( ruleBehaviors EOF )
            // InternalDSL.g:87:1: ruleBehaviors EOF
            {
             before(grammarAccess.getBehaviorsRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviors();

            state._fsp--;

             after(grammarAccess.getBehaviorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehaviors"


    // $ANTLR start "ruleBehaviors"
    // InternalDSL.g:94:1: ruleBehaviors : ( ( rule__Behaviors__Group__0 ) ) ;
    public final void ruleBehaviors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:98:2: ( ( ( rule__Behaviors__Group__0 ) ) )
            // InternalDSL.g:99:2: ( ( rule__Behaviors__Group__0 ) )
            {
            // InternalDSL.g:99:2: ( ( rule__Behaviors__Group__0 ) )
            // InternalDSL.g:100:3: ( rule__Behaviors__Group__0 )
            {
             before(grammarAccess.getBehaviorsAccess().getGroup()); 
            // InternalDSL.g:101:3: ( rule__Behaviors__Group__0 )
            // InternalDSL.g:101:4: rule__Behaviors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Behaviors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviors"


    // $ANTLR start "entryRuleExpression"
    // InternalDSL.g:110:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDSL.g:111:1: ( ruleExpression EOF )
            // InternalDSL.g:112:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDSL.g:119:1: ruleExpression : ( ruleExpression1 ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:123:2: ( ( ruleExpression1 ) )
            // InternalDSL.g:124:2: ( ruleExpression1 )
            {
            // InternalDSL.g:124:2: ( ruleExpression1 )
            // InternalDSL.g:125:3: ruleExpression1
            {
             before(grammarAccess.getExpressionAccess().getExpression1ParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpression1();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpression1ParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleActions"
    // InternalDSL.g:135:1: entryRuleActions : ruleActions EOF ;
    public final void entryRuleActions() throws RecognitionException {
        try {
            // InternalDSL.g:136:1: ( ruleActions EOF )
            // InternalDSL.g:137:1: ruleActions EOF
            {
             before(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getActionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalDSL.g:144:1: ruleActions : ( ( rule__Actions__Alternatives ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:148:2: ( ( ( rule__Actions__Alternatives ) ) )
            // InternalDSL.g:149:2: ( ( rule__Actions__Alternatives ) )
            {
            // InternalDSL.g:149:2: ( ( rule__Actions__Alternatives ) )
            // InternalDSL.g:150:3: ( rule__Actions__Alternatives )
            {
             before(grammarAccess.getActionsAccess().getAlternatives()); 
            // InternalDSL.g:151:3: ( rule__Actions__Alternatives )
            // InternalDSL.g:151:4: rule__Actions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleLeftMovementAction"
    // InternalDSL.g:160:1: entryRuleLeftMovementAction : ruleLeftMovementAction EOF ;
    public final void entryRuleLeftMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:161:1: ( ruleLeftMovementAction EOF )
            // InternalDSL.g:162:1: ruleLeftMovementAction EOF
            {
             before(grammarAccess.getLeftMovementActionRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftMovementAction();

            state._fsp--;

             after(grammarAccess.getLeftMovementActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeftMovementAction"


    // $ANTLR start "ruleLeftMovementAction"
    // InternalDSL.g:169:1: ruleLeftMovementAction : ( ( rule__LeftMovementAction__Group__0 ) ) ;
    public final void ruleLeftMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:173:2: ( ( ( rule__LeftMovementAction__Group__0 ) ) )
            // InternalDSL.g:174:2: ( ( rule__LeftMovementAction__Group__0 ) )
            {
            // InternalDSL.g:174:2: ( ( rule__LeftMovementAction__Group__0 ) )
            // InternalDSL.g:175:3: ( rule__LeftMovementAction__Group__0 )
            {
             before(grammarAccess.getLeftMovementActionAccess().getGroup()); 
            // InternalDSL.g:176:3: ( rule__LeftMovementAction__Group__0 )
            // InternalDSL.g:176:4: rule__LeftMovementAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftMovementAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftMovementActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftMovementAction"


    // $ANTLR start "entryRuleRightMovementAction"
    // InternalDSL.g:185:1: entryRuleRightMovementAction : ruleRightMovementAction EOF ;
    public final void entryRuleRightMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:186:1: ( ruleRightMovementAction EOF )
            // InternalDSL.g:187:1: ruleRightMovementAction EOF
            {
             before(grammarAccess.getRightMovementActionRule()); 
            pushFollow(FOLLOW_1);
            ruleRightMovementAction();

            state._fsp--;

             after(grammarAccess.getRightMovementActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightMovementAction"


    // $ANTLR start "ruleRightMovementAction"
    // InternalDSL.g:194:1: ruleRightMovementAction : ( ( rule__RightMovementAction__Group__0 ) ) ;
    public final void ruleRightMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:198:2: ( ( ( rule__RightMovementAction__Group__0 ) ) )
            // InternalDSL.g:199:2: ( ( rule__RightMovementAction__Group__0 ) )
            {
            // InternalDSL.g:199:2: ( ( rule__RightMovementAction__Group__0 ) )
            // InternalDSL.g:200:3: ( rule__RightMovementAction__Group__0 )
            {
             before(grammarAccess.getRightMovementActionAccess().getGroup()); 
            // InternalDSL.g:201:3: ( rule__RightMovementAction__Group__0 )
            // InternalDSL.g:201:4: rule__RightMovementAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightMovementAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightMovementActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightMovementAction"


    // $ANTLR start "entryRuleRotateMovementAction"
    // InternalDSL.g:210:1: entryRuleRotateMovementAction : ruleRotateMovementAction EOF ;
    public final void entryRuleRotateMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:211:1: ( ruleRotateMovementAction EOF )
            // InternalDSL.g:212:1: ruleRotateMovementAction EOF
            {
             before(grammarAccess.getRotateMovementActionRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateMovementAction();

            state._fsp--;

             after(grammarAccess.getRotateMovementActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotateMovementAction"


    // $ANTLR start "ruleRotateMovementAction"
    // InternalDSL.g:219:1: ruleRotateMovementAction : ( ( rule__RotateMovementAction__Group__0 ) ) ;
    public final void ruleRotateMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:223:2: ( ( ( rule__RotateMovementAction__Group__0 ) ) )
            // InternalDSL.g:224:2: ( ( rule__RotateMovementAction__Group__0 ) )
            {
            // InternalDSL.g:224:2: ( ( rule__RotateMovementAction__Group__0 ) )
            // InternalDSL.g:225:3: ( rule__RotateMovementAction__Group__0 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getGroup()); 
            // InternalDSL.g:226:3: ( rule__RotateMovementAction__Group__0 )
            // InternalDSL.g:226:4: rule__RotateMovementAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateMovementActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotateMovementAction"


    // $ANTLR start "entryRuleMovementAction"
    // InternalDSL.g:235:1: entryRuleMovementAction : ruleMovementAction EOF ;
    public final void entryRuleMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:236:1: ( ruleMovementAction EOF )
            // InternalDSL.g:237:1: ruleMovementAction EOF
            {
             before(grammarAccess.getMovementActionRule()); 
            pushFollow(FOLLOW_1);
            ruleMovementAction();

            state._fsp--;

             after(grammarAccess.getMovementActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMovementAction"


    // $ANTLR start "ruleMovementAction"
    // InternalDSL.g:244:1: ruleMovementAction : ( ( rule__MovementAction__ActionenumAssignment ) ) ;
    public final void ruleMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:248:2: ( ( ( rule__MovementAction__ActionenumAssignment ) ) )
            // InternalDSL.g:249:2: ( ( rule__MovementAction__ActionenumAssignment ) )
            {
            // InternalDSL.g:249:2: ( ( rule__MovementAction__ActionenumAssignment ) )
            // InternalDSL.g:250:3: ( rule__MovementAction__ActionenumAssignment )
            {
             before(grammarAccess.getMovementActionAccess().getActionenumAssignment()); 
            // InternalDSL.g:251:3: ( rule__MovementAction__ActionenumAssignment )
            // InternalDSL.g:251:4: rule__MovementAction__ActionenumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MovementAction__ActionenumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMovementActionAccess().getActionenumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovementAction"


    // $ANTLR start "entryRuleExpression1"
    // InternalDSL.g:260:1: entryRuleExpression1 : ruleExpression1 EOF ;
    public final void entryRuleExpression1() throws RecognitionException {
        try {
            // InternalDSL.g:261:1: ( ruleExpression1 EOF )
            // InternalDSL.g:262:1: ruleExpression1 EOF
            {
             before(grammarAccess.getExpression1Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression1();

            state._fsp--;

             after(grammarAccess.getExpression1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression1"


    // $ANTLR start "ruleExpression1"
    // InternalDSL.g:269:1: ruleExpression1 : ( ( rule__Expression1__Group__0 ) ) ;
    public final void ruleExpression1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:273:2: ( ( ( rule__Expression1__Group__0 ) ) )
            // InternalDSL.g:274:2: ( ( rule__Expression1__Group__0 ) )
            {
            // InternalDSL.g:274:2: ( ( rule__Expression1__Group__0 ) )
            // InternalDSL.g:275:3: ( rule__Expression1__Group__0 )
            {
             before(grammarAccess.getExpression1Access().getGroup()); 
            // InternalDSL.g:276:3: ( rule__Expression1__Group__0 )
            // InternalDSL.g:276:4: rule__Expression1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression1"


    // $ANTLR start "entryRuleExpression2"
    // InternalDSL.g:285:1: entryRuleExpression2 : ruleExpression2 EOF ;
    public final void entryRuleExpression2() throws RecognitionException {
        try {
            // InternalDSL.g:286:1: ( ruleExpression2 EOF )
            // InternalDSL.g:287:1: ruleExpression2 EOF
            {
             before(grammarAccess.getExpression2Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression2"


    // $ANTLR start "ruleExpression2"
    // InternalDSL.g:294:1: ruleExpression2 : ( ( rule__Expression2__Group__0 ) ) ;
    public final void ruleExpression2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:298:2: ( ( ( rule__Expression2__Group__0 ) ) )
            // InternalDSL.g:299:2: ( ( rule__Expression2__Group__0 ) )
            {
            // InternalDSL.g:299:2: ( ( rule__Expression2__Group__0 ) )
            // InternalDSL.g:300:3: ( rule__Expression2__Group__0 )
            {
             before(grammarAccess.getExpression2Access().getGroup()); 
            // InternalDSL.g:301:3: ( rule__Expression2__Group__0 )
            // InternalDSL.g:301:4: rule__Expression2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression2"


    // $ANTLR start "entryRuleExpression3"
    // InternalDSL.g:310:1: entryRuleExpression3 : ruleExpression3 EOF ;
    public final void entryRuleExpression3() throws RecognitionException {
        try {
            // InternalDSL.g:311:1: ( ruleExpression3 EOF )
            // InternalDSL.g:312:1: ruleExpression3 EOF
            {
             before(grammarAccess.getExpression3Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression3"


    // $ANTLR start "ruleExpression3"
    // InternalDSL.g:319:1: ruleExpression3 : ( ( rule__Expression3__Alternatives ) ) ;
    public final void ruleExpression3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:323:2: ( ( ( rule__Expression3__Alternatives ) ) )
            // InternalDSL.g:324:2: ( ( rule__Expression3__Alternatives ) )
            {
            // InternalDSL.g:324:2: ( ( rule__Expression3__Alternatives ) )
            // InternalDSL.g:325:3: ( rule__Expression3__Alternatives )
            {
             before(grammarAccess.getExpression3Access().getAlternatives()); 
            // InternalDSL.g:326:3: ( rule__Expression3__Alternatives )
            // InternalDSL.g:326:4: rule__Expression3__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpression3Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression3"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalDSL.g:335:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalDSL.g:336:1: ( ruleExpressionBracket EOF )
            // InternalDSL.g:337:1: ruleExpressionBracket EOF
            {
             before(grammarAccess.getExpressionBracketRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionBracket();

            state._fsp--;

             after(grammarAccess.getExpressionBracketRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalDSL.g:344:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:348:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalDSL.g:349:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalDSL.g:349:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalDSL.g:350:3: ( rule__ExpressionBracket__Group__0 )
            {
             before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            // InternalDSL.g:351:3: ( rule__ExpressionBracket__Group__0 )
            // InternalDSL.g:351:4: rule__ExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBracketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleTouchLiteral"
    // InternalDSL.g:360:1: entryRuleTouchLiteral : ruleTouchLiteral EOF ;
    public final void entryRuleTouchLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:361:1: ( ruleTouchLiteral EOF )
            // InternalDSL.g:362:1: ruleTouchLiteral EOF
            {
             before(grammarAccess.getTouchLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleTouchLiteral();

            state._fsp--;

             after(grammarAccess.getTouchLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTouchLiteral"


    // $ANTLR start "ruleTouchLiteral"
    // InternalDSL.g:369:1: ruleTouchLiteral : ( ( rule__TouchLiteral__Group__0 ) ) ;
    public final void ruleTouchLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:373:2: ( ( ( rule__TouchLiteral__Group__0 ) ) )
            // InternalDSL.g:374:2: ( ( rule__TouchLiteral__Group__0 ) )
            {
            // InternalDSL.g:374:2: ( ( rule__TouchLiteral__Group__0 ) )
            // InternalDSL.g:375:3: ( rule__TouchLiteral__Group__0 )
            {
             before(grammarAccess.getTouchLiteralAccess().getGroup()); 
            // InternalDSL.g:376:3: ( rule__TouchLiteral__Group__0 )
            // InternalDSL.g:376:4: rule__TouchLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TouchLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTouchLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTouchLiteral"


    // $ANTLR start "entryRuleColorLiteral"
    // InternalDSL.g:385:1: entryRuleColorLiteral : ruleColorLiteral EOF ;
    public final void entryRuleColorLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:386:1: ( ruleColorLiteral EOF )
            // InternalDSL.g:387:1: ruleColorLiteral EOF
            {
             before(grammarAccess.getColorLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleColorLiteral();

            state._fsp--;

             after(grammarAccess.getColorLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColorLiteral"


    // $ANTLR start "ruleColorLiteral"
    // InternalDSL.g:394:1: ruleColorLiteral : ( ( rule__ColorLiteral__Group__0 ) ) ;
    public final void ruleColorLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:398:2: ( ( ( rule__ColorLiteral__Group__0 ) ) )
            // InternalDSL.g:399:2: ( ( rule__ColorLiteral__Group__0 ) )
            {
            // InternalDSL.g:399:2: ( ( rule__ColorLiteral__Group__0 ) )
            // InternalDSL.g:400:3: ( rule__ColorLiteral__Group__0 )
            {
             before(grammarAccess.getColorLiteralAccess().getGroup()); 
            // InternalDSL.g:401:3: ( rule__ColorLiteral__Group__0 )
            // InternalDSL.g:401:4: rule__ColorLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorLiteral"


    // $ANTLR start "entryRuleDistanceLiteral"
    // InternalDSL.g:410:1: entryRuleDistanceLiteral : ruleDistanceLiteral EOF ;
    public final void entryRuleDistanceLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:411:1: ( ruleDistanceLiteral EOF )
            // InternalDSL.g:412:1: ruleDistanceLiteral EOF
            {
             before(grammarAccess.getDistanceLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleDistanceLiteral();

            state._fsp--;

             after(grammarAccess.getDistanceLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDistanceLiteral"


    // $ANTLR start "ruleDistanceLiteral"
    // InternalDSL.g:419:1: ruleDistanceLiteral : ( ( rule__DistanceLiteral__Group__0 ) ) ;
    public final void ruleDistanceLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:423:2: ( ( ( rule__DistanceLiteral__Group__0 ) ) )
            // InternalDSL.g:424:2: ( ( rule__DistanceLiteral__Group__0 ) )
            {
            // InternalDSL.g:424:2: ( ( rule__DistanceLiteral__Group__0 ) )
            // InternalDSL.g:425:3: ( rule__DistanceLiteral__Group__0 )
            {
             before(grammarAccess.getDistanceLiteralAccess().getGroup()); 
            // InternalDSL.g:426:3: ( rule__DistanceLiteral__Group__0 )
            // InternalDSL.g:426:4: rule__DistanceLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistanceLiteral"


    // $ANTLR start "ruleRotateEnum"
    // InternalDSL.g:435:1: ruleRotateEnum : ( ( rule__RotateEnum__Alternatives ) ) ;
    public final void ruleRotateEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:439:1: ( ( ( rule__RotateEnum__Alternatives ) ) )
            // InternalDSL.g:440:2: ( ( rule__RotateEnum__Alternatives ) )
            {
            // InternalDSL.g:440:2: ( ( rule__RotateEnum__Alternatives ) )
            // InternalDSL.g:441:3: ( rule__RotateEnum__Alternatives )
            {
             before(grammarAccess.getRotateEnumAccess().getAlternatives()); 
            // InternalDSL.g:442:3: ( rule__RotateEnum__Alternatives )
            // InternalDSL.g:442:4: rule__RotateEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RotateEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRotateEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotateEnum"


    // $ANTLR start "ruleActionEnum"
    // InternalDSL.g:451:1: ruleActionEnum : ( ( rule__ActionEnum__Alternatives ) ) ;
    public final void ruleActionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:455:1: ( ( ( rule__ActionEnum__Alternatives ) ) )
            // InternalDSL.g:456:2: ( ( rule__ActionEnum__Alternatives ) )
            {
            // InternalDSL.g:456:2: ( ( rule__ActionEnum__Alternatives ) )
            // InternalDSL.g:457:3: ( rule__ActionEnum__Alternatives )
            {
             before(grammarAccess.getActionEnumAccess().getAlternatives()); 
            // InternalDSL.g:458:3: ( rule__ActionEnum__Alternatives )
            // InternalDSL.g:458:4: rule__ActionEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionEnum"


    // $ANTLR start "ruleTouchEnum"
    // InternalDSL.g:467:1: ruleTouchEnum : ( ( rule__TouchEnum__Alternatives ) ) ;
    public final void ruleTouchEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:471:1: ( ( ( rule__TouchEnum__Alternatives ) ) )
            // InternalDSL.g:472:2: ( ( rule__TouchEnum__Alternatives ) )
            {
            // InternalDSL.g:472:2: ( ( rule__TouchEnum__Alternatives ) )
            // InternalDSL.g:473:3: ( rule__TouchEnum__Alternatives )
            {
             before(grammarAccess.getTouchEnumAccess().getAlternatives()); 
            // InternalDSL.g:474:3: ( rule__TouchEnum__Alternatives )
            // InternalDSL.g:474:4: rule__TouchEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TouchEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTouchEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTouchEnum"


    // $ANTLR start "ruleColorEnum"
    // InternalDSL.g:483:1: ruleColorEnum : ( ( rule__ColorEnum__Alternatives ) ) ;
    public final void ruleColorEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:487:1: ( ( ( rule__ColorEnum__Alternatives ) ) )
            // InternalDSL.g:488:2: ( ( rule__ColorEnum__Alternatives ) )
            {
            // InternalDSL.g:488:2: ( ( rule__ColorEnum__Alternatives ) )
            // InternalDSL.g:489:3: ( rule__ColorEnum__Alternatives )
            {
             before(grammarAccess.getColorEnumAccess().getAlternatives()); 
            // InternalDSL.g:490:3: ( rule__ColorEnum__Alternatives )
            // InternalDSL.g:490:4: rule__ColorEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColorEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorEnum"


    // $ANTLR start "rule__Actions__Alternatives"
    // InternalDSL.g:498:1: rule__Actions__Alternatives : ( ( ruleLeftMovementAction ) | ( ruleRightMovementAction ) | ( ruleRotateMovementAction ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:502:1: ( ( ruleLeftMovementAction ) | ( ruleRightMovementAction ) | ( ruleRotateMovementAction ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:503:2: ( ruleLeftMovementAction )
                    {
                    // InternalDSL.g:503:2: ( ruleLeftMovementAction )
                    // InternalDSL.g:504:3: ruleLeftMovementAction
                    {
                     before(grammarAccess.getActionsAccess().getLeftMovementActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLeftMovementAction();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getLeftMovementActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:509:2: ( ruleRightMovementAction )
                    {
                    // InternalDSL.g:509:2: ( ruleRightMovementAction )
                    // InternalDSL.g:510:3: ruleRightMovementAction
                    {
                     before(grammarAccess.getActionsAccess().getRightMovementActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightMovementAction();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getRightMovementActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:515:2: ( ruleRotateMovementAction )
                    {
                    // InternalDSL.g:515:2: ( ruleRotateMovementAction )
                    // InternalDSL.g:516:3: ruleRotateMovementAction
                    {
                     before(grammarAccess.getActionsAccess().getRotateMovementActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateMovementAction();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getRotateMovementActionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Alternatives"


    // $ANTLR start "rule__Expression3__Alternatives"
    // InternalDSL.g:525:1: rule__Expression3__Alternatives : ( ( ruleExpressionBracket ) | ( ruleTouchLiteral ) | ( ruleColorLiteral ) | ( ruleDistanceLiteral ) );
    public final void rule__Expression3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:529:1: ( ( ruleExpressionBracket ) | ( ruleTouchLiteral ) | ( ruleColorLiteral ) | ( ruleDistanceLiteral ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 36:
                {
                alt3=3;
                }
                break;
            case 37:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSL.g:530:2: ( ruleExpressionBracket )
                    {
                    // InternalDSL.g:530:2: ( ruleExpressionBracket )
                    // InternalDSL.g:531:3: ruleExpressionBracket
                    {
                     before(grammarAccess.getExpression3Access().getExpressionBracketParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionBracket();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getExpressionBracketParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:536:2: ( ruleTouchLiteral )
                    {
                    // InternalDSL.g:536:2: ( ruleTouchLiteral )
                    // InternalDSL.g:537:3: ruleTouchLiteral
                    {
                     before(grammarAccess.getExpression3Access().getTouchLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTouchLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getTouchLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:542:2: ( ruleColorLiteral )
                    {
                    // InternalDSL.g:542:2: ( ruleColorLiteral )
                    // InternalDSL.g:543:3: ruleColorLiteral
                    {
                     before(grammarAccess.getExpression3Access().getColorLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColorLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getColorLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:548:2: ( ruleDistanceLiteral )
                    {
                    // InternalDSL.g:548:2: ( ruleDistanceLiteral )
                    // InternalDSL.g:549:3: ruleDistanceLiteral
                    {
                     before(grammarAccess.getExpression3Access().getDistanceLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getDistanceLiteralParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Alternatives"


    // $ANTLR start "rule__RotateEnum__Alternatives"
    // InternalDSL.g:558:1: rule__RotateEnum__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__RotateEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:562:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:563:2: ( ( 'forward' ) )
                    {
                    // InternalDSL.g:563:2: ( ( 'forward' ) )
                    // InternalDSL.g:564:3: ( 'forward' )
                    {
                     before(grammarAccess.getRotateEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:565:3: ( 'forward' )
                    // InternalDSL.g:565:4: 'forward'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getRotateEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:569:2: ( ( 'backward' ) )
                    {
                    // InternalDSL.g:569:2: ( ( 'backward' ) )
                    // InternalDSL.g:570:3: ( 'backward' )
                    {
                     before(grammarAccess.getRotateEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:571:3: ( 'backward' )
                    // InternalDSL.g:571:4: 'backward'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getRotateEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateEnum__Alternatives"


    // $ANTLR start "rule__ActionEnum__Alternatives"
    // InternalDSL.g:579:1: rule__ActionEnum__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) );
    public final void rule__ActionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:583:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDSL.g:584:2: ( ( 'forward' ) )
                    {
                    // InternalDSL.g:584:2: ( ( 'forward' ) )
                    // InternalDSL.g:585:3: ( 'forward' )
                    {
                     before(grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:586:3: ( 'forward' )
                    // InternalDSL.g:586:4: 'forward'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:590:2: ( ( 'backward' ) )
                    {
                    // InternalDSL.g:590:2: ( ( 'backward' ) )
                    // InternalDSL.g:591:3: ( 'backward' )
                    {
                     before(grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:592:3: ( 'backward' )
                    // InternalDSL.g:592:4: 'backward'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:596:2: ( ( 'stop' ) )
                    {
                    // InternalDSL.g:596:2: ( ( 'stop' ) )
                    // InternalDSL.g:597:3: ( 'stop' )
                    {
                     before(grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:598:3: ( 'stop' )
                    // InternalDSL.g:598:4: 'stop'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionEnum__Alternatives"


    // $ANTLR start "rule__TouchEnum__Alternatives"
    // InternalDSL.g:606:1: rule__TouchEnum__Alternatives : ( ( ( 'touchLeft' ) ) | ( ( 'touchRight' ) ) );
    public final void rule__TouchEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:610:1: ( ( ( 'touchLeft' ) ) | ( ( 'touchRight' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:611:2: ( ( 'touchLeft' ) )
                    {
                    // InternalDSL.g:611:2: ( ( 'touchLeft' ) )
                    // InternalDSL.g:612:3: ( 'touchLeft' )
                    {
                     before(grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:613:3: ( 'touchLeft' )
                    // InternalDSL.g:613:4: 'touchLeft'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:617:2: ( ( 'touchRight' ) )
                    {
                    // InternalDSL.g:617:2: ( ( 'touchRight' ) )
                    // InternalDSL.g:618:3: ( 'touchRight' )
                    {
                     before(grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:619:3: ( 'touchRight' )
                    // InternalDSL.g:619:4: 'touchRight'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchEnum__Alternatives"


    // $ANTLR start "rule__ColorEnum__Alternatives"
    // InternalDSL.g:627:1: rule__ColorEnum__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'GREEN' ) ) | ( ( 'YELLOW' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'BROWN' ) ) );
    public final void rule__ColorEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:631:1: ( ( ( 'NONE' ) ) | ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'GREEN' ) ) | ( ( 'YELLOW' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'BROWN' ) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:632:2: ( ( 'NONE' ) )
                    {
                    // InternalDSL.g:632:2: ( ( 'NONE' ) )
                    // InternalDSL.g:633:3: ( 'NONE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:634:3: ( 'NONE' )
                    // InternalDSL.g:634:4: 'NONE'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:638:2: ( ( 'BLACK' ) )
                    {
                    // InternalDSL.g:638:2: ( ( 'BLACK' ) )
                    // InternalDSL.g:639:3: ( 'BLACK' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:640:3: ( 'BLACK' )
                    // InternalDSL.g:640:4: 'BLACK'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:644:2: ( ( 'BLUE' ) )
                    {
                    // InternalDSL.g:644:2: ( ( 'BLUE' ) )
                    // InternalDSL.g:645:3: ( 'BLUE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:646:3: ( 'BLUE' )
                    // InternalDSL.g:646:4: 'BLUE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:650:2: ( ( 'GREEN' ) )
                    {
                    // InternalDSL.g:650:2: ( ( 'GREEN' ) )
                    // InternalDSL.g:651:3: ( 'GREEN' )
                    {
                     before(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:652:3: ( 'GREEN' )
                    // InternalDSL.g:652:4: 'GREEN'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:656:2: ( ( 'YELLOW' ) )
                    {
                    // InternalDSL.g:656:2: ( ( 'YELLOW' ) )
                    // InternalDSL.g:657:3: ( 'YELLOW' )
                    {
                     before(grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4()); 
                    // InternalDSL.g:658:3: ( 'YELLOW' )
                    // InternalDSL.g:658:4: 'YELLOW'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:662:2: ( ( 'RED' ) )
                    {
                    // InternalDSL.g:662:2: ( ( 'RED' ) )
                    // InternalDSL.g:663:3: ( 'RED' )
                    {
                     before(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5()); 
                    // InternalDSL.g:664:3: ( 'RED' )
                    // InternalDSL.g:664:4: 'RED'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:668:2: ( ( 'WHITE' ) )
                    {
                    // InternalDSL.g:668:2: ( ( 'WHITE' ) )
                    // InternalDSL.g:669:3: ( 'WHITE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6()); 
                    // InternalDSL.g:670:3: ( 'WHITE' )
                    // InternalDSL.g:670:4: 'WHITE'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:674:2: ( ( 'BROWN' ) )
                    {
                    // InternalDSL.g:674:2: ( ( 'BROWN' ) )
                    // InternalDSL.g:675:3: ( 'BROWN' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7()); 
                    // InternalDSL.g:676:3: ( 'BROWN' )
                    // InternalDSL.g:676:4: 'BROWN'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorEnum__Alternatives"


    // $ANTLR start "rule__Behaviors__Group__0"
    // InternalDSL.g:684:1: rule__Behaviors__Group__0 : rule__Behaviors__Group__0__Impl rule__Behaviors__Group__1 ;
    public final void rule__Behaviors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:688:1: ( rule__Behaviors__Group__0__Impl rule__Behaviors__Group__1 )
            // InternalDSL.g:689:2: rule__Behaviors__Group__0__Impl rule__Behaviors__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Behaviors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behaviors__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__0"


    // $ANTLR start "rule__Behaviors__Group__0__Impl"
    // InternalDSL.g:696:1: rule__Behaviors__Group__0__Impl : ( 'Behavior' ) ;
    public final void rule__Behaviors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:700:1: ( ( 'Behavior' ) )
            // InternalDSL.g:701:1: ( 'Behavior' )
            {
            // InternalDSL.g:701:1: ( 'Behavior' )
            // InternalDSL.g:702:2: 'Behavior'
            {
             before(grammarAccess.getBehaviorsAccess().getBehaviorKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBehaviorsAccess().getBehaviorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__0__Impl"


    // $ANTLR start "rule__Behaviors__Group__1"
    // InternalDSL.g:711:1: rule__Behaviors__Group__1 : rule__Behaviors__Group__1__Impl rule__Behaviors__Group__2 ;
    public final void rule__Behaviors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:715:1: ( rule__Behaviors__Group__1__Impl rule__Behaviors__Group__2 )
            // InternalDSL.g:716:2: rule__Behaviors__Group__1__Impl rule__Behaviors__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Behaviors__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behaviors__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__1"


    // $ANTLR start "rule__Behaviors__Group__1__Impl"
    // InternalDSL.g:723:1: rule__Behaviors__Group__1__Impl : ( ( rule__Behaviors__NameAssignment_1 ) ) ;
    public final void rule__Behaviors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:727:1: ( ( ( rule__Behaviors__NameAssignment_1 ) ) )
            // InternalDSL.g:728:1: ( ( rule__Behaviors__NameAssignment_1 ) )
            {
            // InternalDSL.g:728:1: ( ( rule__Behaviors__NameAssignment_1 ) )
            // InternalDSL.g:729:2: ( rule__Behaviors__NameAssignment_1 )
            {
             before(grammarAccess.getBehaviorsAccess().getNameAssignment_1()); 
            // InternalDSL.g:730:2: ( rule__Behaviors__NameAssignment_1 )
            // InternalDSL.g:730:3: rule__Behaviors__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Behaviors__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__1__Impl"


    // $ANTLR start "rule__Behaviors__Group__2"
    // InternalDSL.g:738:1: rule__Behaviors__Group__2 : rule__Behaviors__Group__2__Impl rule__Behaviors__Group__3 ;
    public final void rule__Behaviors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:742:1: ( rule__Behaviors__Group__2__Impl rule__Behaviors__Group__3 )
            // InternalDSL.g:743:2: rule__Behaviors__Group__2__Impl rule__Behaviors__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Behaviors__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behaviors__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__2"


    // $ANTLR start "rule__Behaviors__Group__2__Impl"
    // InternalDSL.g:750:1: rule__Behaviors__Group__2__Impl : ( 'IF' ) ;
    public final void rule__Behaviors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:754:1: ( ( 'IF' ) )
            // InternalDSL.g:755:1: ( 'IF' )
            {
            // InternalDSL.g:755:1: ( 'IF' )
            // InternalDSL.g:756:2: 'IF'
            {
             before(grammarAccess.getBehaviorsAccess().getIFKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBehaviorsAccess().getIFKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__2__Impl"


    // $ANTLR start "rule__Behaviors__Group__3"
    // InternalDSL.g:765:1: rule__Behaviors__Group__3 : rule__Behaviors__Group__3__Impl rule__Behaviors__Group__4 ;
    public final void rule__Behaviors__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:769:1: ( rule__Behaviors__Group__3__Impl rule__Behaviors__Group__4 )
            // InternalDSL.g:770:2: rule__Behaviors__Group__3__Impl rule__Behaviors__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Behaviors__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behaviors__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__3"


    // $ANTLR start "rule__Behaviors__Group__3__Impl"
    // InternalDSL.g:777:1: rule__Behaviors__Group__3__Impl : ( ( rule__Behaviors__SensorExpressionAssignment_3 ) ) ;
    public final void rule__Behaviors__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:781:1: ( ( ( rule__Behaviors__SensorExpressionAssignment_3 ) ) )
            // InternalDSL.g:782:1: ( ( rule__Behaviors__SensorExpressionAssignment_3 ) )
            {
            // InternalDSL.g:782:1: ( ( rule__Behaviors__SensorExpressionAssignment_3 ) )
            // InternalDSL.g:783:2: ( rule__Behaviors__SensorExpressionAssignment_3 )
            {
             before(grammarAccess.getBehaviorsAccess().getSensorExpressionAssignment_3()); 
            // InternalDSL.g:784:2: ( rule__Behaviors__SensorExpressionAssignment_3 )
            // InternalDSL.g:784:3: rule__Behaviors__SensorExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Behaviors__SensorExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorsAccess().getSensorExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__3__Impl"


    // $ANTLR start "rule__Behaviors__Group__4"
    // InternalDSL.g:792:1: rule__Behaviors__Group__4 : rule__Behaviors__Group__4__Impl rule__Behaviors__Group__5 ;
    public final void rule__Behaviors__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:796:1: ( rule__Behaviors__Group__4__Impl rule__Behaviors__Group__5 )
            // InternalDSL.g:797:2: rule__Behaviors__Group__4__Impl rule__Behaviors__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Behaviors__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behaviors__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__4"


    // $ANTLR start "rule__Behaviors__Group__4__Impl"
    // InternalDSL.g:804:1: rule__Behaviors__Group__4__Impl : ( 'THEN' ) ;
    public final void rule__Behaviors__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:808:1: ( ( 'THEN' ) )
            // InternalDSL.g:809:1: ( 'THEN' )
            {
            // InternalDSL.g:809:1: ( 'THEN' )
            // InternalDSL.g:810:2: 'THEN'
            {
             before(grammarAccess.getBehaviorsAccess().getTHENKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBehaviorsAccess().getTHENKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__4__Impl"


    // $ANTLR start "rule__Behaviors__Group__5"
    // InternalDSL.g:819:1: rule__Behaviors__Group__5 : rule__Behaviors__Group__5__Impl rule__Behaviors__Group__6 ;
    public final void rule__Behaviors__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:823:1: ( rule__Behaviors__Group__5__Impl rule__Behaviors__Group__6 )
            // InternalDSL.g:824:2: rule__Behaviors__Group__5__Impl rule__Behaviors__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Behaviors__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Behaviors__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__5"


    // $ANTLR start "rule__Behaviors__Group__5__Impl"
    // InternalDSL.g:831:1: rule__Behaviors__Group__5__Impl : ( ( ( rule__Behaviors__ActionlistAssignment_5 ) ) ( ( rule__Behaviors__ActionlistAssignment_5 )* ) ) ;
    public final void rule__Behaviors__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:835:1: ( ( ( ( rule__Behaviors__ActionlistAssignment_5 ) ) ( ( rule__Behaviors__ActionlistAssignment_5 )* ) ) )
            // InternalDSL.g:836:1: ( ( ( rule__Behaviors__ActionlistAssignment_5 ) ) ( ( rule__Behaviors__ActionlistAssignment_5 )* ) )
            {
            // InternalDSL.g:836:1: ( ( ( rule__Behaviors__ActionlistAssignment_5 ) ) ( ( rule__Behaviors__ActionlistAssignment_5 )* ) )
            // InternalDSL.g:837:2: ( ( rule__Behaviors__ActionlistAssignment_5 ) ) ( ( rule__Behaviors__ActionlistAssignment_5 )* )
            {
            // InternalDSL.g:837:2: ( ( rule__Behaviors__ActionlistAssignment_5 ) )
            // InternalDSL.g:838:3: ( rule__Behaviors__ActionlistAssignment_5 )
            {
             before(grammarAccess.getBehaviorsAccess().getActionlistAssignment_5()); 
            // InternalDSL.g:839:3: ( rule__Behaviors__ActionlistAssignment_5 )
            // InternalDSL.g:839:4: rule__Behaviors__ActionlistAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Behaviors__ActionlistAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorsAccess().getActionlistAssignment_5()); 

            }

            // InternalDSL.g:842:2: ( ( rule__Behaviors__ActionlistAssignment_5 )* )
            // InternalDSL.g:843:3: ( rule__Behaviors__ActionlistAssignment_5 )*
            {
             before(grammarAccess.getBehaviorsAccess().getActionlistAssignment_5()); 
            // InternalDSL.g:844:3: ( rule__Behaviors__ActionlistAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=28 && LA8_0<=30)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:844:4: rule__Behaviors__ActionlistAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Behaviors__ActionlistAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBehaviorsAccess().getActionlistAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__5__Impl"


    // $ANTLR start "rule__Behaviors__Group__6"
    // InternalDSL.g:853:1: rule__Behaviors__Group__6 : rule__Behaviors__Group__6__Impl ;
    public final void rule__Behaviors__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:857:1: ( rule__Behaviors__Group__6__Impl )
            // InternalDSL.g:858:2: rule__Behaviors__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Behaviors__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__6"


    // $ANTLR start "rule__Behaviors__Group__6__Impl"
    // InternalDSL.g:864:1: rule__Behaviors__Group__6__Impl : ( 'END' ) ;
    public final void rule__Behaviors__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:868:1: ( ( 'END' ) )
            // InternalDSL.g:869:1: ( 'END' )
            {
            // InternalDSL.g:869:1: ( 'END' )
            // InternalDSL.g:870:2: 'END'
            {
             before(grammarAccess.getBehaviorsAccess().getENDKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBehaviorsAccess().getENDKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__Group__6__Impl"


    // $ANTLR start "rule__LeftMovementAction__Group__0"
    // InternalDSL.g:880:1: rule__LeftMovementAction__Group__0 : rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1 ;
    public final void rule__LeftMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:884:1: ( rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1 )
            // InternalDSL.g:885:2: rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__LeftMovementAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftMovementAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMovementAction__Group__0"


    // $ANTLR start "rule__LeftMovementAction__Group__0__Impl"
    // InternalDSL.g:892:1: rule__LeftMovementAction__Group__0__Impl : ( 'leftMotor' ) ;
    public final void rule__LeftMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:896:1: ( ( 'leftMotor' ) )
            // InternalDSL.g:897:1: ( 'leftMotor' )
            {
            // InternalDSL.g:897:1: ( 'leftMotor' )
            // InternalDSL.g:898:2: 'leftMotor'
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftMotorKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLeftMovementActionAccess().getLeftMotorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMovementAction__Group__0__Impl"


    // $ANTLR start "rule__LeftMovementAction__Group__1"
    // InternalDSL.g:907:1: rule__LeftMovementAction__Group__1 : rule__LeftMovementAction__Group__1__Impl ;
    public final void rule__LeftMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:911:1: ( rule__LeftMovementAction__Group__1__Impl )
            // InternalDSL.g:912:2: rule__LeftMovementAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftMovementAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMovementAction__Group__1"


    // $ANTLR start "rule__LeftMovementAction__Group__1__Impl"
    // InternalDSL.g:918:1: rule__LeftMovementAction__Group__1__Impl : ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) ) ;
    public final void rule__LeftMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:922:1: ( ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) ) )
            // InternalDSL.g:923:1: ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) )
            {
            // InternalDSL.g:923:1: ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) )
            // InternalDSL.g:924:2: ( rule__LeftMovementAction__LeftmoveAssignment_1 )
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftmoveAssignment_1()); 
            // InternalDSL.g:925:2: ( rule__LeftMovementAction__LeftmoveAssignment_1 )
            // InternalDSL.g:925:3: rule__LeftMovementAction__LeftmoveAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LeftMovementAction__LeftmoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLeftMovementActionAccess().getLeftmoveAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMovementAction__Group__1__Impl"


    // $ANTLR start "rule__RightMovementAction__Group__0"
    // InternalDSL.g:934:1: rule__RightMovementAction__Group__0 : rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1 ;
    public final void rule__RightMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:938:1: ( rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1 )
            // InternalDSL.g:939:2: rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RightMovementAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightMovementAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMovementAction__Group__0"


    // $ANTLR start "rule__RightMovementAction__Group__0__Impl"
    // InternalDSL.g:946:1: rule__RightMovementAction__Group__0__Impl : ( 'rightMotor' ) ;
    public final void rule__RightMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:950:1: ( ( 'rightMotor' ) )
            // InternalDSL.g:951:1: ( 'rightMotor' )
            {
            // InternalDSL.g:951:1: ( 'rightMotor' )
            // InternalDSL.g:952:2: 'rightMotor'
            {
             before(grammarAccess.getRightMovementActionAccess().getRightMotorKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRightMovementActionAccess().getRightMotorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMovementAction__Group__0__Impl"


    // $ANTLR start "rule__RightMovementAction__Group__1"
    // InternalDSL.g:961:1: rule__RightMovementAction__Group__1 : rule__RightMovementAction__Group__1__Impl ;
    public final void rule__RightMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:965:1: ( rule__RightMovementAction__Group__1__Impl )
            // InternalDSL.g:966:2: rule__RightMovementAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightMovementAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMovementAction__Group__1"


    // $ANTLR start "rule__RightMovementAction__Group__1__Impl"
    // InternalDSL.g:972:1: rule__RightMovementAction__Group__1__Impl : ( ( rule__RightMovementAction__RightmoveAssignment_1 ) ) ;
    public final void rule__RightMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:976:1: ( ( ( rule__RightMovementAction__RightmoveAssignment_1 ) ) )
            // InternalDSL.g:977:1: ( ( rule__RightMovementAction__RightmoveAssignment_1 ) )
            {
            // InternalDSL.g:977:1: ( ( rule__RightMovementAction__RightmoveAssignment_1 ) )
            // InternalDSL.g:978:2: ( rule__RightMovementAction__RightmoveAssignment_1 )
            {
             before(grammarAccess.getRightMovementActionAccess().getRightmoveAssignment_1()); 
            // InternalDSL.g:979:2: ( rule__RightMovementAction__RightmoveAssignment_1 )
            // InternalDSL.g:979:3: rule__RightMovementAction__RightmoveAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RightMovementAction__RightmoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRightMovementActionAccess().getRightmoveAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMovementAction__Group__1__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__0"
    // InternalDSL.g:988:1: rule__RotateMovementAction__Group__0 : rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1 ;
    public final void rule__RotateMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:992:1: ( rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1 )
            // InternalDSL.g:993:2: rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RotateMovementAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__0"


    // $ANTLR start "rule__RotateMovementAction__Group__0__Impl"
    // InternalDSL.g:1000:1: rule__RotateMovementAction__Group__0__Impl : ( 'rotate' ) ;
    public final void rule__RotateMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1004:1: ( ( 'rotate' ) )
            // InternalDSL.g:1005:1: ( 'rotate' )
            {
            // InternalDSL.g:1005:1: ( 'rotate' )
            // InternalDSL.g:1006:2: 'rotate'
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__0__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__1"
    // InternalDSL.g:1015:1: rule__RotateMovementAction__Group__1 : rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2 ;
    public final void rule__RotateMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1019:1: ( rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2 )
            // InternalDSL.g:1020:2: rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RotateMovementAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__1"


    // $ANTLR start "rule__RotateMovementAction__Group__1__Impl"
    // InternalDSL.g:1027:1: rule__RotateMovementAction__Group__1__Impl : ( ( rule__RotateMovementAction__RotateleftAssignment_1 ) ) ;
    public final void rule__RotateMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1031:1: ( ( ( rule__RotateMovementAction__RotateleftAssignment_1 ) ) )
            // InternalDSL.g:1032:1: ( ( rule__RotateMovementAction__RotateleftAssignment_1 ) )
            {
            // InternalDSL.g:1032:1: ( ( rule__RotateMovementAction__RotateleftAssignment_1 ) )
            // InternalDSL.g:1033:2: ( rule__RotateMovementAction__RotateleftAssignment_1 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotateleftAssignment_1()); 
            // InternalDSL.g:1034:2: ( rule__RotateMovementAction__RotateleftAssignment_1 )
            // InternalDSL.g:1034:3: rule__RotateMovementAction__RotateleftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__RotateleftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRotateMovementActionAccess().getRotateleftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__1__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__2"
    // InternalDSL.g:1042:1: rule__RotateMovementAction__Group__2 : rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3 ;
    public final void rule__RotateMovementAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1046:1: ( rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3 )
            // InternalDSL.g:1047:2: rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RotateMovementAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__2"


    // $ANTLR start "rule__RotateMovementAction__Group__2__Impl"
    // InternalDSL.g:1054:1: rule__RotateMovementAction__Group__2__Impl : ( ( rule__RotateMovementAction__LeftdirAssignment_2 ) ) ;
    public final void rule__RotateMovementAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1058:1: ( ( ( rule__RotateMovementAction__LeftdirAssignment_2 ) ) )
            // InternalDSL.g:1059:1: ( ( rule__RotateMovementAction__LeftdirAssignment_2 ) )
            {
            // InternalDSL.g:1059:1: ( ( rule__RotateMovementAction__LeftdirAssignment_2 ) )
            // InternalDSL.g:1060:2: ( rule__RotateMovementAction__LeftdirAssignment_2 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getLeftdirAssignment_2()); 
            // InternalDSL.g:1061:2: ( rule__RotateMovementAction__LeftdirAssignment_2 )
            // InternalDSL.g:1061:3: rule__RotateMovementAction__LeftdirAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__LeftdirAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotateMovementActionAccess().getLeftdirAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__2__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__3"
    // InternalDSL.g:1069:1: rule__RotateMovementAction__Group__3 : rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4 ;
    public final void rule__RotateMovementAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1073:1: ( rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4 )
            // InternalDSL.g:1074:2: rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RotateMovementAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__3"


    // $ANTLR start "rule__RotateMovementAction__Group__3__Impl"
    // InternalDSL.g:1081:1: rule__RotateMovementAction__Group__3__Impl : ( ( rule__RotateMovementAction__RotaterightAssignment_3 ) ) ;
    public final void rule__RotateMovementAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1085:1: ( ( ( rule__RotateMovementAction__RotaterightAssignment_3 ) ) )
            // InternalDSL.g:1086:1: ( ( rule__RotateMovementAction__RotaterightAssignment_3 ) )
            {
            // InternalDSL.g:1086:1: ( ( rule__RotateMovementAction__RotaterightAssignment_3 ) )
            // InternalDSL.g:1087:2: ( rule__RotateMovementAction__RotaterightAssignment_3 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotaterightAssignment_3()); 
            // InternalDSL.g:1088:2: ( rule__RotateMovementAction__RotaterightAssignment_3 )
            // InternalDSL.g:1088:3: rule__RotateMovementAction__RotaterightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__RotaterightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRotateMovementActionAccess().getRotaterightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__3__Impl"


    // $ANTLR start "rule__RotateMovementAction__Group__4"
    // InternalDSL.g:1096:1: rule__RotateMovementAction__Group__4 : rule__RotateMovementAction__Group__4__Impl ;
    public final void rule__RotateMovementAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1100:1: ( rule__RotateMovementAction__Group__4__Impl )
            // InternalDSL.g:1101:2: rule__RotateMovementAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__4"


    // $ANTLR start "rule__RotateMovementAction__Group__4__Impl"
    // InternalDSL.g:1107:1: rule__RotateMovementAction__Group__4__Impl : ( ( rule__RotateMovementAction__RightdirAssignment_4 ) ) ;
    public final void rule__RotateMovementAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1111:1: ( ( ( rule__RotateMovementAction__RightdirAssignment_4 ) ) )
            // InternalDSL.g:1112:1: ( ( rule__RotateMovementAction__RightdirAssignment_4 ) )
            {
            // InternalDSL.g:1112:1: ( ( rule__RotateMovementAction__RightdirAssignment_4 ) )
            // InternalDSL.g:1113:2: ( rule__RotateMovementAction__RightdirAssignment_4 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getRightdirAssignment_4()); 
            // InternalDSL.g:1114:2: ( rule__RotateMovementAction__RightdirAssignment_4 )
            // InternalDSL.g:1114:3: rule__RotateMovementAction__RightdirAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__RightdirAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRotateMovementActionAccess().getRightdirAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__Group__4__Impl"


    // $ANTLR start "rule__Expression1__Group__0"
    // InternalDSL.g:1123:1: rule__Expression1__Group__0 : rule__Expression1__Group__0__Impl rule__Expression1__Group__1 ;
    public final void rule__Expression1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1127:1: ( rule__Expression1__Group__0__Impl rule__Expression1__Group__1 )
            // InternalDSL.g:1128:2: rule__Expression1__Group__0__Impl rule__Expression1__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Expression1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__0"


    // $ANTLR start "rule__Expression1__Group__0__Impl"
    // InternalDSL.g:1135:1: rule__Expression1__Group__0__Impl : ( ruleExpression2 ) ;
    public final void rule__Expression1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1139:1: ( ( ruleExpression2 ) )
            // InternalDSL.g:1140:1: ( ruleExpression2 )
            {
            // InternalDSL.g:1140:1: ( ruleExpression2 )
            // InternalDSL.g:1141:2: ruleExpression2
            {
             before(grammarAccess.getExpression1Access().getExpression2ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression1Access().getExpression2ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__0__Impl"


    // $ANTLR start "rule__Expression1__Group__1"
    // InternalDSL.g:1150:1: rule__Expression1__Group__1 : rule__Expression1__Group__1__Impl ;
    public final void rule__Expression1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1154:1: ( rule__Expression1__Group__1__Impl )
            // InternalDSL.g:1155:2: rule__Expression1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__1"


    // $ANTLR start "rule__Expression1__Group__1__Impl"
    // InternalDSL.g:1161:1: rule__Expression1__Group__1__Impl : ( ( rule__Expression1__Group_1__0 )* ) ;
    public final void rule__Expression1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1165:1: ( ( ( rule__Expression1__Group_1__0 )* ) )
            // InternalDSL.g:1166:1: ( ( rule__Expression1__Group_1__0 )* )
            {
            // InternalDSL.g:1166:1: ( ( rule__Expression1__Group_1__0 )* )
            // InternalDSL.g:1167:2: ( rule__Expression1__Group_1__0 )*
            {
             before(grammarAccess.getExpression1Access().getGroup_1()); 
            // InternalDSL.g:1168:2: ( rule__Expression1__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:1168:3: rule__Expression1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Expression1__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExpression1Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__1__Impl"


    // $ANTLR start "rule__Expression1__Group_1__0"
    // InternalDSL.g:1177:1: rule__Expression1__Group_1__0 : rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 ;
    public final void rule__Expression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1181:1: ( rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 )
            // InternalDSL.g:1182:2: rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Expression1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__0"


    // $ANTLR start "rule__Expression1__Group_1__0__Impl"
    // InternalDSL.g:1189:1: rule__Expression1__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1193:1: ( ( () ) )
            // InternalDSL.g:1194:1: ( () )
            {
            // InternalDSL.g:1194:1: ( () )
            // InternalDSL.g:1195:2: ()
            {
             before(grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0()); 
            // InternalDSL.g:1196:2: ()
            // InternalDSL.g:1196:3: 
            {
            }

             after(grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__0__Impl"


    // $ANTLR start "rule__Expression1__Group_1__1"
    // InternalDSL.g:1204:1: rule__Expression1__Group_1__1 : rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 ;
    public final void rule__Expression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1208:1: ( rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 )
            // InternalDSL.g:1209:2: rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Expression1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__1"


    // $ANTLR start "rule__Expression1__Group_1__1__Impl"
    // InternalDSL.g:1216:1: rule__Expression1__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__Expression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1220:1: ( ( 'AND' ) )
            // InternalDSL.g:1221:1: ( 'AND' )
            {
            // InternalDSL.g:1221:1: ( 'AND' )
            // InternalDSL.g:1222:2: 'AND'
            {
             before(grammarAccess.getExpression1Access().getANDKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExpression1Access().getANDKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__1__Impl"


    // $ANTLR start "rule__Expression1__Group_1__2"
    // InternalDSL.g:1231:1: rule__Expression1__Group_1__2 : rule__Expression1__Group_1__2__Impl ;
    public final void rule__Expression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1235:1: ( rule__Expression1__Group_1__2__Impl )
            // InternalDSL.g:1236:2: rule__Expression1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__2"


    // $ANTLR start "rule__Expression1__Group_1__2__Impl"
    // InternalDSL.g:1242:1: rule__Expression1__Group_1__2__Impl : ( ( rule__Expression1__RightAssignment_1_2 ) ) ;
    public final void rule__Expression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1246:1: ( ( ( rule__Expression1__RightAssignment_1_2 ) ) )
            // InternalDSL.g:1247:1: ( ( rule__Expression1__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:1247:1: ( ( rule__Expression1__RightAssignment_1_2 ) )
            // InternalDSL.g:1248:2: ( rule__Expression1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression1Access().getRightAssignment_1_2()); 
            // InternalDSL.g:1249:2: ( rule__Expression1__RightAssignment_1_2 )
            // InternalDSL.g:1249:3: rule__Expression1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression1Access().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__2__Impl"


    // $ANTLR start "rule__Expression2__Group__0"
    // InternalDSL.g:1258:1: rule__Expression2__Group__0 : rule__Expression2__Group__0__Impl rule__Expression2__Group__1 ;
    public final void rule__Expression2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1262:1: ( rule__Expression2__Group__0__Impl rule__Expression2__Group__1 )
            // InternalDSL.g:1263:2: rule__Expression2__Group__0__Impl rule__Expression2__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Expression2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__0"


    // $ANTLR start "rule__Expression2__Group__0__Impl"
    // InternalDSL.g:1270:1: rule__Expression2__Group__0__Impl : ( ruleExpression3 ) ;
    public final void rule__Expression2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1274:1: ( ( ruleExpression3 ) )
            // InternalDSL.g:1275:1: ( ruleExpression3 )
            {
            // InternalDSL.g:1275:1: ( ruleExpression3 )
            // InternalDSL.g:1276:2: ruleExpression3
            {
             before(grammarAccess.getExpression2Access().getExpression3ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression2Access().getExpression3ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__0__Impl"


    // $ANTLR start "rule__Expression2__Group__1"
    // InternalDSL.g:1285:1: rule__Expression2__Group__1 : rule__Expression2__Group__1__Impl ;
    public final void rule__Expression2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1289:1: ( rule__Expression2__Group__1__Impl )
            // InternalDSL.g:1290:2: rule__Expression2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__1"


    // $ANTLR start "rule__Expression2__Group__1__Impl"
    // InternalDSL.g:1296:1: rule__Expression2__Group__1__Impl : ( ( rule__Expression2__Group_1__0 )* ) ;
    public final void rule__Expression2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1300:1: ( ( ( rule__Expression2__Group_1__0 )* ) )
            // InternalDSL.g:1301:1: ( ( rule__Expression2__Group_1__0 )* )
            {
            // InternalDSL.g:1301:1: ( ( rule__Expression2__Group_1__0 )* )
            // InternalDSL.g:1302:2: ( rule__Expression2__Group_1__0 )*
            {
             before(grammarAccess.getExpression2Access().getGroup_1()); 
            // InternalDSL.g:1303:2: ( rule__Expression2__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:1303:3: rule__Expression2__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Expression2__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getExpression2Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__1__Impl"


    // $ANTLR start "rule__Expression2__Group_1__0"
    // InternalDSL.g:1312:1: rule__Expression2__Group_1__0 : rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 ;
    public final void rule__Expression2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1316:1: ( rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 )
            // InternalDSL.g:1317:2: rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Expression2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__0"


    // $ANTLR start "rule__Expression2__Group_1__0__Impl"
    // InternalDSL.g:1324:1: rule__Expression2__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1328:1: ( ( () ) )
            // InternalDSL.g:1329:1: ( () )
            {
            // InternalDSL.g:1329:1: ( () )
            // InternalDSL.g:1330:2: ()
            {
             before(grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0()); 
            // InternalDSL.g:1331:2: ()
            // InternalDSL.g:1331:3: 
            {
            }

             after(grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__0__Impl"


    // $ANTLR start "rule__Expression2__Group_1__1"
    // InternalDSL.g:1339:1: rule__Expression2__Group_1__1 : rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 ;
    public final void rule__Expression2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1343:1: ( rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 )
            // InternalDSL.g:1344:2: rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Expression2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__1"


    // $ANTLR start "rule__Expression2__Group_1__1__Impl"
    // InternalDSL.g:1351:1: rule__Expression2__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Expression2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1355:1: ( ( 'OR' ) )
            // InternalDSL.g:1356:1: ( 'OR' )
            {
            // InternalDSL.g:1356:1: ( 'OR' )
            // InternalDSL.g:1357:2: 'OR'
            {
             before(grammarAccess.getExpression2Access().getORKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExpression2Access().getORKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__1__Impl"


    // $ANTLR start "rule__Expression2__Group_1__2"
    // InternalDSL.g:1366:1: rule__Expression2__Group_1__2 : rule__Expression2__Group_1__2__Impl ;
    public final void rule__Expression2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1370:1: ( rule__Expression2__Group_1__2__Impl )
            // InternalDSL.g:1371:2: rule__Expression2__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__2"


    // $ANTLR start "rule__Expression2__Group_1__2__Impl"
    // InternalDSL.g:1377:1: rule__Expression2__Group_1__2__Impl : ( ( rule__Expression2__RightAssignment_1_2 ) ) ;
    public final void rule__Expression2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1381:1: ( ( ( rule__Expression2__RightAssignment_1_2 ) ) )
            // InternalDSL.g:1382:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:1382:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            // InternalDSL.g:1383:2: ( rule__Expression2__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 
            // InternalDSL.g:1384:2: ( rule__Expression2__RightAssignment_1_2 )
            // InternalDSL.g:1384:3: rule__Expression2__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__2__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__0"
    // InternalDSL.g:1393:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1397:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalDSL.g:1398:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpressionBracket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0"


    // $ANTLR start "rule__ExpressionBracket__Group__0__Impl"
    // InternalDSL.g:1405:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1409:1: ( ( '(' ) )
            // InternalDSL.g:1410:1: ( '(' )
            {
            // InternalDSL.g:1410:1: ( '(' )
            // InternalDSL.g:1411:2: '('
            {
             before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__1"
    // InternalDSL.g:1420:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1424:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalDSL.g:1425:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionBracket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1"


    // $ANTLR start "rule__ExpressionBracket__Group__1__Impl"
    // InternalDSL.g:1432:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__ExpAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1436:1: ( ( ( rule__ExpressionBracket__ExpAssignment_1 ) ) )
            // InternalDSL.g:1437:1: ( ( rule__ExpressionBracket__ExpAssignment_1 ) )
            {
            // InternalDSL.g:1437:1: ( ( rule__ExpressionBracket__ExpAssignment_1 ) )
            // InternalDSL.g:1438:2: ( rule__ExpressionBracket__ExpAssignment_1 )
            {
             before(grammarAccess.getExpressionBracketAccess().getExpAssignment_1()); 
            // InternalDSL.g:1439:2: ( rule__ExpressionBracket__ExpAssignment_1 )
            // InternalDSL.g:1439:3: rule__ExpressionBracket__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBracketAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__2"
    // InternalDSL.g:1447:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1451:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalDSL.g:1452:2: rule__ExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2"


    // $ANTLR start "rule__ExpressionBracket__Group__2__Impl"
    // InternalDSL.g:1458:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1462:1: ( ( ')' ) )
            // InternalDSL.g:1463:1: ( ')' )
            {
            // InternalDSL.g:1463:1: ( ')' )
            // InternalDSL.g:1464:2: ')'
            {
             before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__TouchLiteral__Group__0"
    // InternalDSL.g:1474:1: rule__TouchLiteral__Group__0 : rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1 ;
    public final void rule__TouchLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1478:1: ( rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1 )
            // InternalDSL.g:1479:2: rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TouchLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TouchLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchLiteral__Group__0"


    // $ANTLR start "rule__TouchLiteral__Group__0__Impl"
    // InternalDSL.g:1486:1: rule__TouchLiteral__Group__0__Impl : ( 'touch:' ) ;
    public final void rule__TouchLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1490:1: ( ( 'touch:' ) )
            // InternalDSL.g:1491:1: ( 'touch:' )
            {
            // InternalDSL.g:1491:1: ( 'touch:' )
            // InternalDSL.g:1492:2: 'touch:'
            {
             before(grammarAccess.getTouchLiteralAccess().getTouchKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTouchLiteralAccess().getTouchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchLiteral__Group__0__Impl"


    // $ANTLR start "rule__TouchLiteral__Group__1"
    // InternalDSL.g:1501:1: rule__TouchLiteral__Group__1 : rule__TouchLiteral__Group__1__Impl ;
    public final void rule__TouchLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1505:1: ( rule__TouchLiteral__Group__1__Impl )
            // InternalDSL.g:1506:2: rule__TouchLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TouchLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchLiteral__Group__1"


    // $ANTLR start "rule__TouchLiteral__Group__1__Impl"
    // InternalDSL.g:1512:1: rule__TouchLiteral__Group__1__Impl : ( ( rule__TouchLiteral__TouchAssignment_1 ) ) ;
    public final void rule__TouchLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1516:1: ( ( ( rule__TouchLiteral__TouchAssignment_1 ) ) )
            // InternalDSL.g:1517:1: ( ( rule__TouchLiteral__TouchAssignment_1 ) )
            {
            // InternalDSL.g:1517:1: ( ( rule__TouchLiteral__TouchAssignment_1 ) )
            // InternalDSL.g:1518:2: ( rule__TouchLiteral__TouchAssignment_1 )
            {
             before(grammarAccess.getTouchLiteralAccess().getTouchAssignment_1()); 
            // InternalDSL.g:1519:2: ( rule__TouchLiteral__TouchAssignment_1 )
            // InternalDSL.g:1519:3: rule__TouchLiteral__TouchAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TouchLiteral__TouchAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTouchLiteralAccess().getTouchAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchLiteral__Group__1__Impl"


    // $ANTLR start "rule__ColorLiteral__Group__0"
    // InternalDSL.g:1528:1: rule__ColorLiteral__Group__0 : rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1 ;
    public final void rule__ColorLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1532:1: ( rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1 )
            // InternalDSL.g:1533:2: rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ColorLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__0"


    // $ANTLR start "rule__ColorLiteral__Group__0__Impl"
    // InternalDSL.g:1540:1: rule__ColorLiteral__Group__0__Impl : ( 'color:' ) ;
    public final void rule__ColorLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1544:1: ( ( 'color:' ) )
            // InternalDSL.g:1545:1: ( 'color:' )
            {
            // InternalDSL.g:1545:1: ( 'color:' )
            // InternalDSL.g:1546:2: 'color:'
            {
             before(grammarAccess.getColorLiteralAccess().getColorKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getColorLiteralAccess().getColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__0__Impl"


    // $ANTLR start "rule__ColorLiteral__Group__1"
    // InternalDSL.g:1555:1: rule__ColorLiteral__Group__1 : rule__ColorLiteral__Group__1__Impl ;
    public final void rule__ColorLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1559:1: ( rule__ColorLiteral__Group__1__Impl )
            // InternalDSL.g:1560:2: rule__ColorLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__1"


    // $ANTLR start "rule__ColorLiteral__Group__1__Impl"
    // InternalDSL.g:1566:1: rule__ColorLiteral__Group__1__Impl : ( ( rule__ColorLiteral__ColorAssignment_1 ) ) ;
    public final void rule__ColorLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1570:1: ( ( ( rule__ColorLiteral__ColorAssignment_1 ) ) )
            // InternalDSL.g:1571:1: ( ( rule__ColorLiteral__ColorAssignment_1 ) )
            {
            // InternalDSL.g:1571:1: ( ( rule__ColorLiteral__ColorAssignment_1 ) )
            // InternalDSL.g:1572:2: ( rule__ColorLiteral__ColorAssignment_1 )
            {
             before(grammarAccess.getColorLiteralAccess().getColorAssignment_1()); 
            // InternalDSL.g:1573:2: ( rule__ColorLiteral__ColorAssignment_1 )
            // InternalDSL.g:1573:3: rule__ColorLiteral__ColorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColorLiteral__ColorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColorLiteralAccess().getColorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__Group__1__Impl"


    // $ANTLR start "rule__DistanceLiteral__Group__0"
    // InternalDSL.g:1582:1: rule__DistanceLiteral__Group__0 : rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1 ;
    public final void rule__DistanceLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1586:1: ( rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1 )
            // InternalDSL.g:1587:2: rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DistanceLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__0"


    // $ANTLR start "rule__DistanceLiteral__Group__0__Impl"
    // InternalDSL.g:1594:1: rule__DistanceLiteral__Group__0__Impl : ( 'sonar:' ) ;
    public final void rule__DistanceLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1598:1: ( ( 'sonar:' ) )
            // InternalDSL.g:1599:1: ( 'sonar:' )
            {
            // InternalDSL.g:1599:1: ( 'sonar:' )
            // InternalDSL.g:1600:2: 'sonar:'
            {
             before(grammarAccess.getDistanceLiteralAccess().getSonarKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDistanceLiteralAccess().getSonarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__0__Impl"


    // $ANTLR start "rule__DistanceLiteral__Group__1"
    // InternalDSL.g:1609:1: rule__DistanceLiteral__Group__1 : rule__DistanceLiteral__Group__1__Impl ;
    public final void rule__DistanceLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1613:1: ( rule__DistanceLiteral__Group__1__Impl )
            // InternalDSL.g:1614:2: rule__DistanceLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__1"


    // $ANTLR start "rule__DistanceLiteral__Group__1__Impl"
    // InternalDSL.g:1620:1: rule__DistanceLiteral__Group__1__Impl : ( ( rule__DistanceLiteral__DistanceAssignment_1 ) ) ;
    public final void rule__DistanceLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1624:1: ( ( ( rule__DistanceLiteral__DistanceAssignment_1 ) ) )
            // InternalDSL.g:1625:1: ( ( rule__DistanceLiteral__DistanceAssignment_1 ) )
            {
            // InternalDSL.g:1625:1: ( ( rule__DistanceLiteral__DistanceAssignment_1 ) )
            // InternalDSL.g:1626:2: ( rule__DistanceLiteral__DistanceAssignment_1 )
            {
             before(grammarAccess.getDistanceLiteralAccess().getDistanceAssignment_1()); 
            // InternalDSL.g:1627:2: ( rule__DistanceLiteral__DistanceAssignment_1 )
            // InternalDSL.g:1627:3: rule__DistanceLiteral__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDistanceLiteralAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__Group__1__Impl"


    // $ANTLR start "rule__RobotBehavior__BehaviorlistAssignment"
    // InternalDSL.g:1636:1: rule__RobotBehavior__BehaviorlistAssignment : ( ruleBehaviors ) ;
    public final void rule__RobotBehavior__BehaviorlistAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1640:1: ( ( ruleBehaviors ) )
            // InternalDSL.g:1641:2: ( ruleBehaviors )
            {
            // InternalDSL.g:1641:2: ( ruleBehaviors )
            // InternalDSL.g:1642:3: ruleBehaviors
            {
             before(grammarAccess.getRobotBehaviorAccess().getBehaviorlistBehaviorsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviors();

            state._fsp--;

             after(grammarAccess.getRobotBehaviorAccess().getBehaviorlistBehaviorsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotBehavior__BehaviorlistAssignment"


    // $ANTLR start "rule__Behaviors__NameAssignment_1"
    // InternalDSL.g:1651:1: rule__Behaviors__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Behaviors__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1655:1: ( ( RULE_ID ) )
            // InternalDSL.g:1656:2: ( RULE_ID )
            {
            // InternalDSL.g:1656:2: ( RULE_ID )
            // InternalDSL.g:1657:3: RULE_ID
            {
             before(grammarAccess.getBehaviorsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBehaviorsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__NameAssignment_1"


    // $ANTLR start "rule__Behaviors__SensorExpressionAssignment_3"
    // InternalDSL.g:1666:1: rule__Behaviors__SensorExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Behaviors__SensorExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1670:1: ( ( ruleExpression ) )
            // InternalDSL.g:1671:2: ( ruleExpression )
            {
            // InternalDSL.g:1671:2: ( ruleExpression )
            // InternalDSL.g:1672:3: ruleExpression
            {
             before(grammarAccess.getBehaviorsAccess().getSensorExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBehaviorsAccess().getSensorExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__SensorExpressionAssignment_3"


    // $ANTLR start "rule__Behaviors__ActionlistAssignment_5"
    // InternalDSL.g:1681:1: rule__Behaviors__ActionlistAssignment_5 : ( ruleActions ) ;
    public final void rule__Behaviors__ActionlistAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1685:1: ( ( ruleActions ) )
            // InternalDSL.g:1686:2: ( ruleActions )
            {
            // InternalDSL.g:1686:2: ( ruleActions )
            // InternalDSL.g:1687:3: ruleActions
            {
             before(grammarAccess.getBehaviorsAccess().getActionlistActionsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getBehaviorsAccess().getActionlistActionsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviors__ActionlistAssignment_5"


    // $ANTLR start "rule__LeftMovementAction__LeftmoveAssignment_1"
    // InternalDSL.g:1696:1: rule__LeftMovementAction__LeftmoveAssignment_1 : ( ruleMovementAction ) ;
    public final void rule__LeftMovementAction__LeftmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1700:1: ( ( ruleMovementAction ) )
            // InternalDSL.g:1701:2: ( ruleMovementAction )
            {
            // InternalDSL.g:1701:2: ( ruleMovementAction )
            // InternalDSL.g:1702:3: ruleMovementAction
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftmoveMovementActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMovementAction();

            state._fsp--;

             after(grammarAccess.getLeftMovementActionAccess().getLeftmoveMovementActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMovementAction__LeftmoveAssignment_1"


    // $ANTLR start "rule__RightMovementAction__RightmoveAssignment_1"
    // InternalDSL.g:1711:1: rule__RightMovementAction__RightmoveAssignment_1 : ( ruleMovementAction ) ;
    public final void rule__RightMovementAction__RightmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1715:1: ( ( ruleMovementAction ) )
            // InternalDSL.g:1716:2: ( ruleMovementAction )
            {
            // InternalDSL.g:1716:2: ( ruleMovementAction )
            // InternalDSL.g:1717:3: ruleMovementAction
            {
             before(grammarAccess.getRightMovementActionAccess().getRightmoveMovementActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMovementAction();

            state._fsp--;

             after(grammarAccess.getRightMovementActionAccess().getRightmoveMovementActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMovementAction__RightmoveAssignment_1"


    // $ANTLR start "rule__RotateMovementAction__RotateleftAssignment_1"
    // InternalDSL.g:1726:1: rule__RotateMovementAction__RotateleftAssignment_1 : ( RULE_INT ) ;
    public final void rule__RotateMovementAction__RotateleftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1730:1: ( ( RULE_INT ) )
            // InternalDSL.g:1731:2: ( RULE_INT )
            {
            // InternalDSL.g:1731:2: ( RULE_INT )
            // InternalDSL.g:1732:3: RULE_INT
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotateleftINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getRotateleftINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__RotateleftAssignment_1"


    // $ANTLR start "rule__RotateMovementAction__LeftdirAssignment_2"
    // InternalDSL.g:1741:1: rule__RotateMovementAction__LeftdirAssignment_2 : ( ruleRotateEnum ) ;
    public final void rule__RotateMovementAction__LeftdirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1745:1: ( ( ruleRotateEnum ) )
            // InternalDSL.g:1746:2: ( ruleRotateEnum )
            {
            // InternalDSL.g:1746:2: ( ruleRotateEnum )
            // InternalDSL.g:1747:3: ruleRotateEnum
            {
             before(grammarAccess.getRotateMovementActionAccess().getLeftdirRotateEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRotateEnum();

            state._fsp--;

             after(grammarAccess.getRotateMovementActionAccess().getLeftdirRotateEnumEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__LeftdirAssignment_2"


    // $ANTLR start "rule__RotateMovementAction__RotaterightAssignment_3"
    // InternalDSL.g:1756:1: rule__RotateMovementAction__RotaterightAssignment_3 : ( RULE_INT ) ;
    public final void rule__RotateMovementAction__RotaterightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1760:1: ( ( RULE_INT ) )
            // InternalDSL.g:1761:2: ( RULE_INT )
            {
            // InternalDSL.g:1761:2: ( RULE_INT )
            // InternalDSL.g:1762:3: RULE_INT
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotaterightINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getRotaterightINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__RotaterightAssignment_3"


    // $ANTLR start "rule__RotateMovementAction__RightdirAssignment_4"
    // InternalDSL.g:1771:1: rule__RotateMovementAction__RightdirAssignment_4 : ( ruleRotateEnum ) ;
    public final void rule__RotateMovementAction__RightdirAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1775:1: ( ( ruleRotateEnum ) )
            // InternalDSL.g:1776:2: ( ruleRotateEnum )
            {
            // InternalDSL.g:1776:2: ( ruleRotateEnum )
            // InternalDSL.g:1777:3: ruleRotateEnum
            {
             before(grammarAccess.getRotateMovementActionAccess().getRightdirRotateEnumEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRotateEnum();

            state._fsp--;

             after(grammarAccess.getRotateMovementActionAccess().getRightdirRotateEnumEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateMovementAction__RightdirAssignment_4"


    // $ANTLR start "rule__MovementAction__ActionenumAssignment"
    // InternalDSL.g:1786:1: rule__MovementAction__ActionenumAssignment : ( ruleActionEnum ) ;
    public final void rule__MovementAction__ActionenumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1790:1: ( ( ruleActionEnum ) )
            // InternalDSL.g:1791:2: ( ruleActionEnum )
            {
            // InternalDSL.g:1791:2: ( ruleActionEnum )
            // InternalDSL.g:1792:3: ruleActionEnum
            {
             before(grammarAccess.getMovementActionAccess().getActionenumActionEnumEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleActionEnum();

            state._fsp--;

             after(grammarAccess.getMovementActionAccess().getActionenumActionEnumEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MovementAction__ActionenumAssignment"


    // $ANTLR start "rule__Expression1__RightAssignment_1_2"
    // InternalDSL.g:1801:1: rule__Expression1__RightAssignment_1_2 : ( ruleExpression2 ) ;
    public final void rule__Expression1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1805:1: ( ( ruleExpression2 ) )
            // InternalDSL.g:1806:2: ( ruleExpression2 )
            {
            // InternalDSL.g:1806:2: ( ruleExpression2 )
            // InternalDSL.g:1807:3: ruleExpression2
            {
             before(grammarAccess.getExpression1Access().getRightExpression2ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression1Access().getRightExpression2ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__RightAssignment_1_2"


    // $ANTLR start "rule__Expression2__RightAssignment_1_2"
    // InternalDSL.g:1816:1: rule__Expression2__RightAssignment_1_2 : ( ruleExpression3 ) ;
    public final void rule__Expression2__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1820:1: ( ( ruleExpression3 ) )
            // InternalDSL.g:1821:2: ( ruleExpression3 )
            {
            // InternalDSL.g:1821:2: ( ruleExpression3 )
            // InternalDSL.g:1822:3: ruleExpression3
            {
             before(grammarAccess.getExpression2Access().getRightExpression3ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression2Access().getRightExpression3ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__RightAssignment_1_2"


    // $ANTLR start "rule__ExpressionBracket__ExpAssignment_1"
    // InternalDSL.g:1831:1: rule__ExpressionBracket__ExpAssignment_1 : ( ruleExpression ) ;
    public final void rule__ExpressionBracket__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1835:1: ( ( ruleExpression ) )
            // InternalDSL.g:1836:2: ( ruleExpression )
            {
            // InternalDSL.g:1836:2: ( ruleExpression )
            // InternalDSL.g:1837:3: ruleExpression
            {
             before(grammarAccess.getExpressionBracketAccess().getExpExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionBracketAccess().getExpExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionBracket__ExpAssignment_1"


    // $ANTLR start "rule__TouchLiteral__TouchAssignment_1"
    // InternalDSL.g:1846:1: rule__TouchLiteral__TouchAssignment_1 : ( ruleTouchEnum ) ;
    public final void rule__TouchLiteral__TouchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1850:1: ( ( ruleTouchEnum ) )
            // InternalDSL.g:1851:2: ( ruleTouchEnum )
            {
            // InternalDSL.g:1851:2: ( ruleTouchEnum )
            // InternalDSL.g:1852:3: ruleTouchEnum
            {
             before(grammarAccess.getTouchLiteralAccess().getTouchTouchEnumEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTouchEnum();

            state._fsp--;

             after(grammarAccess.getTouchLiteralAccess().getTouchTouchEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchLiteral__TouchAssignment_1"


    // $ANTLR start "rule__ColorLiteral__ColorAssignment_1"
    // InternalDSL.g:1861:1: rule__ColorLiteral__ColorAssignment_1 : ( ruleColorEnum ) ;
    public final void rule__ColorLiteral__ColorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1865:1: ( ( ruleColorEnum ) )
            // InternalDSL.g:1866:2: ( ruleColorEnum )
            {
            // InternalDSL.g:1866:2: ( ruleColorEnum )
            // InternalDSL.g:1867:3: ruleColorEnum
            {
             before(grammarAccess.getColorLiteralAccess().getColorColorEnumEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColorEnum();

            state._fsp--;

             after(grammarAccess.getColorLiteralAccess().getColorColorEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorLiteral__ColorAssignment_1"


    // $ANTLR start "rule__DistanceLiteral__DistanceAssignment_1"
    // InternalDSL.g:1876:1: rule__DistanceLiteral__DistanceAssignment_1 : ( RULE_INT ) ;
    public final void rule__DistanceLiteral__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1880:1: ( ( RULE_INT ) )
            // InternalDSL.g:1881:2: ( RULE_INT )
            {
            // InternalDSL.g:1881:2: ( RULE_INT )
            // InternalDSL.g:1882:3: RULE_INT
            {
             before(grammarAccess.getDistanceLiteralAccess().getDistanceINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDistanceLiteralAccess().getDistanceINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceLiteral__DistanceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003A00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000FF0000L});

}