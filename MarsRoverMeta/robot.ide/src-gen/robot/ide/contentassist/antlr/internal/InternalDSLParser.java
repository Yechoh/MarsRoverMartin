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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'left'", "'right'", "'forward'", "'backward'", "'stop'", "'frontLeft'", "'frontRight'", "'back'", "'touchFrontLeft'", "'touchFrontRight'", "'NONE'", "'BLACK'", "'BLUE'", "'GREEN'", "'YELLOW'", "'RED'", "'WHITE'", "'BROWN'", "'Behavior'", "'IF'", "'THEN'", "'END'", "'leftMotor'", "'rightMotor'", "'rotate'", "'around'", "'for'", "'degrees'", "'wheel'", "'middle'", "'to'", "'the'", "'AND'", "'OR'", "'('", "')'", "'hits'", "'colorFront'", "'sees'", "'color'", "'object'", "'at'", "'cm'", "'edge'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA1_0==29) ) {
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


    // $ANTLR start "entryRuleRotatePoints"
    // InternalDSL.g:235:1: entryRuleRotatePoints : ruleRotatePoints EOF ;
    public final void entryRuleRotatePoints() throws RecognitionException {
        try {
            // InternalDSL.g:236:1: ( ruleRotatePoints EOF )
            // InternalDSL.g:237:1: ruleRotatePoints EOF
            {
             before(grammarAccess.getRotatePointsRule()); 
            pushFollow(FOLLOW_1);
            ruleRotatePoints();

            state._fsp--;

             after(grammarAccess.getRotatePointsRule()); 
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
    // $ANTLR end "entryRuleRotatePoints"


    // $ANTLR start "ruleRotatePoints"
    // InternalDSL.g:244:1: ruleRotatePoints : ( ( rule__RotatePoints__Alternatives ) ) ;
    public final void ruleRotatePoints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:248:2: ( ( ( rule__RotatePoints__Alternatives ) ) )
            // InternalDSL.g:249:2: ( ( rule__RotatePoints__Alternatives ) )
            {
            // InternalDSL.g:249:2: ( ( rule__RotatePoints__Alternatives ) )
            // InternalDSL.g:250:3: ( rule__RotatePoints__Alternatives )
            {
             before(grammarAccess.getRotatePointsAccess().getAlternatives()); 
            // InternalDSL.g:251:3: ( rule__RotatePoints__Alternatives )
            // InternalDSL.g:251:4: rule__RotatePoints__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RotatePoints__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRotatePointsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRotatePoints"


    // $ANTLR start "entryRuleLeftRotatePoint"
    // InternalDSL.g:260:1: entryRuleLeftRotatePoint : ruleLeftRotatePoint EOF ;
    public final void entryRuleLeftRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:261:1: ( ruleLeftRotatePoint EOF )
            // InternalDSL.g:262:1: ruleLeftRotatePoint EOF
            {
             before(grammarAccess.getLeftRotatePointRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftRotatePoint();

            state._fsp--;

             after(grammarAccess.getLeftRotatePointRule()); 
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
    // $ANTLR end "entryRuleLeftRotatePoint"


    // $ANTLR start "ruleLeftRotatePoint"
    // InternalDSL.g:269:1: ruleLeftRotatePoint : ( ( rule__LeftRotatePoint__Group__0 ) ) ;
    public final void ruleLeftRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:273:2: ( ( ( rule__LeftRotatePoint__Group__0 ) ) )
            // InternalDSL.g:274:2: ( ( rule__LeftRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:274:2: ( ( rule__LeftRotatePoint__Group__0 ) )
            // InternalDSL.g:275:3: ( rule__LeftRotatePoint__Group__0 )
            {
             before(grammarAccess.getLeftRotatePointAccess().getGroup()); 
            // InternalDSL.g:276:3: ( rule__LeftRotatePoint__Group__0 )
            // InternalDSL.g:276:4: rule__LeftRotatePoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftRotatePoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftRotatePointAccess().getGroup()); 

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
    // $ANTLR end "ruleLeftRotatePoint"


    // $ANTLR start "entryRuleRightRotatePoint"
    // InternalDSL.g:285:1: entryRuleRightRotatePoint : ruleRightRotatePoint EOF ;
    public final void entryRuleRightRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:286:1: ( ruleRightRotatePoint EOF )
            // InternalDSL.g:287:1: ruleRightRotatePoint EOF
            {
             before(grammarAccess.getRightRotatePointRule()); 
            pushFollow(FOLLOW_1);
            ruleRightRotatePoint();

            state._fsp--;

             after(grammarAccess.getRightRotatePointRule()); 
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
    // $ANTLR end "entryRuleRightRotatePoint"


    // $ANTLR start "ruleRightRotatePoint"
    // InternalDSL.g:294:1: ruleRightRotatePoint : ( ( rule__RightRotatePoint__Group__0 ) ) ;
    public final void ruleRightRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:298:2: ( ( ( rule__RightRotatePoint__Group__0 ) ) )
            // InternalDSL.g:299:2: ( ( rule__RightRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:299:2: ( ( rule__RightRotatePoint__Group__0 ) )
            // InternalDSL.g:300:3: ( rule__RightRotatePoint__Group__0 )
            {
             before(grammarAccess.getRightRotatePointAccess().getGroup()); 
            // InternalDSL.g:301:3: ( rule__RightRotatePoint__Group__0 )
            // InternalDSL.g:301:4: rule__RightRotatePoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightRotatePoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightRotatePointAccess().getGroup()); 

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
    // $ANTLR end "ruleRightRotatePoint"


    // $ANTLR start "entryRuleMiddleRotatePoint"
    // InternalDSL.g:310:1: entryRuleMiddleRotatePoint : ruleMiddleRotatePoint EOF ;
    public final void entryRuleMiddleRotatePoint() throws RecognitionException {
        try {
            // InternalDSL.g:311:1: ( ruleMiddleRotatePoint EOF )
            // InternalDSL.g:312:1: ruleMiddleRotatePoint EOF
            {
             before(grammarAccess.getMiddleRotatePointRule()); 
            pushFollow(FOLLOW_1);
            ruleMiddleRotatePoint();

            state._fsp--;

             after(grammarAccess.getMiddleRotatePointRule()); 
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
    // $ANTLR end "entryRuleMiddleRotatePoint"


    // $ANTLR start "ruleMiddleRotatePoint"
    // InternalDSL.g:319:1: ruleMiddleRotatePoint : ( ( rule__MiddleRotatePoint__Group__0 ) ) ;
    public final void ruleMiddleRotatePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:323:2: ( ( ( rule__MiddleRotatePoint__Group__0 ) ) )
            // InternalDSL.g:324:2: ( ( rule__MiddleRotatePoint__Group__0 ) )
            {
            // InternalDSL.g:324:2: ( ( rule__MiddleRotatePoint__Group__0 ) )
            // InternalDSL.g:325:3: ( rule__MiddleRotatePoint__Group__0 )
            {
             before(grammarAccess.getMiddleRotatePointAccess().getGroup()); 
            // InternalDSL.g:326:3: ( rule__MiddleRotatePoint__Group__0 )
            // InternalDSL.g:326:4: rule__MiddleRotatePoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMiddleRotatePointAccess().getGroup()); 

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
    // $ANTLR end "ruleMiddleRotatePoint"


    // $ANTLR start "entryRuleMovementAction"
    // InternalDSL.g:335:1: entryRuleMovementAction : ruleMovementAction EOF ;
    public final void entryRuleMovementAction() throws RecognitionException {
        try {
            // InternalDSL.g:336:1: ( ruleMovementAction EOF )
            // InternalDSL.g:337:1: ruleMovementAction EOF
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
    // InternalDSL.g:344:1: ruleMovementAction : ( ( rule__MovementAction__ActionenumAssignment ) ) ;
    public final void ruleMovementAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:348:2: ( ( ( rule__MovementAction__ActionenumAssignment ) ) )
            // InternalDSL.g:349:2: ( ( rule__MovementAction__ActionenumAssignment ) )
            {
            // InternalDSL.g:349:2: ( ( rule__MovementAction__ActionenumAssignment ) )
            // InternalDSL.g:350:3: ( rule__MovementAction__ActionenumAssignment )
            {
             before(grammarAccess.getMovementActionAccess().getActionenumAssignment()); 
            // InternalDSL.g:351:3: ( rule__MovementAction__ActionenumAssignment )
            // InternalDSL.g:351:4: rule__MovementAction__ActionenumAssignment
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
    // InternalDSL.g:360:1: entryRuleExpression1 : ruleExpression1 EOF ;
    public final void entryRuleExpression1() throws RecognitionException {
        try {
            // InternalDSL.g:361:1: ( ruleExpression1 EOF )
            // InternalDSL.g:362:1: ruleExpression1 EOF
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
    // InternalDSL.g:369:1: ruleExpression1 : ( ( rule__Expression1__Group__0 ) ) ;
    public final void ruleExpression1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:373:2: ( ( ( rule__Expression1__Group__0 ) ) )
            // InternalDSL.g:374:2: ( ( rule__Expression1__Group__0 ) )
            {
            // InternalDSL.g:374:2: ( ( rule__Expression1__Group__0 ) )
            // InternalDSL.g:375:3: ( rule__Expression1__Group__0 )
            {
             before(grammarAccess.getExpression1Access().getGroup()); 
            // InternalDSL.g:376:3: ( rule__Expression1__Group__0 )
            // InternalDSL.g:376:4: rule__Expression1__Group__0
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
    // InternalDSL.g:385:1: entryRuleExpression2 : ruleExpression2 EOF ;
    public final void entryRuleExpression2() throws RecognitionException {
        try {
            // InternalDSL.g:386:1: ( ruleExpression2 EOF )
            // InternalDSL.g:387:1: ruleExpression2 EOF
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
    // InternalDSL.g:394:1: ruleExpression2 : ( ( rule__Expression2__Group__0 ) ) ;
    public final void ruleExpression2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:398:2: ( ( ( rule__Expression2__Group__0 ) ) )
            // InternalDSL.g:399:2: ( ( rule__Expression2__Group__0 ) )
            {
            // InternalDSL.g:399:2: ( ( rule__Expression2__Group__0 ) )
            // InternalDSL.g:400:3: ( rule__Expression2__Group__0 )
            {
             before(grammarAccess.getExpression2Access().getGroup()); 
            // InternalDSL.g:401:3: ( rule__Expression2__Group__0 )
            // InternalDSL.g:401:4: rule__Expression2__Group__0
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
    // InternalDSL.g:410:1: entryRuleExpression3 : ruleExpression3 EOF ;
    public final void entryRuleExpression3() throws RecognitionException {
        try {
            // InternalDSL.g:411:1: ( ruleExpression3 EOF )
            // InternalDSL.g:412:1: ruleExpression3 EOF
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
    // InternalDSL.g:419:1: ruleExpression3 : ( ( rule__Expression3__Alternatives ) ) ;
    public final void ruleExpression3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:423:2: ( ( ( rule__Expression3__Alternatives ) ) )
            // InternalDSL.g:424:2: ( ( rule__Expression3__Alternatives ) )
            {
            // InternalDSL.g:424:2: ( ( rule__Expression3__Alternatives ) )
            // InternalDSL.g:425:3: ( rule__Expression3__Alternatives )
            {
             before(grammarAccess.getExpression3Access().getAlternatives()); 
            // InternalDSL.g:426:3: ( rule__Expression3__Alternatives )
            // InternalDSL.g:426:4: rule__Expression3__Alternatives
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
    // InternalDSL.g:435:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalDSL.g:436:1: ( ruleExpressionBracket EOF )
            // InternalDSL.g:437:1: ruleExpressionBracket EOF
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
    // InternalDSL.g:444:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:448:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalDSL.g:449:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalDSL.g:449:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalDSL.g:450:3: ( rule__ExpressionBracket__Group__0 )
            {
             before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            // InternalDSL.g:451:3: ( rule__ExpressionBracket__Group__0 )
            // InternalDSL.g:451:4: rule__ExpressionBracket__Group__0
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
    // InternalDSL.g:460:1: entryRuleTouchLiteral : ruleTouchLiteral EOF ;
    public final void entryRuleTouchLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:461:1: ( ruleTouchLiteral EOF )
            // InternalDSL.g:462:1: ruleTouchLiteral EOF
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
    // InternalDSL.g:469:1: ruleTouchLiteral : ( ( rule__TouchLiteral__Group__0 ) ) ;
    public final void ruleTouchLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:473:2: ( ( ( rule__TouchLiteral__Group__0 ) ) )
            // InternalDSL.g:474:2: ( ( rule__TouchLiteral__Group__0 ) )
            {
            // InternalDSL.g:474:2: ( ( rule__TouchLiteral__Group__0 ) )
            // InternalDSL.g:475:3: ( rule__TouchLiteral__Group__0 )
            {
             before(grammarAccess.getTouchLiteralAccess().getGroup()); 
            // InternalDSL.g:476:3: ( rule__TouchLiteral__Group__0 )
            // InternalDSL.g:476:4: rule__TouchLiteral__Group__0
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
    // InternalDSL.g:485:1: entryRuleColorLiteral : ruleColorLiteral EOF ;
    public final void entryRuleColorLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:486:1: ( ruleColorLiteral EOF )
            // InternalDSL.g:487:1: ruleColorLiteral EOF
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
    // InternalDSL.g:494:1: ruleColorLiteral : ( ( rule__ColorLiteral__Group__0 ) ) ;
    public final void ruleColorLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:498:2: ( ( ( rule__ColorLiteral__Group__0 ) ) )
            // InternalDSL.g:499:2: ( ( rule__ColorLiteral__Group__0 ) )
            {
            // InternalDSL.g:499:2: ( ( rule__ColorLiteral__Group__0 ) )
            // InternalDSL.g:500:3: ( rule__ColorLiteral__Group__0 )
            {
             before(grammarAccess.getColorLiteralAccess().getGroup()); 
            // InternalDSL.g:501:3: ( rule__ColorLiteral__Group__0 )
            // InternalDSL.g:501:4: rule__ColorLiteral__Group__0
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
    // InternalDSL.g:510:1: entryRuleDistanceLiteral : ruleDistanceLiteral EOF ;
    public final void entryRuleDistanceLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:511:1: ( ruleDistanceLiteral EOF )
            // InternalDSL.g:512:1: ruleDistanceLiteral EOF
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
    // InternalDSL.g:519:1: ruleDistanceLiteral : ( ( rule__DistanceLiteral__Group__0 ) ) ;
    public final void ruleDistanceLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:523:2: ( ( ( rule__DistanceLiteral__Group__0 ) ) )
            // InternalDSL.g:524:2: ( ( rule__DistanceLiteral__Group__0 ) )
            {
            // InternalDSL.g:524:2: ( ( rule__DistanceLiteral__Group__0 ) )
            // InternalDSL.g:525:3: ( rule__DistanceLiteral__Group__0 )
            {
             before(grammarAccess.getDistanceLiteralAccess().getGroup()); 
            // InternalDSL.g:526:3: ( rule__DistanceLiteral__Group__0 )
            // InternalDSL.g:526:4: rule__DistanceLiteral__Group__0
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


    // $ANTLR start "entryRuleEdgeLiteral"
    // InternalDSL.g:535:1: entryRuleEdgeLiteral : ruleEdgeLiteral EOF ;
    public final void entryRuleEdgeLiteral() throws RecognitionException {
        try {
            // InternalDSL.g:536:1: ( ruleEdgeLiteral EOF )
            // InternalDSL.g:537:1: ruleEdgeLiteral EOF
            {
             before(grammarAccess.getEdgeLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEdgeLiteral();

            state._fsp--;

             after(grammarAccess.getEdgeLiteralRule()); 
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
    // $ANTLR end "entryRuleEdgeLiteral"


    // $ANTLR start "ruleEdgeLiteral"
    // InternalDSL.g:544:1: ruleEdgeLiteral : ( ( rule__EdgeLiteral__Group__0 ) ) ;
    public final void ruleEdgeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:548:2: ( ( ( rule__EdgeLiteral__Group__0 ) ) )
            // InternalDSL.g:549:2: ( ( rule__EdgeLiteral__Group__0 ) )
            {
            // InternalDSL.g:549:2: ( ( rule__EdgeLiteral__Group__0 ) )
            // InternalDSL.g:550:3: ( rule__EdgeLiteral__Group__0 )
            {
             before(grammarAccess.getEdgeLiteralAccess().getGroup()); 
            // InternalDSL.g:551:3: ( rule__EdgeLiteral__Group__0 )
            // InternalDSL.g:551:4: rule__EdgeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleEdgeLiteral"


    // $ANTLR start "ruleLREnum"
    // InternalDSL.g:560:1: ruleLREnum : ( ( rule__LREnum__Alternatives ) ) ;
    public final void ruleLREnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:564:1: ( ( ( rule__LREnum__Alternatives ) ) )
            // InternalDSL.g:565:2: ( ( rule__LREnum__Alternatives ) )
            {
            // InternalDSL.g:565:2: ( ( rule__LREnum__Alternatives ) )
            // InternalDSL.g:566:3: ( rule__LREnum__Alternatives )
            {
             before(grammarAccess.getLREnumAccess().getAlternatives()); 
            // InternalDSL.g:567:3: ( rule__LREnum__Alternatives )
            // InternalDSL.g:567:4: rule__LREnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LREnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLREnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLREnum"


    // $ANTLR start "ruleFBEnum"
    // InternalDSL.g:576:1: ruleFBEnum : ( ( rule__FBEnum__Alternatives ) ) ;
    public final void ruleFBEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:580:1: ( ( ( rule__FBEnum__Alternatives ) ) )
            // InternalDSL.g:581:2: ( ( rule__FBEnum__Alternatives ) )
            {
            // InternalDSL.g:581:2: ( ( rule__FBEnum__Alternatives ) )
            // InternalDSL.g:582:3: ( rule__FBEnum__Alternatives )
            {
             before(grammarAccess.getFBEnumAccess().getAlternatives()); 
            // InternalDSL.g:583:3: ( rule__FBEnum__Alternatives )
            // InternalDSL.g:583:4: rule__FBEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FBEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFBEnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFBEnum"


    // $ANTLR start "ruleActionEnum"
    // InternalDSL.g:592:1: ruleActionEnum : ( ( rule__ActionEnum__Alternatives ) ) ;
    public final void ruleActionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:596:1: ( ( ( rule__ActionEnum__Alternatives ) ) )
            // InternalDSL.g:597:2: ( ( rule__ActionEnum__Alternatives ) )
            {
            // InternalDSL.g:597:2: ( ( rule__ActionEnum__Alternatives ) )
            // InternalDSL.g:598:3: ( rule__ActionEnum__Alternatives )
            {
             before(grammarAccess.getActionEnumAccess().getAlternatives()); 
            // InternalDSL.g:599:3: ( rule__ActionEnum__Alternatives )
            // InternalDSL.g:599:4: rule__ActionEnum__Alternatives
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


    // $ANTLR start "ruleEdgeEnum"
    // InternalDSL.g:608:1: ruleEdgeEnum : ( ( rule__EdgeEnum__Alternatives ) ) ;
    public final void ruleEdgeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:612:1: ( ( ( rule__EdgeEnum__Alternatives ) ) )
            // InternalDSL.g:613:2: ( ( rule__EdgeEnum__Alternatives ) )
            {
            // InternalDSL.g:613:2: ( ( rule__EdgeEnum__Alternatives ) )
            // InternalDSL.g:614:3: ( rule__EdgeEnum__Alternatives )
            {
             before(grammarAccess.getEdgeEnumAccess().getAlternatives()); 
            // InternalDSL.g:615:3: ( rule__EdgeEnum__Alternatives )
            // InternalDSL.g:615:4: rule__EdgeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EdgeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEdgeEnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEdgeEnum"


    // $ANTLR start "ruleTouchEnum"
    // InternalDSL.g:624:1: ruleTouchEnum : ( ( rule__TouchEnum__Alternatives ) ) ;
    public final void ruleTouchEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:628:1: ( ( ( rule__TouchEnum__Alternatives ) ) )
            // InternalDSL.g:629:2: ( ( rule__TouchEnum__Alternatives ) )
            {
            // InternalDSL.g:629:2: ( ( rule__TouchEnum__Alternatives ) )
            // InternalDSL.g:630:3: ( rule__TouchEnum__Alternatives )
            {
             before(grammarAccess.getTouchEnumAccess().getAlternatives()); 
            // InternalDSL.g:631:3: ( rule__TouchEnum__Alternatives )
            // InternalDSL.g:631:4: rule__TouchEnum__Alternatives
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
    // InternalDSL.g:640:1: ruleColorEnum : ( ( rule__ColorEnum__Alternatives ) ) ;
    public final void ruleColorEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:644:1: ( ( ( rule__ColorEnum__Alternatives ) ) )
            // InternalDSL.g:645:2: ( ( rule__ColorEnum__Alternatives ) )
            {
            // InternalDSL.g:645:2: ( ( rule__ColorEnum__Alternatives ) )
            // InternalDSL.g:646:3: ( rule__ColorEnum__Alternatives )
            {
             before(grammarAccess.getColorEnumAccess().getAlternatives()); 
            // InternalDSL.g:647:3: ( rule__ColorEnum__Alternatives )
            // InternalDSL.g:647:4: rule__ColorEnum__Alternatives
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
    // InternalDSL.g:655:1: rule__Actions__Alternatives : ( ( ruleLeftMovementAction ) | ( ruleRightMovementAction ) | ( ruleRotateMovementAction ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:659:1: ( ( ruleLeftMovementAction ) | ( ruleRightMovementAction ) | ( ruleRotateMovementAction ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 35:
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
                    // InternalDSL.g:660:2: ( ruleLeftMovementAction )
                    {
                    // InternalDSL.g:660:2: ( ruleLeftMovementAction )
                    // InternalDSL.g:661:3: ruleLeftMovementAction
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
                    // InternalDSL.g:666:2: ( ruleRightMovementAction )
                    {
                    // InternalDSL.g:666:2: ( ruleRightMovementAction )
                    // InternalDSL.g:667:3: ruleRightMovementAction
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
                    // InternalDSL.g:672:2: ( ruleRotateMovementAction )
                    {
                    // InternalDSL.g:672:2: ( ruleRotateMovementAction )
                    // InternalDSL.g:673:3: ruleRotateMovementAction
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


    // $ANTLR start "rule__RotatePoints__Alternatives"
    // InternalDSL.g:682:1: rule__RotatePoints__Alternatives : ( ( ruleLeftRotatePoint ) | ( ruleRightRotatePoint ) | ( ruleMiddleRotatePoint ) );
    public final void rule__RotatePoints__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:686:1: ( ( ruleLeftRotatePoint ) | ( ruleRightRotatePoint ) | ( ruleMiddleRotatePoint ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDSL.g:687:2: ( ruleLeftRotatePoint )
                    {
                    // InternalDSL.g:687:2: ( ruleLeftRotatePoint )
                    // InternalDSL.g:688:3: ruleLeftRotatePoint
                    {
                     before(grammarAccess.getRotatePointsAccess().getLeftRotatePointParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLeftRotatePoint();

                    state._fsp--;

                     after(grammarAccess.getRotatePointsAccess().getLeftRotatePointParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:693:2: ( ruleRightRotatePoint )
                    {
                    // InternalDSL.g:693:2: ( ruleRightRotatePoint )
                    // InternalDSL.g:694:3: ruleRightRotatePoint
                    {
                     before(grammarAccess.getRotatePointsAccess().getRightRotatePointParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightRotatePoint();

                    state._fsp--;

                     after(grammarAccess.getRotatePointsAccess().getRightRotatePointParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:699:2: ( ruleMiddleRotatePoint )
                    {
                    // InternalDSL.g:699:2: ( ruleMiddleRotatePoint )
                    // InternalDSL.g:700:3: ruleMiddleRotatePoint
                    {
                     before(grammarAccess.getRotatePointsAccess().getMiddleRotatePointParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMiddleRotatePoint();

                    state._fsp--;

                     after(grammarAccess.getRotatePointsAccess().getMiddleRotatePointParserRuleCall_2()); 

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
    // $ANTLR end "rule__RotatePoints__Alternatives"


    // $ANTLR start "rule__Expression3__Alternatives"
    // InternalDSL.g:709:1: rule__Expression3__Alternatives : ( ( ruleExpressionBracket ) | ( ruleTouchLiteral ) | ( ruleColorLiteral ) | ( ruleDistanceLiteral ) | ( ruleEdgeLiteral ) );
    public final void rule__Expression3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:713:1: ( ( ruleExpressionBracket ) | ( ruleTouchLiteral ) | ( ruleColorLiteral ) | ( ruleDistanceLiteral ) | ( ruleEdgeLiteral ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt4=1;
                }
                break;
            case 19:
            case 20:
                {
                alt4=2;
                }
                break;
            case 48:
                {
                alt4=3;
                }
                break;
            case 51:
                {
                alt4=4;
                }
                break;
            case 54:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDSL.g:714:2: ( ruleExpressionBracket )
                    {
                    // InternalDSL.g:714:2: ( ruleExpressionBracket )
                    // InternalDSL.g:715:3: ruleExpressionBracket
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
                    // InternalDSL.g:720:2: ( ruleTouchLiteral )
                    {
                    // InternalDSL.g:720:2: ( ruleTouchLiteral )
                    // InternalDSL.g:721:3: ruleTouchLiteral
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
                    // InternalDSL.g:726:2: ( ruleColorLiteral )
                    {
                    // InternalDSL.g:726:2: ( ruleColorLiteral )
                    // InternalDSL.g:727:3: ruleColorLiteral
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
                    // InternalDSL.g:732:2: ( ruleDistanceLiteral )
                    {
                    // InternalDSL.g:732:2: ( ruleDistanceLiteral )
                    // InternalDSL.g:733:3: ruleDistanceLiteral
                    {
                     before(grammarAccess.getExpression3Access().getDistanceLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getDistanceLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:738:2: ( ruleEdgeLiteral )
                    {
                    // InternalDSL.g:738:2: ( ruleEdgeLiteral )
                    // InternalDSL.g:739:3: ruleEdgeLiteral
                    {
                     before(grammarAccess.getExpression3Access().getEdgeLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEdgeLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression3Access().getEdgeLiteralParserRuleCall_4()); 

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


    // $ANTLR start "rule__LREnum__Alternatives"
    // InternalDSL.g:748:1: rule__LREnum__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__LREnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:752:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:753:2: ( ( 'left' ) )
                    {
                    // InternalDSL.g:753:2: ( ( 'left' ) )
                    // InternalDSL.g:754:3: ( 'left' )
                    {
                     before(grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:755:3: ( 'left' )
                    // InternalDSL.g:755:4: 'left'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:759:2: ( ( 'right' ) )
                    {
                    // InternalDSL.g:759:2: ( ( 'right' ) )
                    // InternalDSL.g:760:3: ( 'right' )
                    {
                     before(grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:761:3: ( 'right' )
                    // InternalDSL.g:761:4: 'right'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__LREnum__Alternatives"


    // $ANTLR start "rule__FBEnum__Alternatives"
    // InternalDSL.g:769:1: rule__FBEnum__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) );
    public final void rule__FBEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:773:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:774:2: ( ( 'forward' ) )
                    {
                    // InternalDSL.g:774:2: ( ( 'forward' ) )
                    // InternalDSL.g:775:3: ( 'forward' )
                    {
                     before(grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:776:3: ( 'forward' )
                    // InternalDSL.g:776:4: 'forward'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:780:2: ( ( 'backward' ) )
                    {
                    // InternalDSL.g:780:2: ( ( 'backward' ) )
                    // InternalDSL.g:781:3: ( 'backward' )
                    {
                     before(grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:782:3: ( 'backward' )
                    // InternalDSL.g:782:4: 'backward'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__FBEnum__Alternatives"


    // $ANTLR start "rule__ActionEnum__Alternatives"
    // InternalDSL.g:790:1: rule__ActionEnum__Alternatives : ( ( ( 'forward' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) );
    public final void rule__ActionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:794:1: ( ( ( 'forward' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:795:2: ( ( 'forward' ) )
                    {
                    // InternalDSL.g:795:2: ( ( 'forward' ) )
                    // InternalDSL.g:796:3: ( 'forward' )
                    {
                     before(grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:797:3: ( 'forward' )
                    // InternalDSL.g:797:4: 'forward'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:801:2: ( ( 'backward' ) )
                    {
                    // InternalDSL.g:801:2: ( ( 'backward' ) )
                    // InternalDSL.g:802:3: ( 'backward' )
                    {
                     before(grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:803:3: ( 'backward' )
                    // InternalDSL.g:803:4: 'backward'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:807:2: ( ( 'stop' ) )
                    {
                    // InternalDSL.g:807:2: ( ( 'stop' ) )
                    // InternalDSL.g:808:3: ( 'stop' )
                    {
                     before(grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:809:3: ( 'stop' )
                    // InternalDSL.g:809:4: 'stop'
                    {
                    match(input,15,FOLLOW_2); 

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


    // $ANTLR start "rule__EdgeEnum__Alternatives"
    // InternalDSL.g:817:1: rule__EdgeEnum__Alternatives : ( ( ( 'frontLeft' ) ) | ( ( 'frontRight' ) ) | ( ( 'back' ) ) );
    public final void rule__EdgeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:821:1: ( ( ( 'frontLeft' ) ) | ( ( 'frontRight' ) ) | ( ( 'back' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDSL.g:822:2: ( ( 'frontLeft' ) )
                    {
                    // InternalDSL.g:822:2: ( ( 'frontLeft' ) )
                    // InternalDSL.g:823:3: ( 'frontLeft' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:824:3: ( 'frontLeft' )
                    // InternalDSL.g:824:4: 'frontLeft'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:828:2: ( ( 'frontRight' ) )
                    {
                    // InternalDSL.g:828:2: ( ( 'frontRight' ) )
                    // InternalDSL.g:829:3: ( 'frontRight' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:830:3: ( 'frontRight' )
                    // InternalDSL.g:830:4: 'frontRight'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:834:2: ( ( 'back' ) )
                    {
                    // InternalDSL.g:834:2: ( ( 'back' ) )
                    // InternalDSL.g:835:3: ( 'back' )
                    {
                     before(grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:836:3: ( 'back' )
                    // InternalDSL.g:836:4: 'back'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__EdgeEnum__Alternatives"


    // $ANTLR start "rule__TouchEnum__Alternatives"
    // InternalDSL.g:844:1: rule__TouchEnum__Alternatives : ( ( ( 'touchFrontLeft' ) ) | ( ( 'touchFrontRight' ) ) );
    public final void rule__TouchEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:848:1: ( ( ( 'touchFrontLeft' ) ) | ( ( 'touchFrontRight' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:849:2: ( ( 'touchFrontLeft' ) )
                    {
                    // InternalDSL.g:849:2: ( ( 'touchFrontLeft' ) )
                    // InternalDSL.g:850:3: ( 'touchFrontLeft' )
                    {
                     before(grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:851:3: ( 'touchFrontLeft' )
                    // InternalDSL.g:851:4: 'touchFrontLeft'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:855:2: ( ( 'touchFrontRight' ) )
                    {
                    // InternalDSL.g:855:2: ( ( 'touchFrontRight' ) )
                    // InternalDSL.g:856:3: ( 'touchFrontRight' )
                    {
                     before(grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:857:3: ( 'touchFrontRight' )
                    // InternalDSL.g:857:4: 'touchFrontRight'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalDSL.g:865:1: rule__ColorEnum__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'GREEN' ) ) | ( ( 'YELLOW' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'BROWN' ) ) );
    public final void rule__ColorEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:869:1: ( ( ( 'NONE' ) ) | ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'GREEN' ) ) | ( ( 'YELLOW' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'BROWN' ) ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            case 25:
                {
                alt10=5;
                }
                break;
            case 26:
                {
                alt10=6;
                }
                break;
            case 27:
                {
                alt10=7;
                }
                break;
            case 28:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDSL.g:870:2: ( ( 'NONE' ) )
                    {
                    // InternalDSL.g:870:2: ( ( 'NONE' ) )
                    // InternalDSL.g:871:3: ( 'NONE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalDSL.g:872:3: ( 'NONE' )
                    // InternalDSL.g:872:4: 'NONE'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:876:2: ( ( 'BLACK' ) )
                    {
                    // InternalDSL.g:876:2: ( ( 'BLACK' ) )
                    // InternalDSL.g:877:3: ( 'BLACK' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1()); 
                    // InternalDSL.g:878:3: ( 'BLACK' )
                    // InternalDSL.g:878:4: 'BLACK'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:882:2: ( ( 'BLUE' ) )
                    {
                    // InternalDSL.g:882:2: ( ( 'BLUE' ) )
                    // InternalDSL.g:883:3: ( 'BLUE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 
                    // InternalDSL.g:884:3: ( 'BLUE' )
                    // InternalDSL.g:884:4: 'BLUE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:888:2: ( ( 'GREEN' ) )
                    {
                    // InternalDSL.g:888:2: ( ( 'GREEN' ) )
                    // InternalDSL.g:889:3: ( 'GREEN' )
                    {
                     before(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3()); 
                    // InternalDSL.g:890:3: ( 'GREEN' )
                    // InternalDSL.g:890:4: 'GREEN'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:894:2: ( ( 'YELLOW' ) )
                    {
                    // InternalDSL.g:894:2: ( ( 'YELLOW' ) )
                    // InternalDSL.g:895:3: ( 'YELLOW' )
                    {
                     before(grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4()); 
                    // InternalDSL.g:896:3: ( 'YELLOW' )
                    // InternalDSL.g:896:4: 'YELLOW'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:900:2: ( ( 'RED' ) )
                    {
                    // InternalDSL.g:900:2: ( ( 'RED' ) )
                    // InternalDSL.g:901:3: ( 'RED' )
                    {
                     before(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5()); 
                    // InternalDSL.g:902:3: ( 'RED' )
                    // InternalDSL.g:902:4: 'RED'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:906:2: ( ( 'WHITE' ) )
                    {
                    // InternalDSL.g:906:2: ( ( 'WHITE' ) )
                    // InternalDSL.g:907:3: ( 'WHITE' )
                    {
                     before(grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6()); 
                    // InternalDSL.g:908:3: ( 'WHITE' )
                    // InternalDSL.g:908:4: 'WHITE'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:912:2: ( ( 'BROWN' ) )
                    {
                    // InternalDSL.g:912:2: ( ( 'BROWN' ) )
                    // InternalDSL.g:913:3: ( 'BROWN' )
                    {
                     before(grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7()); 
                    // InternalDSL.g:914:3: ( 'BROWN' )
                    // InternalDSL.g:914:4: 'BROWN'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalDSL.g:922:1: rule__Behaviors__Group__0 : rule__Behaviors__Group__0__Impl rule__Behaviors__Group__1 ;
    public final void rule__Behaviors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:926:1: ( rule__Behaviors__Group__0__Impl rule__Behaviors__Group__1 )
            // InternalDSL.g:927:2: rule__Behaviors__Group__0__Impl rule__Behaviors__Group__1
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
    // InternalDSL.g:934:1: rule__Behaviors__Group__0__Impl : ( 'Behavior' ) ;
    public final void rule__Behaviors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:938:1: ( ( 'Behavior' ) )
            // InternalDSL.g:939:1: ( 'Behavior' )
            {
            // InternalDSL.g:939:1: ( 'Behavior' )
            // InternalDSL.g:940:2: 'Behavior'
            {
             before(grammarAccess.getBehaviorsAccess().getBehaviorKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:949:1: rule__Behaviors__Group__1 : rule__Behaviors__Group__1__Impl rule__Behaviors__Group__2 ;
    public final void rule__Behaviors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:953:1: ( rule__Behaviors__Group__1__Impl rule__Behaviors__Group__2 )
            // InternalDSL.g:954:2: rule__Behaviors__Group__1__Impl rule__Behaviors__Group__2
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
    // InternalDSL.g:961:1: rule__Behaviors__Group__1__Impl : ( ( rule__Behaviors__NameAssignment_1 ) ) ;
    public final void rule__Behaviors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:965:1: ( ( ( rule__Behaviors__NameAssignment_1 ) ) )
            // InternalDSL.g:966:1: ( ( rule__Behaviors__NameAssignment_1 ) )
            {
            // InternalDSL.g:966:1: ( ( rule__Behaviors__NameAssignment_1 ) )
            // InternalDSL.g:967:2: ( rule__Behaviors__NameAssignment_1 )
            {
             before(grammarAccess.getBehaviorsAccess().getNameAssignment_1()); 
            // InternalDSL.g:968:2: ( rule__Behaviors__NameAssignment_1 )
            // InternalDSL.g:968:3: rule__Behaviors__NameAssignment_1
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
    // InternalDSL.g:976:1: rule__Behaviors__Group__2 : rule__Behaviors__Group__2__Impl rule__Behaviors__Group__3 ;
    public final void rule__Behaviors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:980:1: ( rule__Behaviors__Group__2__Impl rule__Behaviors__Group__3 )
            // InternalDSL.g:981:2: rule__Behaviors__Group__2__Impl rule__Behaviors__Group__3
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
    // InternalDSL.g:988:1: rule__Behaviors__Group__2__Impl : ( 'IF' ) ;
    public final void rule__Behaviors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:992:1: ( ( 'IF' ) )
            // InternalDSL.g:993:1: ( 'IF' )
            {
            // InternalDSL.g:993:1: ( 'IF' )
            // InternalDSL.g:994:2: 'IF'
            {
             before(grammarAccess.getBehaviorsAccess().getIFKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:1003:1: rule__Behaviors__Group__3 : rule__Behaviors__Group__3__Impl rule__Behaviors__Group__4 ;
    public final void rule__Behaviors__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1007:1: ( rule__Behaviors__Group__3__Impl rule__Behaviors__Group__4 )
            // InternalDSL.g:1008:2: rule__Behaviors__Group__3__Impl rule__Behaviors__Group__4
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
    // InternalDSL.g:1015:1: rule__Behaviors__Group__3__Impl : ( ( rule__Behaviors__SensorExpressionAssignment_3 ) ) ;
    public final void rule__Behaviors__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1019:1: ( ( ( rule__Behaviors__SensorExpressionAssignment_3 ) ) )
            // InternalDSL.g:1020:1: ( ( rule__Behaviors__SensorExpressionAssignment_3 ) )
            {
            // InternalDSL.g:1020:1: ( ( rule__Behaviors__SensorExpressionAssignment_3 ) )
            // InternalDSL.g:1021:2: ( rule__Behaviors__SensorExpressionAssignment_3 )
            {
             before(grammarAccess.getBehaviorsAccess().getSensorExpressionAssignment_3()); 
            // InternalDSL.g:1022:2: ( rule__Behaviors__SensorExpressionAssignment_3 )
            // InternalDSL.g:1022:3: rule__Behaviors__SensorExpressionAssignment_3
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
    // InternalDSL.g:1030:1: rule__Behaviors__Group__4 : rule__Behaviors__Group__4__Impl rule__Behaviors__Group__5 ;
    public final void rule__Behaviors__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1034:1: ( rule__Behaviors__Group__4__Impl rule__Behaviors__Group__5 )
            // InternalDSL.g:1035:2: rule__Behaviors__Group__4__Impl rule__Behaviors__Group__5
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
    // InternalDSL.g:1042:1: rule__Behaviors__Group__4__Impl : ( 'THEN' ) ;
    public final void rule__Behaviors__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1046:1: ( ( 'THEN' ) )
            // InternalDSL.g:1047:1: ( 'THEN' )
            {
            // InternalDSL.g:1047:1: ( 'THEN' )
            // InternalDSL.g:1048:2: 'THEN'
            {
             before(grammarAccess.getBehaviorsAccess().getTHENKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:1057:1: rule__Behaviors__Group__5 : rule__Behaviors__Group__5__Impl rule__Behaviors__Group__6 ;
    public final void rule__Behaviors__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1061:1: ( rule__Behaviors__Group__5__Impl rule__Behaviors__Group__6 )
            // InternalDSL.g:1062:2: rule__Behaviors__Group__5__Impl rule__Behaviors__Group__6
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
    // InternalDSL.g:1069:1: rule__Behaviors__Group__5__Impl : ( ( ( rule__Behaviors__ActionlistAssignment_5 ) ) ( ( rule__Behaviors__ActionlistAssignment_5 )* ) ) ;
    public final void rule__Behaviors__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1073:1: ( ( ( ( rule__Behaviors__ActionlistAssignment_5 ) ) ( ( rule__Behaviors__ActionlistAssignment_5 )* ) ) )
            // InternalDSL.g:1074:1: ( ( ( rule__Behaviors__ActionlistAssignment_5 ) ) ( ( rule__Behaviors__ActionlistAssignment_5 )* ) )
            {
            // InternalDSL.g:1074:1: ( ( ( rule__Behaviors__ActionlistAssignment_5 ) ) ( ( rule__Behaviors__ActionlistAssignment_5 )* ) )
            // InternalDSL.g:1075:2: ( ( rule__Behaviors__ActionlistAssignment_5 ) ) ( ( rule__Behaviors__ActionlistAssignment_5 )* )
            {
            // InternalDSL.g:1075:2: ( ( rule__Behaviors__ActionlistAssignment_5 ) )
            // InternalDSL.g:1076:3: ( rule__Behaviors__ActionlistAssignment_5 )
            {
             before(grammarAccess.getBehaviorsAccess().getActionlistAssignment_5()); 
            // InternalDSL.g:1077:3: ( rule__Behaviors__ActionlistAssignment_5 )
            // InternalDSL.g:1077:4: rule__Behaviors__ActionlistAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Behaviors__ActionlistAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorsAccess().getActionlistAssignment_5()); 

            }

            // InternalDSL.g:1080:2: ( ( rule__Behaviors__ActionlistAssignment_5 )* )
            // InternalDSL.g:1081:3: ( rule__Behaviors__ActionlistAssignment_5 )*
            {
             before(grammarAccess.getBehaviorsAccess().getActionlistAssignment_5()); 
            // InternalDSL.g:1082:3: ( rule__Behaviors__ActionlistAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=33 && LA11_0<=35)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:1082:4: rule__Behaviors__ActionlistAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Behaviors__ActionlistAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDSL.g:1091:1: rule__Behaviors__Group__6 : rule__Behaviors__Group__6__Impl ;
    public final void rule__Behaviors__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1095:1: ( rule__Behaviors__Group__6__Impl )
            // InternalDSL.g:1096:2: rule__Behaviors__Group__6__Impl
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
    // InternalDSL.g:1102:1: rule__Behaviors__Group__6__Impl : ( 'END' ) ;
    public final void rule__Behaviors__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1106:1: ( ( 'END' ) )
            // InternalDSL.g:1107:1: ( 'END' )
            {
            // InternalDSL.g:1107:1: ( 'END' )
            // InternalDSL.g:1108:2: 'END'
            {
             before(grammarAccess.getBehaviorsAccess().getENDKeyword_6()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDSL.g:1118:1: rule__LeftMovementAction__Group__0 : rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1 ;
    public final void rule__LeftMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1122:1: ( rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1 )
            // InternalDSL.g:1123:2: rule__LeftMovementAction__Group__0__Impl rule__LeftMovementAction__Group__1
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
    // InternalDSL.g:1130:1: rule__LeftMovementAction__Group__0__Impl : ( 'leftMotor' ) ;
    public final void rule__LeftMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1134:1: ( ( 'leftMotor' ) )
            // InternalDSL.g:1135:1: ( 'leftMotor' )
            {
            // InternalDSL.g:1135:1: ( 'leftMotor' )
            // InternalDSL.g:1136:2: 'leftMotor'
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftMotorKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDSL.g:1145:1: rule__LeftMovementAction__Group__1 : rule__LeftMovementAction__Group__1__Impl ;
    public final void rule__LeftMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1149:1: ( rule__LeftMovementAction__Group__1__Impl )
            // InternalDSL.g:1150:2: rule__LeftMovementAction__Group__1__Impl
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
    // InternalDSL.g:1156:1: rule__LeftMovementAction__Group__1__Impl : ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) ) ;
    public final void rule__LeftMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1160:1: ( ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) ) )
            // InternalDSL.g:1161:1: ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) )
            {
            // InternalDSL.g:1161:1: ( ( rule__LeftMovementAction__LeftmoveAssignment_1 ) )
            // InternalDSL.g:1162:2: ( rule__LeftMovementAction__LeftmoveAssignment_1 )
            {
             before(grammarAccess.getLeftMovementActionAccess().getLeftmoveAssignment_1()); 
            // InternalDSL.g:1163:2: ( rule__LeftMovementAction__LeftmoveAssignment_1 )
            // InternalDSL.g:1163:3: rule__LeftMovementAction__LeftmoveAssignment_1
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
    // InternalDSL.g:1172:1: rule__RightMovementAction__Group__0 : rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1 ;
    public final void rule__RightMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1176:1: ( rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1 )
            // InternalDSL.g:1177:2: rule__RightMovementAction__Group__0__Impl rule__RightMovementAction__Group__1
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
    // InternalDSL.g:1184:1: rule__RightMovementAction__Group__0__Impl : ( 'rightMotor' ) ;
    public final void rule__RightMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1188:1: ( ( 'rightMotor' ) )
            // InternalDSL.g:1189:1: ( 'rightMotor' )
            {
            // InternalDSL.g:1189:1: ( 'rightMotor' )
            // InternalDSL.g:1190:2: 'rightMotor'
            {
             before(grammarAccess.getRightMovementActionAccess().getRightMotorKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDSL.g:1199:1: rule__RightMovementAction__Group__1 : rule__RightMovementAction__Group__1__Impl ;
    public final void rule__RightMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1203:1: ( rule__RightMovementAction__Group__1__Impl )
            // InternalDSL.g:1204:2: rule__RightMovementAction__Group__1__Impl
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
    // InternalDSL.g:1210:1: rule__RightMovementAction__Group__1__Impl : ( ( rule__RightMovementAction__RightmoveAssignment_1 ) ) ;
    public final void rule__RightMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1214:1: ( ( ( rule__RightMovementAction__RightmoveAssignment_1 ) ) )
            // InternalDSL.g:1215:1: ( ( rule__RightMovementAction__RightmoveAssignment_1 ) )
            {
            // InternalDSL.g:1215:1: ( ( rule__RightMovementAction__RightmoveAssignment_1 ) )
            // InternalDSL.g:1216:2: ( rule__RightMovementAction__RightmoveAssignment_1 )
            {
             before(grammarAccess.getRightMovementActionAccess().getRightmoveAssignment_1()); 
            // InternalDSL.g:1217:2: ( rule__RightMovementAction__RightmoveAssignment_1 )
            // InternalDSL.g:1217:3: rule__RightMovementAction__RightmoveAssignment_1
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
    // InternalDSL.g:1226:1: rule__RotateMovementAction__Group__0 : rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1 ;
    public final void rule__RotateMovementAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1230:1: ( rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1 )
            // InternalDSL.g:1231:2: rule__RotateMovementAction__Group__0__Impl rule__RotateMovementAction__Group__1
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
    // InternalDSL.g:1238:1: rule__RotateMovementAction__Group__0__Impl : ( 'rotate' ) ;
    public final void rule__RotateMovementAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1242:1: ( ( 'rotate' ) )
            // InternalDSL.g:1243:1: ( 'rotate' )
            {
            // InternalDSL.g:1243:1: ( 'rotate' )
            // InternalDSL.g:1244:2: 'rotate'
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDSL.g:1253:1: rule__RotateMovementAction__Group__1 : rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2 ;
    public final void rule__RotateMovementAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1257:1: ( rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2 )
            // InternalDSL.g:1258:2: rule__RotateMovementAction__Group__1__Impl rule__RotateMovementAction__Group__2
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
    // InternalDSL.g:1265:1: rule__RotateMovementAction__Group__1__Impl : ( 'around' ) ;
    public final void rule__RotateMovementAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1269:1: ( ( 'around' ) )
            // InternalDSL.g:1270:1: ( 'around' )
            {
            // InternalDSL.g:1270:1: ( 'around' )
            // InternalDSL.g:1271:2: 'around'
            {
             before(grammarAccess.getRotateMovementActionAccess().getAroundKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getAroundKeyword_1()); 

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
    // InternalDSL.g:1280:1: rule__RotateMovementAction__Group__2 : rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3 ;
    public final void rule__RotateMovementAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1284:1: ( rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3 )
            // InternalDSL.g:1285:2: rule__RotateMovementAction__Group__2__Impl rule__RotateMovementAction__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDSL.g:1292:1: rule__RotateMovementAction__Group__2__Impl : ( ruleRotatePoints ) ;
    public final void rule__RotateMovementAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1296:1: ( ( ruleRotatePoints ) )
            // InternalDSL.g:1297:1: ( ruleRotatePoints )
            {
            // InternalDSL.g:1297:1: ( ruleRotatePoints )
            // InternalDSL.g:1298:2: ruleRotatePoints
            {
             before(grammarAccess.getRotateMovementActionAccess().getRotatePointsParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleRotatePoints();

            state._fsp--;

             after(grammarAccess.getRotateMovementActionAccess().getRotatePointsParserRuleCall_2()); 

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
    // InternalDSL.g:1307:1: rule__RotateMovementAction__Group__3 : rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4 ;
    public final void rule__RotateMovementAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1311:1: ( rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4 )
            // InternalDSL.g:1312:2: rule__RotateMovementAction__Group__3__Impl rule__RotateMovementAction__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalDSL.g:1319:1: rule__RotateMovementAction__Group__3__Impl : ( 'for' ) ;
    public final void rule__RotateMovementAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1323:1: ( ( 'for' ) )
            // InternalDSL.g:1324:1: ( 'for' )
            {
            // InternalDSL.g:1324:1: ( 'for' )
            // InternalDSL.g:1325:2: 'for'
            {
             before(grammarAccess.getRotateMovementActionAccess().getForKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getForKeyword_3()); 

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
    // InternalDSL.g:1334:1: rule__RotateMovementAction__Group__4 : rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5 ;
    public final void rule__RotateMovementAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1338:1: ( rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5 )
            // InternalDSL.g:1339:2: rule__RotateMovementAction__Group__4__Impl rule__RotateMovementAction__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__RotateMovementAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__5();

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
    // InternalDSL.g:1346:1: rule__RotateMovementAction__Group__4__Impl : ( ( rule__RotateMovementAction__DegreesAssignment_4 ) ) ;
    public final void rule__RotateMovementAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1350:1: ( ( ( rule__RotateMovementAction__DegreesAssignment_4 ) ) )
            // InternalDSL.g:1351:1: ( ( rule__RotateMovementAction__DegreesAssignment_4 ) )
            {
            // InternalDSL.g:1351:1: ( ( rule__RotateMovementAction__DegreesAssignment_4 ) )
            // InternalDSL.g:1352:2: ( rule__RotateMovementAction__DegreesAssignment_4 )
            {
             before(grammarAccess.getRotateMovementActionAccess().getDegreesAssignment_4()); 
            // InternalDSL.g:1353:2: ( rule__RotateMovementAction__DegreesAssignment_4 )
            // InternalDSL.g:1353:3: rule__RotateMovementAction__DegreesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__DegreesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRotateMovementActionAccess().getDegreesAssignment_4()); 

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


    // $ANTLR start "rule__RotateMovementAction__Group__5"
    // InternalDSL.g:1361:1: rule__RotateMovementAction__Group__5 : rule__RotateMovementAction__Group__5__Impl ;
    public final void rule__RotateMovementAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1365:1: ( rule__RotateMovementAction__Group__5__Impl )
            // InternalDSL.g:1366:2: rule__RotateMovementAction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateMovementAction__Group__5__Impl();

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
    // $ANTLR end "rule__RotateMovementAction__Group__5"


    // $ANTLR start "rule__RotateMovementAction__Group__5__Impl"
    // InternalDSL.g:1372:1: rule__RotateMovementAction__Group__5__Impl : ( 'degrees' ) ;
    public final void rule__RotateMovementAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1376:1: ( ( 'degrees' ) )
            // InternalDSL.g:1377:1: ( 'degrees' )
            {
            // InternalDSL.g:1377:1: ( 'degrees' )
            // InternalDSL.g:1378:2: 'degrees'
            {
             before(grammarAccess.getRotateMovementActionAccess().getDegreesKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getDegreesKeyword_5()); 

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
    // $ANTLR end "rule__RotateMovementAction__Group__5__Impl"


    // $ANTLR start "rule__LeftRotatePoint__Group__0"
    // InternalDSL.g:1388:1: rule__LeftRotatePoint__Group__0 : rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1 ;
    public final void rule__LeftRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1392:1: ( rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1 )
            // InternalDSL.g:1393:2: rule__LeftRotatePoint__Group__0__Impl rule__LeftRotatePoint__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__LeftRotatePoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftRotatePoint__Group__1();

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
    // $ANTLR end "rule__LeftRotatePoint__Group__0"


    // $ANTLR start "rule__LeftRotatePoint__Group__0__Impl"
    // InternalDSL.g:1400:1: rule__LeftRotatePoint__Group__0__Impl : ( 'left' ) ;
    public final void rule__LeftRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1404:1: ( ( 'left' ) )
            // InternalDSL.g:1405:1: ( 'left' )
            {
            // InternalDSL.g:1405:1: ( 'left' )
            // InternalDSL.g:1406:2: 'left'
            {
             before(grammarAccess.getLeftRotatePointAccess().getLeftKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLeftRotatePointAccess().getLeftKeyword_0()); 

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
    // $ANTLR end "rule__LeftRotatePoint__Group__0__Impl"


    // $ANTLR start "rule__LeftRotatePoint__Group__1"
    // InternalDSL.g:1415:1: rule__LeftRotatePoint__Group__1 : rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2 ;
    public final void rule__LeftRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1419:1: ( rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2 )
            // InternalDSL.g:1420:2: rule__LeftRotatePoint__Group__1__Impl rule__LeftRotatePoint__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__LeftRotatePoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftRotatePoint__Group__2();

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
    // $ANTLR end "rule__LeftRotatePoint__Group__1"


    // $ANTLR start "rule__LeftRotatePoint__Group__1__Impl"
    // InternalDSL.g:1427:1: rule__LeftRotatePoint__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__LeftRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1431:1: ( ( 'wheel' ) )
            // InternalDSL.g:1432:1: ( 'wheel' )
            {
            // InternalDSL.g:1432:1: ( 'wheel' )
            // InternalDSL.g:1433:2: 'wheel'
            {
             before(grammarAccess.getLeftRotatePointAccess().getWheelKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLeftRotatePointAccess().getWheelKeyword_1()); 

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
    // $ANTLR end "rule__LeftRotatePoint__Group__1__Impl"


    // $ANTLR start "rule__LeftRotatePoint__Group__2"
    // InternalDSL.g:1442:1: rule__LeftRotatePoint__Group__2 : rule__LeftRotatePoint__Group__2__Impl ;
    public final void rule__LeftRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1446:1: ( rule__LeftRotatePoint__Group__2__Impl )
            // InternalDSL.g:1447:2: rule__LeftRotatePoint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftRotatePoint__Group__2__Impl();

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
    // $ANTLR end "rule__LeftRotatePoint__Group__2"


    // $ANTLR start "rule__LeftRotatePoint__Group__2__Impl"
    // InternalDSL.g:1453:1: rule__LeftRotatePoint__Group__2__Impl : ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) ) ;
    public final void rule__LeftRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1457:1: ( ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) ) )
            // InternalDSL.g:1458:1: ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) )
            {
            // InternalDSL.g:1458:1: ( ( rule__LeftRotatePoint__LeftdirAssignment_2 ) )
            // InternalDSL.g:1459:2: ( rule__LeftRotatePoint__LeftdirAssignment_2 )
            {
             before(grammarAccess.getLeftRotatePointAccess().getLeftdirAssignment_2()); 
            // InternalDSL.g:1460:2: ( rule__LeftRotatePoint__LeftdirAssignment_2 )
            // InternalDSL.g:1460:3: rule__LeftRotatePoint__LeftdirAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeftRotatePoint__LeftdirAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftRotatePointAccess().getLeftdirAssignment_2()); 

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
    // $ANTLR end "rule__LeftRotatePoint__Group__2__Impl"


    // $ANTLR start "rule__RightRotatePoint__Group__0"
    // InternalDSL.g:1469:1: rule__RightRotatePoint__Group__0 : rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1 ;
    public final void rule__RightRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1473:1: ( rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1 )
            // InternalDSL.g:1474:2: rule__RightRotatePoint__Group__0__Impl rule__RightRotatePoint__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__RightRotatePoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightRotatePoint__Group__1();

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
    // $ANTLR end "rule__RightRotatePoint__Group__0"


    // $ANTLR start "rule__RightRotatePoint__Group__0__Impl"
    // InternalDSL.g:1481:1: rule__RightRotatePoint__Group__0__Impl : ( 'right' ) ;
    public final void rule__RightRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1485:1: ( ( 'right' ) )
            // InternalDSL.g:1486:1: ( 'right' )
            {
            // InternalDSL.g:1486:1: ( 'right' )
            // InternalDSL.g:1487:2: 'right'
            {
             before(grammarAccess.getRightRotatePointAccess().getRightKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRightRotatePointAccess().getRightKeyword_0()); 

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
    // $ANTLR end "rule__RightRotatePoint__Group__0__Impl"


    // $ANTLR start "rule__RightRotatePoint__Group__1"
    // InternalDSL.g:1496:1: rule__RightRotatePoint__Group__1 : rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2 ;
    public final void rule__RightRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1500:1: ( rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2 )
            // InternalDSL.g:1501:2: rule__RightRotatePoint__Group__1__Impl rule__RightRotatePoint__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__RightRotatePoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightRotatePoint__Group__2();

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
    // $ANTLR end "rule__RightRotatePoint__Group__1"


    // $ANTLR start "rule__RightRotatePoint__Group__1__Impl"
    // InternalDSL.g:1508:1: rule__RightRotatePoint__Group__1__Impl : ( 'wheel' ) ;
    public final void rule__RightRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1512:1: ( ( 'wheel' ) )
            // InternalDSL.g:1513:1: ( 'wheel' )
            {
            // InternalDSL.g:1513:1: ( 'wheel' )
            // InternalDSL.g:1514:2: 'wheel'
            {
             before(grammarAccess.getRightRotatePointAccess().getWheelKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRightRotatePointAccess().getWheelKeyword_1()); 

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
    // $ANTLR end "rule__RightRotatePoint__Group__1__Impl"


    // $ANTLR start "rule__RightRotatePoint__Group__2"
    // InternalDSL.g:1523:1: rule__RightRotatePoint__Group__2 : rule__RightRotatePoint__Group__2__Impl ;
    public final void rule__RightRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1527:1: ( rule__RightRotatePoint__Group__2__Impl )
            // InternalDSL.g:1528:2: rule__RightRotatePoint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightRotatePoint__Group__2__Impl();

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
    // $ANTLR end "rule__RightRotatePoint__Group__2"


    // $ANTLR start "rule__RightRotatePoint__Group__2__Impl"
    // InternalDSL.g:1534:1: rule__RightRotatePoint__Group__2__Impl : ( ( rule__RightRotatePoint__RightdirAssignment_2 ) ) ;
    public final void rule__RightRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1538:1: ( ( ( rule__RightRotatePoint__RightdirAssignment_2 ) ) )
            // InternalDSL.g:1539:1: ( ( rule__RightRotatePoint__RightdirAssignment_2 ) )
            {
            // InternalDSL.g:1539:1: ( ( rule__RightRotatePoint__RightdirAssignment_2 ) )
            // InternalDSL.g:1540:2: ( rule__RightRotatePoint__RightdirAssignment_2 )
            {
             before(grammarAccess.getRightRotatePointAccess().getRightdirAssignment_2()); 
            // InternalDSL.g:1541:2: ( rule__RightRotatePoint__RightdirAssignment_2 )
            // InternalDSL.g:1541:3: rule__RightRotatePoint__RightdirAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RightRotatePoint__RightdirAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightRotatePointAccess().getRightdirAssignment_2()); 

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
    // $ANTLR end "rule__RightRotatePoint__Group__2__Impl"


    // $ANTLR start "rule__MiddleRotatePoint__Group__0"
    // InternalDSL.g:1550:1: rule__MiddleRotatePoint__Group__0 : rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1 ;
    public final void rule__MiddleRotatePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1554:1: ( rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1 )
            // InternalDSL.g:1555:2: rule__MiddleRotatePoint__Group__0__Impl rule__MiddleRotatePoint__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MiddleRotatePoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__Group__1();

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
    // $ANTLR end "rule__MiddleRotatePoint__Group__0"


    // $ANTLR start "rule__MiddleRotatePoint__Group__0__Impl"
    // InternalDSL.g:1562:1: rule__MiddleRotatePoint__Group__0__Impl : ( 'middle' ) ;
    public final void rule__MiddleRotatePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1566:1: ( ( 'middle' ) )
            // InternalDSL.g:1567:1: ( 'middle' )
            {
            // InternalDSL.g:1567:1: ( 'middle' )
            // InternalDSL.g:1568:2: 'middle'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getMiddleKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMiddleRotatePointAccess().getMiddleKeyword_0()); 

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
    // $ANTLR end "rule__MiddleRotatePoint__Group__0__Impl"


    // $ANTLR start "rule__MiddleRotatePoint__Group__1"
    // InternalDSL.g:1577:1: rule__MiddleRotatePoint__Group__1 : rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2 ;
    public final void rule__MiddleRotatePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1581:1: ( rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2 )
            // InternalDSL.g:1582:2: rule__MiddleRotatePoint__Group__1__Impl rule__MiddleRotatePoint__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__MiddleRotatePoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__Group__2();

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
    // $ANTLR end "rule__MiddleRotatePoint__Group__1"


    // $ANTLR start "rule__MiddleRotatePoint__Group__1__Impl"
    // InternalDSL.g:1589:1: rule__MiddleRotatePoint__Group__1__Impl : ( 'to' ) ;
    public final void rule__MiddleRotatePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1593:1: ( ( 'to' ) )
            // InternalDSL.g:1594:1: ( 'to' )
            {
            // InternalDSL.g:1594:1: ( 'to' )
            // InternalDSL.g:1595:2: 'to'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getToKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMiddleRotatePointAccess().getToKeyword_1()); 

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
    // $ANTLR end "rule__MiddleRotatePoint__Group__1__Impl"


    // $ANTLR start "rule__MiddleRotatePoint__Group__2"
    // InternalDSL.g:1604:1: rule__MiddleRotatePoint__Group__2 : rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3 ;
    public final void rule__MiddleRotatePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1608:1: ( rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3 )
            // InternalDSL.g:1609:2: rule__MiddleRotatePoint__Group__2__Impl rule__MiddleRotatePoint__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__MiddleRotatePoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__Group__3();

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
    // $ANTLR end "rule__MiddleRotatePoint__Group__2"


    // $ANTLR start "rule__MiddleRotatePoint__Group__2__Impl"
    // InternalDSL.g:1616:1: rule__MiddleRotatePoint__Group__2__Impl : ( 'the' ) ;
    public final void rule__MiddleRotatePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1620:1: ( ( 'the' ) )
            // InternalDSL.g:1621:1: ( 'the' )
            {
            // InternalDSL.g:1621:1: ( 'the' )
            // InternalDSL.g:1622:2: 'the'
            {
             before(grammarAccess.getMiddleRotatePointAccess().getTheKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMiddleRotatePointAccess().getTheKeyword_2()); 

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
    // $ANTLR end "rule__MiddleRotatePoint__Group__2__Impl"


    // $ANTLR start "rule__MiddleRotatePoint__Group__3"
    // InternalDSL.g:1631:1: rule__MiddleRotatePoint__Group__3 : rule__MiddleRotatePoint__Group__3__Impl ;
    public final void rule__MiddleRotatePoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1635:1: ( rule__MiddleRotatePoint__Group__3__Impl )
            // InternalDSL.g:1636:2: rule__MiddleRotatePoint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__Group__3__Impl();

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
    // $ANTLR end "rule__MiddleRotatePoint__Group__3"


    // $ANTLR start "rule__MiddleRotatePoint__Group__3__Impl"
    // InternalDSL.g:1642:1: rule__MiddleRotatePoint__Group__3__Impl : ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) ) ;
    public final void rule__MiddleRotatePoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1646:1: ( ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) ) )
            // InternalDSL.g:1647:1: ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) )
            {
            // InternalDSL.g:1647:1: ( ( rule__MiddleRotatePoint__MiddledirAssignment_3 ) )
            // InternalDSL.g:1648:2: ( rule__MiddleRotatePoint__MiddledirAssignment_3 )
            {
             before(grammarAccess.getMiddleRotatePointAccess().getMiddledirAssignment_3()); 
            // InternalDSL.g:1649:2: ( rule__MiddleRotatePoint__MiddledirAssignment_3 )
            // InternalDSL.g:1649:3: rule__MiddleRotatePoint__MiddledirAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MiddleRotatePoint__MiddledirAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMiddleRotatePointAccess().getMiddledirAssignment_3()); 

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
    // $ANTLR end "rule__MiddleRotatePoint__Group__3__Impl"


    // $ANTLR start "rule__Expression1__Group__0"
    // InternalDSL.g:1658:1: rule__Expression1__Group__0 : rule__Expression1__Group__0__Impl rule__Expression1__Group__1 ;
    public final void rule__Expression1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1662:1: ( rule__Expression1__Group__0__Impl rule__Expression1__Group__1 )
            // InternalDSL.g:1663:2: rule__Expression1__Group__0__Impl rule__Expression1__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:1670:1: rule__Expression1__Group__0__Impl : ( ruleExpression2 ) ;
    public final void rule__Expression1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1674:1: ( ( ruleExpression2 ) )
            // InternalDSL.g:1675:1: ( ruleExpression2 )
            {
            // InternalDSL.g:1675:1: ( ruleExpression2 )
            // InternalDSL.g:1676:2: ruleExpression2
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
    // InternalDSL.g:1685:1: rule__Expression1__Group__1 : rule__Expression1__Group__1__Impl ;
    public final void rule__Expression1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1689:1: ( rule__Expression1__Group__1__Impl )
            // InternalDSL.g:1690:2: rule__Expression1__Group__1__Impl
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
    // InternalDSL.g:1696:1: rule__Expression1__Group__1__Impl : ( ( rule__Expression1__Group_1__0 )* ) ;
    public final void rule__Expression1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1700:1: ( ( ( rule__Expression1__Group_1__0 )* ) )
            // InternalDSL.g:1701:1: ( ( rule__Expression1__Group_1__0 )* )
            {
            // InternalDSL.g:1701:1: ( ( rule__Expression1__Group_1__0 )* )
            // InternalDSL.g:1702:2: ( rule__Expression1__Group_1__0 )*
            {
             before(grammarAccess.getExpression1Access().getGroup_1()); 
            // InternalDSL.g:1703:2: ( rule__Expression1__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==43) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:1703:3: rule__Expression1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Expression1__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDSL.g:1712:1: rule__Expression1__Group_1__0 : rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 ;
    public final void rule__Expression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1716:1: ( rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 )
            // InternalDSL.g:1717:2: rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:1724:1: rule__Expression1__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1728:1: ( ( () ) )
            // InternalDSL.g:1729:1: ( () )
            {
            // InternalDSL.g:1729:1: ( () )
            // InternalDSL.g:1730:2: ()
            {
             before(grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0()); 
            // InternalDSL.g:1731:2: ()
            // InternalDSL.g:1731:3: 
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
    // InternalDSL.g:1739:1: rule__Expression1__Group_1__1 : rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 ;
    public final void rule__Expression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1743:1: ( rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 )
            // InternalDSL.g:1744:2: rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2
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
    // InternalDSL.g:1751:1: rule__Expression1__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__Expression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1755:1: ( ( 'AND' ) )
            // InternalDSL.g:1756:1: ( 'AND' )
            {
            // InternalDSL.g:1756:1: ( 'AND' )
            // InternalDSL.g:1757:2: 'AND'
            {
             before(grammarAccess.getExpression1Access().getANDKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDSL.g:1766:1: rule__Expression1__Group_1__2 : rule__Expression1__Group_1__2__Impl ;
    public final void rule__Expression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1770:1: ( rule__Expression1__Group_1__2__Impl )
            // InternalDSL.g:1771:2: rule__Expression1__Group_1__2__Impl
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
    // InternalDSL.g:1777:1: rule__Expression1__Group_1__2__Impl : ( ( rule__Expression1__RightAssignment_1_2 ) ) ;
    public final void rule__Expression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1781:1: ( ( ( rule__Expression1__RightAssignment_1_2 ) ) )
            // InternalDSL.g:1782:1: ( ( rule__Expression1__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:1782:1: ( ( rule__Expression1__RightAssignment_1_2 ) )
            // InternalDSL.g:1783:2: ( rule__Expression1__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression1Access().getRightAssignment_1_2()); 
            // InternalDSL.g:1784:2: ( rule__Expression1__RightAssignment_1_2 )
            // InternalDSL.g:1784:3: rule__Expression1__RightAssignment_1_2
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
    // InternalDSL.g:1793:1: rule__Expression2__Group__0 : rule__Expression2__Group__0__Impl rule__Expression2__Group__1 ;
    public final void rule__Expression2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1797:1: ( rule__Expression2__Group__0__Impl rule__Expression2__Group__1 )
            // InternalDSL.g:1798:2: rule__Expression2__Group__0__Impl rule__Expression2__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDSL.g:1805:1: rule__Expression2__Group__0__Impl : ( ruleExpression3 ) ;
    public final void rule__Expression2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1809:1: ( ( ruleExpression3 ) )
            // InternalDSL.g:1810:1: ( ruleExpression3 )
            {
            // InternalDSL.g:1810:1: ( ruleExpression3 )
            // InternalDSL.g:1811:2: ruleExpression3
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
    // InternalDSL.g:1820:1: rule__Expression2__Group__1 : rule__Expression2__Group__1__Impl ;
    public final void rule__Expression2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1824:1: ( rule__Expression2__Group__1__Impl )
            // InternalDSL.g:1825:2: rule__Expression2__Group__1__Impl
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
    // InternalDSL.g:1831:1: rule__Expression2__Group__1__Impl : ( ( rule__Expression2__Group_1__0 )* ) ;
    public final void rule__Expression2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1835:1: ( ( ( rule__Expression2__Group_1__0 )* ) )
            // InternalDSL.g:1836:1: ( ( rule__Expression2__Group_1__0 )* )
            {
            // InternalDSL.g:1836:1: ( ( rule__Expression2__Group_1__0 )* )
            // InternalDSL.g:1837:2: ( rule__Expression2__Group_1__0 )*
            {
             before(grammarAccess.getExpression2Access().getGroup_1()); 
            // InternalDSL.g:1838:2: ( rule__Expression2__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1838:3: rule__Expression2__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Expression2__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalDSL.g:1847:1: rule__Expression2__Group_1__0 : rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 ;
    public final void rule__Expression2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1851:1: ( rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 )
            // InternalDSL.g:1852:2: rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDSL.g:1859:1: rule__Expression2__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1863:1: ( ( () ) )
            // InternalDSL.g:1864:1: ( () )
            {
            // InternalDSL.g:1864:1: ( () )
            // InternalDSL.g:1865:2: ()
            {
             before(grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0()); 
            // InternalDSL.g:1866:2: ()
            // InternalDSL.g:1866:3: 
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
    // InternalDSL.g:1874:1: rule__Expression2__Group_1__1 : rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 ;
    public final void rule__Expression2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1878:1: ( rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 )
            // InternalDSL.g:1879:2: rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2
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
    // InternalDSL.g:1886:1: rule__Expression2__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Expression2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1890:1: ( ( 'OR' ) )
            // InternalDSL.g:1891:1: ( 'OR' )
            {
            // InternalDSL.g:1891:1: ( 'OR' )
            // InternalDSL.g:1892:2: 'OR'
            {
             before(grammarAccess.getExpression2Access().getORKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDSL.g:1901:1: rule__Expression2__Group_1__2 : rule__Expression2__Group_1__2__Impl ;
    public final void rule__Expression2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1905:1: ( rule__Expression2__Group_1__2__Impl )
            // InternalDSL.g:1906:2: rule__Expression2__Group_1__2__Impl
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
    // InternalDSL.g:1912:1: rule__Expression2__Group_1__2__Impl : ( ( rule__Expression2__RightAssignment_1_2 ) ) ;
    public final void rule__Expression2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1916:1: ( ( ( rule__Expression2__RightAssignment_1_2 ) ) )
            // InternalDSL.g:1917:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            {
            // InternalDSL.g:1917:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            // InternalDSL.g:1918:2: ( rule__Expression2__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 
            // InternalDSL.g:1919:2: ( rule__Expression2__RightAssignment_1_2 )
            // InternalDSL.g:1919:3: rule__Expression2__RightAssignment_1_2
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
    // InternalDSL.g:1928:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1932:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalDSL.g:1933:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
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
    // InternalDSL.g:1940:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1944:1: ( ( '(' ) )
            // InternalDSL.g:1945:1: ( '(' )
            {
            // InternalDSL.g:1945:1: ( '(' )
            // InternalDSL.g:1946:2: '('
            {
             before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalDSL.g:1955:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1959:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalDSL.g:1960:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalDSL.g:1967:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__ExpAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1971:1: ( ( ( rule__ExpressionBracket__ExpAssignment_1 ) ) )
            // InternalDSL.g:1972:1: ( ( rule__ExpressionBracket__ExpAssignment_1 ) )
            {
            // InternalDSL.g:1972:1: ( ( rule__ExpressionBracket__ExpAssignment_1 ) )
            // InternalDSL.g:1973:2: ( rule__ExpressionBracket__ExpAssignment_1 )
            {
             before(grammarAccess.getExpressionBracketAccess().getExpAssignment_1()); 
            // InternalDSL.g:1974:2: ( rule__ExpressionBracket__ExpAssignment_1 )
            // InternalDSL.g:1974:3: rule__ExpressionBracket__ExpAssignment_1
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
    // InternalDSL.g:1982:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1986:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalDSL.g:1987:2: rule__ExpressionBracket__Group__2__Impl
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
    // InternalDSL.g:1993:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1997:1: ( ( ')' ) )
            // InternalDSL.g:1998:1: ( ')' )
            {
            // InternalDSL.g:1998:1: ( ')' )
            // InternalDSL.g:1999:2: ')'
            {
             before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDSL.g:2009:1: rule__TouchLiteral__Group__0 : rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1 ;
    public final void rule__TouchLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2013:1: ( rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1 )
            // InternalDSL.g:2014:2: rule__TouchLiteral__Group__0__Impl rule__TouchLiteral__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDSL.g:2021:1: rule__TouchLiteral__Group__0__Impl : ( ( rule__TouchLiteral__TouchAssignment_0 ) ) ;
    public final void rule__TouchLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2025:1: ( ( ( rule__TouchLiteral__TouchAssignment_0 ) ) )
            // InternalDSL.g:2026:1: ( ( rule__TouchLiteral__TouchAssignment_0 ) )
            {
            // InternalDSL.g:2026:1: ( ( rule__TouchLiteral__TouchAssignment_0 ) )
            // InternalDSL.g:2027:2: ( rule__TouchLiteral__TouchAssignment_0 )
            {
             before(grammarAccess.getTouchLiteralAccess().getTouchAssignment_0()); 
            // InternalDSL.g:2028:2: ( rule__TouchLiteral__TouchAssignment_0 )
            // InternalDSL.g:2028:3: rule__TouchLiteral__TouchAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TouchLiteral__TouchAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTouchLiteralAccess().getTouchAssignment_0()); 

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
    // InternalDSL.g:2036:1: rule__TouchLiteral__Group__1 : rule__TouchLiteral__Group__1__Impl ;
    public final void rule__TouchLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2040:1: ( rule__TouchLiteral__Group__1__Impl )
            // InternalDSL.g:2041:2: rule__TouchLiteral__Group__1__Impl
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
    // InternalDSL.g:2047:1: rule__TouchLiteral__Group__1__Impl : ( 'hits' ) ;
    public final void rule__TouchLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2051:1: ( ( 'hits' ) )
            // InternalDSL.g:2052:1: ( 'hits' )
            {
            // InternalDSL.g:2052:1: ( 'hits' )
            // InternalDSL.g:2053:2: 'hits'
            {
             before(grammarAccess.getTouchLiteralAccess().getHitsKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTouchLiteralAccess().getHitsKeyword_1()); 

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
    // InternalDSL.g:2063:1: rule__ColorLiteral__Group__0 : rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1 ;
    public final void rule__ColorLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2067:1: ( rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1 )
            // InternalDSL.g:2068:2: rule__ColorLiteral__Group__0__Impl rule__ColorLiteral__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDSL.g:2075:1: rule__ColorLiteral__Group__0__Impl : ( 'colorFront' ) ;
    public final void rule__ColorLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2079:1: ( ( 'colorFront' ) )
            // InternalDSL.g:2080:1: ( 'colorFront' )
            {
            // InternalDSL.g:2080:1: ( 'colorFront' )
            // InternalDSL.g:2081:2: 'colorFront'
            {
             before(grammarAccess.getColorLiteralAccess().getColorFrontKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getColorLiteralAccess().getColorFrontKeyword_0()); 

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
    // InternalDSL.g:2090:1: rule__ColorLiteral__Group__1 : rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2 ;
    public final void rule__ColorLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2094:1: ( rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2 )
            // InternalDSL.g:2095:2: rule__ColorLiteral__Group__1__Impl rule__ColorLiteral__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ColorLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__2();

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
    // InternalDSL.g:2102:1: rule__ColorLiteral__Group__1__Impl : ( 'sees' ) ;
    public final void rule__ColorLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2106:1: ( ( 'sees' ) )
            // InternalDSL.g:2107:1: ( 'sees' )
            {
            // InternalDSL.g:2107:1: ( 'sees' )
            // InternalDSL.g:2108:2: 'sees'
            {
             before(grammarAccess.getColorLiteralAccess().getSeesKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getColorLiteralAccess().getSeesKeyword_1()); 

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


    // $ANTLR start "rule__ColorLiteral__Group__2"
    // InternalDSL.g:2117:1: rule__ColorLiteral__Group__2 : rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3 ;
    public final void rule__ColorLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2121:1: ( rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3 )
            // InternalDSL.g:2122:2: rule__ColorLiteral__Group__2__Impl rule__ColorLiteral__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__ColorLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__3();

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
    // $ANTLR end "rule__ColorLiteral__Group__2"


    // $ANTLR start "rule__ColorLiteral__Group__2__Impl"
    // InternalDSL.g:2129:1: rule__ColorLiteral__Group__2__Impl : ( 'color' ) ;
    public final void rule__ColorLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2133:1: ( ( 'color' ) )
            // InternalDSL.g:2134:1: ( 'color' )
            {
            // InternalDSL.g:2134:1: ( 'color' )
            // InternalDSL.g:2135:2: 'color'
            {
             before(grammarAccess.getColorLiteralAccess().getColorKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getColorLiteralAccess().getColorKeyword_2()); 

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
    // $ANTLR end "rule__ColorLiteral__Group__2__Impl"


    // $ANTLR start "rule__ColorLiteral__Group__3"
    // InternalDSL.g:2144:1: rule__ColorLiteral__Group__3 : rule__ColorLiteral__Group__3__Impl ;
    public final void rule__ColorLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2148:1: ( rule__ColorLiteral__Group__3__Impl )
            // InternalDSL.g:2149:2: rule__ColorLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorLiteral__Group__3__Impl();

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
    // $ANTLR end "rule__ColorLiteral__Group__3"


    // $ANTLR start "rule__ColorLiteral__Group__3__Impl"
    // InternalDSL.g:2155:1: rule__ColorLiteral__Group__3__Impl : ( ( rule__ColorLiteral__ColorAssignment_3 ) ) ;
    public final void rule__ColorLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2159:1: ( ( ( rule__ColorLiteral__ColorAssignment_3 ) ) )
            // InternalDSL.g:2160:1: ( ( rule__ColorLiteral__ColorAssignment_3 ) )
            {
            // InternalDSL.g:2160:1: ( ( rule__ColorLiteral__ColorAssignment_3 ) )
            // InternalDSL.g:2161:2: ( rule__ColorLiteral__ColorAssignment_3 )
            {
             before(grammarAccess.getColorLiteralAccess().getColorAssignment_3()); 
            // InternalDSL.g:2162:2: ( rule__ColorLiteral__ColorAssignment_3 )
            // InternalDSL.g:2162:3: rule__ColorLiteral__ColorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ColorLiteral__ColorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColorLiteralAccess().getColorAssignment_3()); 

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
    // $ANTLR end "rule__ColorLiteral__Group__3__Impl"


    // $ANTLR start "rule__DistanceLiteral__Group__0"
    // InternalDSL.g:2171:1: rule__DistanceLiteral__Group__0 : rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1 ;
    public final void rule__DistanceLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2175:1: ( rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1 )
            // InternalDSL.g:2176:2: rule__DistanceLiteral__Group__0__Impl rule__DistanceLiteral__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDSL.g:2183:1: rule__DistanceLiteral__Group__0__Impl : ( 'object' ) ;
    public final void rule__DistanceLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2187:1: ( ( 'object' ) )
            // InternalDSL.g:2188:1: ( 'object' )
            {
            // InternalDSL.g:2188:1: ( 'object' )
            // InternalDSL.g:2189:2: 'object'
            {
             before(grammarAccess.getDistanceLiteralAccess().getObjectKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDistanceLiteralAccess().getObjectKeyword_0()); 

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
    // InternalDSL.g:2198:1: rule__DistanceLiteral__Group__1 : rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2 ;
    public final void rule__DistanceLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2202:1: ( rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2 )
            // InternalDSL.g:2203:2: rule__DistanceLiteral__Group__1__Impl rule__DistanceLiteral__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__DistanceLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__2();

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
    // InternalDSL.g:2210:1: rule__DistanceLiteral__Group__1__Impl : ( 'at' ) ;
    public final void rule__DistanceLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2214:1: ( ( 'at' ) )
            // InternalDSL.g:2215:1: ( 'at' )
            {
            // InternalDSL.g:2215:1: ( 'at' )
            // InternalDSL.g:2216:2: 'at'
            {
             before(grammarAccess.getDistanceLiteralAccess().getAtKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDistanceLiteralAccess().getAtKeyword_1()); 

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


    // $ANTLR start "rule__DistanceLiteral__Group__2"
    // InternalDSL.g:2225:1: rule__DistanceLiteral__Group__2 : rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3 ;
    public final void rule__DistanceLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2229:1: ( rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3 )
            // InternalDSL.g:2230:2: rule__DistanceLiteral__Group__2__Impl rule__DistanceLiteral__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__DistanceLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__3();

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
    // $ANTLR end "rule__DistanceLiteral__Group__2"


    // $ANTLR start "rule__DistanceLiteral__Group__2__Impl"
    // InternalDSL.g:2237:1: rule__DistanceLiteral__Group__2__Impl : ( ( rule__DistanceLiteral__DistanceAssignment_2 ) ) ;
    public final void rule__DistanceLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2241:1: ( ( ( rule__DistanceLiteral__DistanceAssignment_2 ) ) )
            // InternalDSL.g:2242:1: ( ( rule__DistanceLiteral__DistanceAssignment_2 ) )
            {
            // InternalDSL.g:2242:1: ( ( rule__DistanceLiteral__DistanceAssignment_2 ) )
            // InternalDSL.g:2243:2: ( rule__DistanceLiteral__DistanceAssignment_2 )
            {
             before(grammarAccess.getDistanceLiteralAccess().getDistanceAssignment_2()); 
            // InternalDSL.g:2244:2: ( rule__DistanceLiteral__DistanceAssignment_2 )
            // InternalDSL.g:2244:3: rule__DistanceLiteral__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDistanceLiteralAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__DistanceLiteral__Group__2__Impl"


    // $ANTLR start "rule__DistanceLiteral__Group__3"
    // InternalDSL.g:2252:1: rule__DistanceLiteral__Group__3 : rule__DistanceLiteral__Group__3__Impl ;
    public final void rule__DistanceLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2256:1: ( rule__DistanceLiteral__Group__3__Impl )
            // InternalDSL.g:2257:2: rule__DistanceLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DistanceLiteral__Group__3__Impl();

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
    // $ANTLR end "rule__DistanceLiteral__Group__3"


    // $ANTLR start "rule__DistanceLiteral__Group__3__Impl"
    // InternalDSL.g:2263:1: rule__DistanceLiteral__Group__3__Impl : ( 'cm' ) ;
    public final void rule__DistanceLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2267:1: ( ( 'cm' ) )
            // InternalDSL.g:2268:1: ( 'cm' )
            {
            // InternalDSL.g:2268:1: ( 'cm' )
            // InternalDSL.g:2269:2: 'cm'
            {
             before(grammarAccess.getDistanceLiteralAccess().getCmKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDistanceLiteralAccess().getCmKeyword_3()); 

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
    // $ANTLR end "rule__DistanceLiteral__Group__3__Impl"


    // $ANTLR start "rule__EdgeLiteral__Group__0"
    // InternalDSL.g:2279:1: rule__EdgeLiteral__Group__0 : rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1 ;
    public final void rule__EdgeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2283:1: ( rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1 )
            // InternalDSL.g:2284:2: rule__EdgeLiteral__Group__0__Impl rule__EdgeLiteral__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__EdgeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeLiteral__Group__1();

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
    // $ANTLR end "rule__EdgeLiteral__Group__0"


    // $ANTLR start "rule__EdgeLiteral__Group__0__Impl"
    // InternalDSL.g:2291:1: rule__EdgeLiteral__Group__0__Impl : ( 'edge' ) ;
    public final void rule__EdgeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2295:1: ( ( 'edge' ) )
            // InternalDSL.g:2296:1: ( 'edge' )
            {
            // InternalDSL.g:2296:1: ( 'edge' )
            // InternalDSL.g:2297:2: 'edge'
            {
             before(grammarAccess.getEdgeLiteralAccess().getEdgeKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getEdgeLiteralAccess().getEdgeKeyword_0()); 

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
    // $ANTLR end "rule__EdgeLiteral__Group__0__Impl"


    // $ANTLR start "rule__EdgeLiteral__Group__1"
    // InternalDSL.g:2306:1: rule__EdgeLiteral__Group__1 : rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2 ;
    public final void rule__EdgeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2310:1: ( rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2 )
            // InternalDSL.g:2311:2: rule__EdgeLiteral__Group__1__Impl rule__EdgeLiteral__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__EdgeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeLiteral__Group__2();

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
    // $ANTLR end "rule__EdgeLiteral__Group__1"


    // $ANTLR start "rule__EdgeLiteral__Group__1__Impl"
    // InternalDSL.g:2318:1: rule__EdgeLiteral__Group__1__Impl : ( 'at' ) ;
    public final void rule__EdgeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2322:1: ( ( 'at' ) )
            // InternalDSL.g:2323:1: ( 'at' )
            {
            // InternalDSL.g:2323:1: ( 'at' )
            // InternalDSL.g:2324:2: 'at'
            {
             before(grammarAccess.getEdgeLiteralAccess().getAtKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getEdgeLiteralAccess().getAtKeyword_1()); 

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
    // $ANTLR end "rule__EdgeLiteral__Group__1__Impl"


    // $ANTLR start "rule__EdgeLiteral__Group__2"
    // InternalDSL.g:2333:1: rule__EdgeLiteral__Group__2 : rule__EdgeLiteral__Group__2__Impl ;
    public final void rule__EdgeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2337:1: ( rule__EdgeLiteral__Group__2__Impl )
            // InternalDSL.g:2338:2: rule__EdgeLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeLiteral__Group__2__Impl();

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
    // $ANTLR end "rule__EdgeLiteral__Group__2"


    // $ANTLR start "rule__EdgeLiteral__Group__2__Impl"
    // InternalDSL.g:2344:1: rule__EdgeLiteral__Group__2__Impl : ( ( rule__EdgeLiteral__EdgeAssignment_2 ) ) ;
    public final void rule__EdgeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2348:1: ( ( ( rule__EdgeLiteral__EdgeAssignment_2 ) ) )
            // InternalDSL.g:2349:1: ( ( rule__EdgeLiteral__EdgeAssignment_2 ) )
            {
            // InternalDSL.g:2349:1: ( ( rule__EdgeLiteral__EdgeAssignment_2 ) )
            // InternalDSL.g:2350:2: ( rule__EdgeLiteral__EdgeAssignment_2 )
            {
             before(grammarAccess.getEdgeLiteralAccess().getEdgeAssignment_2()); 
            // InternalDSL.g:2351:2: ( rule__EdgeLiteral__EdgeAssignment_2 )
            // InternalDSL.g:2351:3: rule__EdgeLiteral__EdgeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeLiteral__EdgeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeLiteralAccess().getEdgeAssignment_2()); 

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
    // $ANTLR end "rule__EdgeLiteral__Group__2__Impl"


    // $ANTLR start "rule__RobotBehavior__BehaviorlistAssignment"
    // InternalDSL.g:2360:1: rule__RobotBehavior__BehaviorlistAssignment : ( ruleBehaviors ) ;
    public final void rule__RobotBehavior__BehaviorlistAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2364:1: ( ( ruleBehaviors ) )
            // InternalDSL.g:2365:2: ( ruleBehaviors )
            {
            // InternalDSL.g:2365:2: ( ruleBehaviors )
            // InternalDSL.g:2366:3: ruleBehaviors
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
    // InternalDSL.g:2375:1: rule__Behaviors__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Behaviors__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2379:1: ( ( RULE_ID ) )
            // InternalDSL.g:2380:2: ( RULE_ID )
            {
            // InternalDSL.g:2380:2: ( RULE_ID )
            // InternalDSL.g:2381:3: RULE_ID
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
    // InternalDSL.g:2390:1: rule__Behaviors__SensorExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Behaviors__SensorExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2394:1: ( ( ruleExpression ) )
            // InternalDSL.g:2395:2: ( ruleExpression )
            {
            // InternalDSL.g:2395:2: ( ruleExpression )
            // InternalDSL.g:2396:3: ruleExpression
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
    // InternalDSL.g:2405:1: rule__Behaviors__ActionlistAssignment_5 : ( ruleActions ) ;
    public final void rule__Behaviors__ActionlistAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2409:1: ( ( ruleActions ) )
            // InternalDSL.g:2410:2: ( ruleActions )
            {
            // InternalDSL.g:2410:2: ( ruleActions )
            // InternalDSL.g:2411:3: ruleActions
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
    // InternalDSL.g:2420:1: rule__LeftMovementAction__LeftmoveAssignment_1 : ( ruleMovementAction ) ;
    public final void rule__LeftMovementAction__LeftmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2424:1: ( ( ruleMovementAction ) )
            // InternalDSL.g:2425:2: ( ruleMovementAction )
            {
            // InternalDSL.g:2425:2: ( ruleMovementAction )
            // InternalDSL.g:2426:3: ruleMovementAction
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
    // InternalDSL.g:2435:1: rule__RightMovementAction__RightmoveAssignment_1 : ( ruleMovementAction ) ;
    public final void rule__RightMovementAction__RightmoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2439:1: ( ( ruleMovementAction ) )
            // InternalDSL.g:2440:2: ( ruleMovementAction )
            {
            // InternalDSL.g:2440:2: ( ruleMovementAction )
            // InternalDSL.g:2441:3: ruleMovementAction
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


    // $ANTLR start "rule__RotateMovementAction__DegreesAssignment_4"
    // InternalDSL.g:2450:1: rule__RotateMovementAction__DegreesAssignment_4 : ( RULE_INT ) ;
    public final void rule__RotateMovementAction__DegreesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2454:1: ( ( RULE_INT ) )
            // InternalDSL.g:2455:2: ( RULE_INT )
            {
            // InternalDSL.g:2455:2: ( RULE_INT )
            // InternalDSL.g:2456:3: RULE_INT
            {
             before(grammarAccess.getRotateMovementActionAccess().getDegreesINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateMovementActionAccess().getDegreesINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__RotateMovementAction__DegreesAssignment_4"


    // $ANTLR start "rule__LeftRotatePoint__LeftdirAssignment_2"
    // InternalDSL.g:2465:1: rule__LeftRotatePoint__LeftdirAssignment_2 : ( ruleFBEnum ) ;
    public final void rule__LeftRotatePoint__LeftdirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2469:1: ( ( ruleFBEnum ) )
            // InternalDSL.g:2470:2: ( ruleFBEnum )
            {
            // InternalDSL.g:2470:2: ( ruleFBEnum )
            // InternalDSL.g:2471:3: ruleFBEnum
            {
             before(grammarAccess.getLeftRotatePointAccess().getLeftdirFBEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFBEnum();

            state._fsp--;

             after(grammarAccess.getLeftRotatePointAccess().getLeftdirFBEnumEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__LeftRotatePoint__LeftdirAssignment_2"


    // $ANTLR start "rule__RightRotatePoint__RightdirAssignment_2"
    // InternalDSL.g:2480:1: rule__RightRotatePoint__RightdirAssignment_2 : ( ruleFBEnum ) ;
    public final void rule__RightRotatePoint__RightdirAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2484:1: ( ( ruleFBEnum ) )
            // InternalDSL.g:2485:2: ( ruleFBEnum )
            {
            // InternalDSL.g:2485:2: ( ruleFBEnum )
            // InternalDSL.g:2486:3: ruleFBEnum
            {
             before(grammarAccess.getRightRotatePointAccess().getRightdirFBEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFBEnum();

            state._fsp--;

             after(grammarAccess.getRightRotatePointAccess().getRightdirFBEnumEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__RightRotatePoint__RightdirAssignment_2"


    // $ANTLR start "rule__MiddleRotatePoint__MiddledirAssignment_3"
    // InternalDSL.g:2495:1: rule__MiddleRotatePoint__MiddledirAssignment_3 : ( ruleLREnum ) ;
    public final void rule__MiddleRotatePoint__MiddledirAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2499:1: ( ( ruleLREnum ) )
            // InternalDSL.g:2500:2: ( ruleLREnum )
            {
            // InternalDSL.g:2500:2: ( ruleLREnum )
            // InternalDSL.g:2501:3: ruleLREnum
            {
             before(grammarAccess.getMiddleRotatePointAccess().getMiddledirLREnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLREnum();

            state._fsp--;

             after(grammarAccess.getMiddleRotatePointAccess().getMiddledirLREnumEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__MiddleRotatePoint__MiddledirAssignment_3"


    // $ANTLR start "rule__MovementAction__ActionenumAssignment"
    // InternalDSL.g:2510:1: rule__MovementAction__ActionenumAssignment : ( ruleActionEnum ) ;
    public final void rule__MovementAction__ActionenumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2514:1: ( ( ruleActionEnum ) )
            // InternalDSL.g:2515:2: ( ruleActionEnum )
            {
            // InternalDSL.g:2515:2: ( ruleActionEnum )
            // InternalDSL.g:2516:3: ruleActionEnum
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
    // InternalDSL.g:2525:1: rule__Expression1__RightAssignment_1_2 : ( ruleExpression2 ) ;
    public final void rule__Expression1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2529:1: ( ( ruleExpression2 ) )
            // InternalDSL.g:2530:2: ( ruleExpression2 )
            {
            // InternalDSL.g:2530:2: ( ruleExpression2 )
            // InternalDSL.g:2531:3: ruleExpression2
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
    // InternalDSL.g:2540:1: rule__Expression2__RightAssignment_1_2 : ( ruleExpression3 ) ;
    public final void rule__Expression2__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2544:1: ( ( ruleExpression3 ) )
            // InternalDSL.g:2545:2: ( ruleExpression3 )
            {
            // InternalDSL.g:2545:2: ( ruleExpression3 )
            // InternalDSL.g:2546:3: ruleExpression3
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
    // InternalDSL.g:2555:1: rule__ExpressionBracket__ExpAssignment_1 : ( ruleExpression ) ;
    public final void rule__ExpressionBracket__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2559:1: ( ( ruleExpression ) )
            // InternalDSL.g:2560:2: ( ruleExpression )
            {
            // InternalDSL.g:2560:2: ( ruleExpression )
            // InternalDSL.g:2561:3: ruleExpression
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


    // $ANTLR start "rule__TouchLiteral__TouchAssignment_0"
    // InternalDSL.g:2570:1: rule__TouchLiteral__TouchAssignment_0 : ( ruleTouchEnum ) ;
    public final void rule__TouchLiteral__TouchAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2574:1: ( ( ruleTouchEnum ) )
            // InternalDSL.g:2575:2: ( ruleTouchEnum )
            {
            // InternalDSL.g:2575:2: ( ruleTouchEnum )
            // InternalDSL.g:2576:3: ruleTouchEnum
            {
             before(grammarAccess.getTouchLiteralAccess().getTouchTouchEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTouchEnum();

            state._fsp--;

             after(grammarAccess.getTouchLiteralAccess().getTouchTouchEnumEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__TouchLiteral__TouchAssignment_0"


    // $ANTLR start "rule__ColorLiteral__ColorAssignment_3"
    // InternalDSL.g:2585:1: rule__ColorLiteral__ColorAssignment_3 : ( ruleColorEnum ) ;
    public final void rule__ColorLiteral__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2589:1: ( ( ruleColorEnum ) )
            // InternalDSL.g:2590:2: ( ruleColorEnum )
            {
            // InternalDSL.g:2590:2: ( ruleColorEnum )
            // InternalDSL.g:2591:3: ruleColorEnum
            {
             before(grammarAccess.getColorLiteralAccess().getColorColorEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColorEnum();

            state._fsp--;

             after(grammarAccess.getColorLiteralAccess().getColorColorEnumEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__ColorLiteral__ColorAssignment_3"


    // $ANTLR start "rule__DistanceLiteral__DistanceAssignment_2"
    // InternalDSL.g:2600:1: rule__DistanceLiteral__DistanceAssignment_2 : ( RULE_INT ) ;
    public final void rule__DistanceLiteral__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2604:1: ( ( RULE_INT ) )
            // InternalDSL.g:2605:2: ( RULE_INT )
            {
            // InternalDSL.g:2605:2: ( RULE_INT )
            // InternalDSL.g:2606:3: RULE_INT
            {
             before(grammarAccess.getDistanceLiteralAccess().getDistanceINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDistanceLiteralAccess().getDistanceINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DistanceLiteral__DistanceAssignment_2"


    // $ANTLR start "rule__EdgeLiteral__EdgeAssignment_2"
    // InternalDSL.g:2615:1: rule__EdgeLiteral__EdgeAssignment_2 : ( ruleEdgeEnum ) ;
    public final void rule__EdgeLiteral__EdgeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2619:1: ( ( ruleEdgeEnum ) )
            // InternalDSL.g:2620:2: ( ruleEdgeEnum )
            {
            // InternalDSL.g:2620:2: ( ruleEdgeEnum )
            // InternalDSL.g:2621:3: ruleEdgeEnum
            {
             before(grammarAccess.getEdgeLiteralAccess().getEdgeEdgeEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEdgeEnum();

            state._fsp--;

             after(grammarAccess.getEdgeLiteralAccess().getEdgeEdgeEnumEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__EdgeLiteral__EdgeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0049200000180000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000001FE00000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000070000L});

}