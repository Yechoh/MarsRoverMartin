package robot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import robot.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Behavior'", "'IF'", "'THEN'", "'END'", "'leftMotor'", "'rightMotor'", "'rotate'", "'around'", "'for'", "'degrees'", "'left'", "'wheel'", "'right'", "'middle'", "'to'", "'the'", "'AND'", "'OR'", "'('", "')'", "'hits'", "'colorFront'", "'sees'", "'color'", "'object'", "'at'", "'cm'", "'edge'", "'forward'", "'backward'", "'stop'", "'frontLeft'", "'frontRight'", "'back'", "'touchFrontLeft'", "'touchFrontRight'", "'NONE'", "'BLACK'", "'BLUE'", "'GREEN'", "'YELLOW'", "'RED'", "'WHITE'", "'BROWN'"
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

        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RobotBehavior";
       	}

       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobotBehavior"
    // InternalDSL.g:65:1: entryRuleRobotBehavior returns [EObject current=null] : iv_ruleRobotBehavior= ruleRobotBehavior EOF ;
    public final EObject entryRuleRobotBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotBehavior = null;


        try {
            // InternalDSL.g:65:54: (iv_ruleRobotBehavior= ruleRobotBehavior EOF )
            // InternalDSL.g:66:2: iv_ruleRobotBehavior= ruleRobotBehavior EOF
            {
             newCompositeNode(grammarAccess.getRobotBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotBehavior=ruleRobotBehavior();

            state._fsp--;

             current =iv_ruleRobotBehavior; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobotBehavior"


    // $ANTLR start "ruleRobotBehavior"
    // InternalDSL.g:72:1: ruleRobotBehavior returns [EObject current=null] : ( (lv_behaviorlist_0_0= ruleBehaviors ) )+ ;
    public final EObject ruleRobotBehavior() throws RecognitionException {
        EObject current = null;

        EObject lv_behaviorlist_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:78:2: ( ( (lv_behaviorlist_0_0= ruleBehaviors ) )+ )
            // InternalDSL.g:79:2: ( (lv_behaviorlist_0_0= ruleBehaviors ) )+
            {
            // InternalDSL.g:79:2: ( (lv_behaviorlist_0_0= ruleBehaviors ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDSL.g:80:3: (lv_behaviorlist_0_0= ruleBehaviors )
            	    {
            	    // InternalDSL.g:80:3: (lv_behaviorlist_0_0= ruleBehaviors )
            	    // InternalDSL.g:81:4: lv_behaviorlist_0_0= ruleBehaviors
            	    {

            	    				newCompositeNode(grammarAccess.getRobotBehaviorAccess().getBehaviorlistBehaviorsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_behaviorlist_0_0=ruleBehaviors();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRobotBehaviorRule());
            	    				}
            	    				add(
            	    					current,
            	    					"behaviorlist",
            	    					lv_behaviorlist_0_0,
            	    					"robot.DSL.Behaviors");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobotBehavior"


    // $ANTLR start "entryRuleBehaviors"
    // InternalDSL.g:101:1: entryRuleBehaviors returns [EObject current=null] : iv_ruleBehaviors= ruleBehaviors EOF ;
    public final EObject entryRuleBehaviors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviors = null;


        try {
            // InternalDSL.g:101:50: (iv_ruleBehaviors= ruleBehaviors EOF )
            // InternalDSL.g:102:2: iv_ruleBehaviors= ruleBehaviors EOF
            {
             newCompositeNode(grammarAccess.getBehaviorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviors=ruleBehaviors();

            state._fsp--;

             current =iv_ruleBehaviors; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviors"


    // $ANTLR start "ruleBehaviors"
    // InternalDSL.g:108:1: ruleBehaviors returns [EObject current=null] : (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'IF' ( (lv_sensorExpression_3_0= ruleExpression ) ) otherlv_4= 'THEN' ( (lv_actionlist_5_0= ruleActions ) )+ otherlv_6= 'END' ) ;
    public final EObject ruleBehaviors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sensorExpression_3_0 = null;

        EObject lv_actionlist_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:114:2: ( (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'IF' ( (lv_sensorExpression_3_0= ruleExpression ) ) otherlv_4= 'THEN' ( (lv_actionlist_5_0= ruleActions ) )+ otherlv_6= 'END' ) )
            // InternalDSL.g:115:2: (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'IF' ( (lv_sensorExpression_3_0= ruleExpression ) ) otherlv_4= 'THEN' ( (lv_actionlist_5_0= ruleActions ) )+ otherlv_6= 'END' )
            {
            // InternalDSL.g:115:2: (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'IF' ( (lv_sensorExpression_3_0= ruleExpression ) ) otherlv_4= 'THEN' ( (lv_actionlist_5_0= ruleActions ) )+ otherlv_6= 'END' )
            // InternalDSL.g:116:3: otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'IF' ( (lv_sensorExpression_3_0= ruleExpression ) ) otherlv_4= 'THEN' ( (lv_actionlist_5_0= ruleActions ) )+ otherlv_6= 'END'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorsAccess().getBehaviorKeyword_0());
            		
            // InternalDSL.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviorsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorsAccess().getIFKeyword_2());
            		
            // InternalDSL.g:142:3: ( (lv_sensorExpression_3_0= ruleExpression ) )
            // InternalDSL.g:143:4: (lv_sensorExpression_3_0= ruleExpression )
            {
            // InternalDSL.g:143:4: (lv_sensorExpression_3_0= ruleExpression )
            // InternalDSL.g:144:5: lv_sensorExpression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBehaviorsAccess().getSensorExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_sensorExpression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorsRule());
            					}
            					set(
            						current,
            						"sensorExpression",
            						lv_sensorExpression_3_0,
            						"robot.DSL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getBehaviorsAccess().getTHENKeyword_4());
            		
            // InternalDSL.g:165:3: ( (lv_actionlist_5_0= ruleActions ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDSL.g:166:4: (lv_actionlist_5_0= ruleActions )
            	    {
            	    // InternalDSL.g:166:4: (lv_actionlist_5_0= ruleActions )
            	    // InternalDSL.g:167:5: lv_actionlist_5_0= ruleActions
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorsAccess().getActionlistActionsParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_actionlist_5_0=ruleActions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actionlist",
            	    						lv_actionlist_5_0,
            	    						"robot.DSL.Actions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBehaviorsAccess().getENDKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviors"


    // $ANTLR start "entryRuleExpression"
    // InternalDSL.g:192:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDSL.g:192:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDSL.g:193:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDSL.g:199:1: ruleExpression returns [EObject current=null] : this_Expression1_0= ruleExpression1 ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:205:2: (this_Expression1_0= ruleExpression1 )
            // InternalDSL.g:206:2: this_Expression1_0= ruleExpression1
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getExpression1ParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Expression1_0=ruleExpression1();

            state._fsp--;


            		current = this_Expression1_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleActions"
    // InternalDSL.g:217:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalDSL.g:217:48: (iv_ruleActions= ruleActions EOF )
            // InternalDSL.g:218:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalDSL.g:224:1: ruleActions returns [EObject current=null] : (this_LeftMovementAction_0= ruleLeftMovementAction | this_RightMovementAction_1= ruleRightMovementAction | this_RotateMovementAction_2= ruleRotateMovementAction ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        EObject this_LeftMovementAction_0 = null;

        EObject this_RightMovementAction_1 = null;

        EObject this_RotateMovementAction_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:230:2: ( (this_LeftMovementAction_0= ruleLeftMovementAction | this_RightMovementAction_1= ruleRightMovementAction | this_RotateMovementAction_2= ruleRotateMovementAction ) )
            // InternalDSL.g:231:2: (this_LeftMovementAction_0= ruleLeftMovementAction | this_RightMovementAction_1= ruleRightMovementAction | this_RotateMovementAction_2= ruleRotateMovementAction )
            {
            // InternalDSL.g:231:2: (this_LeftMovementAction_0= ruleLeftMovementAction | this_RightMovementAction_1= ruleRightMovementAction | this_RotateMovementAction_2= ruleRotateMovementAction )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
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
                    // InternalDSL.g:232:3: this_LeftMovementAction_0= ruleLeftMovementAction
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getLeftMovementActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftMovementAction_0=ruleLeftMovementAction();

                    state._fsp--;


                    			current = this_LeftMovementAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:241:3: this_RightMovementAction_1= ruleRightMovementAction
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getRightMovementActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightMovementAction_1=ruleRightMovementAction();

                    state._fsp--;


                    			current = this_RightMovementAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:250:3: this_RotateMovementAction_2= ruleRotateMovementAction
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getRotateMovementActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateMovementAction_2=ruleRotateMovementAction();

                    state._fsp--;


                    			current = this_RotateMovementAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleLeftMovementAction"
    // InternalDSL.g:262:1: entryRuleLeftMovementAction returns [EObject current=null] : iv_ruleLeftMovementAction= ruleLeftMovementAction EOF ;
    public final EObject entryRuleLeftMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftMovementAction = null;


        try {
            // InternalDSL.g:262:59: (iv_ruleLeftMovementAction= ruleLeftMovementAction EOF )
            // InternalDSL.g:263:2: iv_ruleLeftMovementAction= ruleLeftMovementAction EOF
            {
             newCompositeNode(grammarAccess.getLeftMovementActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftMovementAction=ruleLeftMovementAction();

            state._fsp--;

             current =iv_ruleLeftMovementAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftMovementAction"


    // $ANTLR start "ruleLeftMovementAction"
    // InternalDSL.g:269:1: ruleLeftMovementAction returns [EObject current=null] : (otherlv_0= 'leftMotor' ( (lv_leftmove_1_0= ruleMovementAction ) ) ) ;
    public final EObject ruleLeftMovementAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_leftmove_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:275:2: ( (otherlv_0= 'leftMotor' ( (lv_leftmove_1_0= ruleMovementAction ) ) ) )
            // InternalDSL.g:276:2: (otherlv_0= 'leftMotor' ( (lv_leftmove_1_0= ruleMovementAction ) ) )
            {
            // InternalDSL.g:276:2: (otherlv_0= 'leftMotor' ( (lv_leftmove_1_0= ruleMovementAction ) ) )
            // InternalDSL.g:277:3: otherlv_0= 'leftMotor' ( (lv_leftmove_1_0= ruleMovementAction ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftMovementActionAccess().getLeftMotorKeyword_0());
            		
            // InternalDSL.g:281:3: ( (lv_leftmove_1_0= ruleMovementAction ) )
            // InternalDSL.g:282:4: (lv_leftmove_1_0= ruleMovementAction )
            {
            // InternalDSL.g:282:4: (lv_leftmove_1_0= ruleMovementAction )
            // InternalDSL.g:283:5: lv_leftmove_1_0= ruleMovementAction
            {

            					newCompositeNode(grammarAccess.getLeftMovementActionAccess().getLeftmoveMovementActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_leftmove_1_0=ruleMovementAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftMovementActionRule());
            					}
            					set(
            						current,
            						"leftmove",
            						lv_leftmove_1_0,
            						"robot.DSL.MovementAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftMovementAction"


    // $ANTLR start "entryRuleRightMovementAction"
    // InternalDSL.g:304:1: entryRuleRightMovementAction returns [EObject current=null] : iv_ruleRightMovementAction= ruleRightMovementAction EOF ;
    public final EObject entryRuleRightMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightMovementAction = null;


        try {
            // InternalDSL.g:304:60: (iv_ruleRightMovementAction= ruleRightMovementAction EOF )
            // InternalDSL.g:305:2: iv_ruleRightMovementAction= ruleRightMovementAction EOF
            {
             newCompositeNode(grammarAccess.getRightMovementActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightMovementAction=ruleRightMovementAction();

            state._fsp--;

             current =iv_ruleRightMovementAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightMovementAction"


    // $ANTLR start "ruleRightMovementAction"
    // InternalDSL.g:311:1: ruleRightMovementAction returns [EObject current=null] : (otherlv_0= 'rightMotor' ( (lv_rightmove_1_0= ruleMovementAction ) ) ) ;
    public final EObject ruleRightMovementAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rightmove_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:317:2: ( (otherlv_0= 'rightMotor' ( (lv_rightmove_1_0= ruleMovementAction ) ) ) )
            // InternalDSL.g:318:2: (otherlv_0= 'rightMotor' ( (lv_rightmove_1_0= ruleMovementAction ) ) )
            {
            // InternalDSL.g:318:2: (otherlv_0= 'rightMotor' ( (lv_rightmove_1_0= ruleMovementAction ) ) )
            // InternalDSL.g:319:3: otherlv_0= 'rightMotor' ( (lv_rightmove_1_0= ruleMovementAction ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRightMovementActionAccess().getRightMotorKeyword_0());
            		
            // InternalDSL.g:323:3: ( (lv_rightmove_1_0= ruleMovementAction ) )
            // InternalDSL.g:324:4: (lv_rightmove_1_0= ruleMovementAction )
            {
            // InternalDSL.g:324:4: (lv_rightmove_1_0= ruleMovementAction )
            // InternalDSL.g:325:5: lv_rightmove_1_0= ruleMovementAction
            {

            					newCompositeNode(grammarAccess.getRightMovementActionAccess().getRightmoveMovementActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightmove_1_0=ruleMovementAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightMovementActionRule());
            					}
            					set(
            						current,
            						"rightmove",
            						lv_rightmove_1_0,
            						"robot.DSL.MovementAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightMovementAction"


    // $ANTLR start "entryRuleRotateMovementAction"
    // InternalDSL.g:346:1: entryRuleRotateMovementAction returns [EObject current=null] : iv_ruleRotateMovementAction= ruleRotateMovementAction EOF ;
    public final EObject entryRuleRotateMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateMovementAction = null;


        try {
            // InternalDSL.g:346:61: (iv_ruleRotateMovementAction= ruleRotateMovementAction EOF )
            // InternalDSL.g:347:2: iv_ruleRotateMovementAction= ruleRotateMovementAction EOF
            {
             newCompositeNode(grammarAccess.getRotateMovementActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateMovementAction=ruleRotateMovementAction();

            state._fsp--;

             current =iv_ruleRotateMovementAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotateMovementAction"


    // $ANTLR start "ruleRotateMovementAction"
    // InternalDSL.g:353:1: ruleRotateMovementAction returns [EObject current=null] : (otherlv_0= 'rotate' otherlv_1= 'around' this_RotatePoints_2= ruleRotatePoints otherlv_3= 'for' ( (lv_degrees_4_0= RULE_INT ) ) otherlv_5= 'degrees' ) ;
    public final EObject ruleRotateMovementAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_degrees_4_0=null;
        Token otherlv_5=null;
        EObject this_RotatePoints_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:359:2: ( (otherlv_0= 'rotate' otherlv_1= 'around' this_RotatePoints_2= ruleRotatePoints otherlv_3= 'for' ( (lv_degrees_4_0= RULE_INT ) ) otherlv_5= 'degrees' ) )
            // InternalDSL.g:360:2: (otherlv_0= 'rotate' otherlv_1= 'around' this_RotatePoints_2= ruleRotatePoints otherlv_3= 'for' ( (lv_degrees_4_0= RULE_INT ) ) otherlv_5= 'degrees' )
            {
            // InternalDSL.g:360:2: (otherlv_0= 'rotate' otherlv_1= 'around' this_RotatePoints_2= ruleRotatePoints otherlv_3= 'for' ( (lv_degrees_4_0= RULE_INT ) ) otherlv_5= 'degrees' )
            // InternalDSL.g:361:3: otherlv_0= 'rotate' otherlv_1= 'around' this_RotatePoints_2= ruleRotatePoints otherlv_3= 'for' ( (lv_degrees_4_0= RULE_INT ) ) otherlv_5= 'degrees'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateMovementActionAccess().getAroundKeyword_1());
            		

            			newCompositeNode(grammarAccess.getRotateMovementActionAccess().getRotatePointsParserRuleCall_2());
            		
            pushFollow(FOLLOW_13);
            this_RotatePoints_2=ruleRotatePoints();

            state._fsp--;


            			current = this_RotatePoints_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateMovementActionAccess().getForKeyword_3());
            		
            // InternalDSL.g:381:3: ( (lv_degrees_4_0= RULE_INT ) )
            // InternalDSL.g:382:4: (lv_degrees_4_0= RULE_INT )
            {
            // InternalDSL.g:382:4: (lv_degrees_4_0= RULE_INT )
            // InternalDSL.g:383:5: lv_degrees_4_0= RULE_INT
            {
            lv_degrees_4_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_degrees_4_0, grammarAccess.getRotateMovementActionAccess().getDegreesINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateMovementActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"degrees",
            						lv_degrees_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateMovementActionAccess().getDegreesKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotateMovementAction"


    // $ANTLR start "entryRuleRotatePoints"
    // InternalDSL.g:407:1: entryRuleRotatePoints returns [EObject current=null] : iv_ruleRotatePoints= ruleRotatePoints EOF ;
    public final EObject entryRuleRotatePoints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotatePoints = null;


        try {
            // InternalDSL.g:407:53: (iv_ruleRotatePoints= ruleRotatePoints EOF )
            // InternalDSL.g:408:2: iv_ruleRotatePoints= ruleRotatePoints EOF
            {
             newCompositeNode(grammarAccess.getRotatePointsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotatePoints=ruleRotatePoints();

            state._fsp--;

             current =iv_ruleRotatePoints; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotatePoints"


    // $ANTLR start "ruleRotatePoints"
    // InternalDSL.g:414:1: ruleRotatePoints returns [EObject current=null] : (this_LeftRotatePoint_0= ruleLeftRotatePoint | this_RightRotatePoint_1= ruleRightRotatePoint | this_MiddleRotatePoint_2= ruleMiddleRotatePoint ) ;
    public final EObject ruleRotatePoints() throws RecognitionException {
        EObject current = null;

        EObject this_LeftRotatePoint_0 = null;

        EObject this_RightRotatePoint_1 = null;

        EObject this_MiddleRotatePoint_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:420:2: ( (this_LeftRotatePoint_0= ruleLeftRotatePoint | this_RightRotatePoint_1= ruleRightRotatePoint | this_MiddleRotatePoint_2= ruleMiddleRotatePoint ) )
            // InternalDSL.g:421:2: (this_LeftRotatePoint_0= ruleLeftRotatePoint | this_RightRotatePoint_1= ruleRightRotatePoint | this_MiddleRotatePoint_2= ruleMiddleRotatePoint )
            {
            // InternalDSL.g:421:2: (this_LeftRotatePoint_0= ruleLeftRotatePoint | this_RightRotatePoint_1= ruleRightRotatePoint | this_MiddleRotatePoint_2= ruleMiddleRotatePoint )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDSL.g:422:3: this_LeftRotatePoint_0= ruleLeftRotatePoint
                    {

                    			newCompositeNode(grammarAccess.getRotatePointsAccess().getLeftRotatePointParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftRotatePoint_0=ruleLeftRotatePoint();

                    state._fsp--;


                    			current = this_LeftRotatePoint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:431:3: this_RightRotatePoint_1= ruleRightRotatePoint
                    {

                    			newCompositeNode(grammarAccess.getRotatePointsAccess().getRightRotatePointParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightRotatePoint_1=ruleRightRotatePoint();

                    state._fsp--;


                    			current = this_RightRotatePoint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:440:3: this_MiddleRotatePoint_2= ruleMiddleRotatePoint
                    {

                    			newCompositeNode(grammarAccess.getRotatePointsAccess().getMiddleRotatePointParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MiddleRotatePoint_2=ruleMiddleRotatePoint();

                    state._fsp--;


                    			current = this_MiddleRotatePoint_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotatePoints"


    // $ANTLR start "entryRuleLeftRotatePoint"
    // InternalDSL.g:452:1: entryRuleLeftRotatePoint returns [EObject current=null] : iv_ruleLeftRotatePoint= ruleLeftRotatePoint EOF ;
    public final EObject entryRuleLeftRotatePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftRotatePoint = null;


        try {
            // InternalDSL.g:452:56: (iv_ruleLeftRotatePoint= ruleLeftRotatePoint EOF )
            // InternalDSL.g:453:2: iv_ruleLeftRotatePoint= ruleLeftRotatePoint EOF
            {
             newCompositeNode(grammarAccess.getLeftRotatePointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftRotatePoint=ruleLeftRotatePoint();

            state._fsp--;

             current =iv_ruleLeftRotatePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftRotatePoint"


    // $ANTLR start "ruleLeftRotatePoint"
    // InternalDSL.g:459:1: ruleLeftRotatePoint returns [EObject current=null] : (otherlv_0= 'left' otherlv_1= 'wheel' ( (lv_leftdir_2_0= ruleFBEnum ) ) ) ;
    public final EObject ruleLeftRotatePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_leftdir_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:465:2: ( (otherlv_0= 'left' otherlv_1= 'wheel' ( (lv_leftdir_2_0= ruleFBEnum ) ) ) )
            // InternalDSL.g:466:2: (otherlv_0= 'left' otherlv_1= 'wheel' ( (lv_leftdir_2_0= ruleFBEnum ) ) )
            {
            // InternalDSL.g:466:2: (otherlv_0= 'left' otherlv_1= 'wheel' ( (lv_leftdir_2_0= ruleFBEnum ) ) )
            // InternalDSL.g:467:3: otherlv_0= 'left' otherlv_1= 'wheel' ( (lv_leftdir_2_0= ruleFBEnum ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftRotatePointAccess().getLeftKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftRotatePointAccess().getWheelKeyword_1());
            		
            // InternalDSL.g:475:3: ( (lv_leftdir_2_0= ruleFBEnum ) )
            // InternalDSL.g:476:4: (lv_leftdir_2_0= ruleFBEnum )
            {
            // InternalDSL.g:476:4: (lv_leftdir_2_0= ruleFBEnum )
            // InternalDSL.g:477:5: lv_leftdir_2_0= ruleFBEnum
            {

            					newCompositeNode(grammarAccess.getLeftRotatePointAccess().getLeftdirFBEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_leftdir_2_0=ruleFBEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftRotatePointRule());
            					}
            					set(
            						current,
            						"leftdir",
            						lv_leftdir_2_0,
            						"robot.DSL.FBEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftRotatePoint"


    // $ANTLR start "entryRuleRightRotatePoint"
    // InternalDSL.g:498:1: entryRuleRightRotatePoint returns [EObject current=null] : iv_ruleRightRotatePoint= ruleRightRotatePoint EOF ;
    public final EObject entryRuleRightRotatePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightRotatePoint = null;


        try {
            // InternalDSL.g:498:57: (iv_ruleRightRotatePoint= ruleRightRotatePoint EOF )
            // InternalDSL.g:499:2: iv_ruleRightRotatePoint= ruleRightRotatePoint EOF
            {
             newCompositeNode(grammarAccess.getRightRotatePointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightRotatePoint=ruleRightRotatePoint();

            state._fsp--;

             current =iv_ruleRightRotatePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightRotatePoint"


    // $ANTLR start "ruleRightRotatePoint"
    // InternalDSL.g:505:1: ruleRightRotatePoint returns [EObject current=null] : (otherlv_0= 'right' otherlv_1= 'wheel' ( (lv_rightdir_2_0= ruleFBEnum ) ) ) ;
    public final EObject ruleRightRotatePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_rightdir_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:511:2: ( (otherlv_0= 'right' otherlv_1= 'wheel' ( (lv_rightdir_2_0= ruleFBEnum ) ) ) )
            // InternalDSL.g:512:2: (otherlv_0= 'right' otherlv_1= 'wheel' ( (lv_rightdir_2_0= ruleFBEnum ) ) )
            {
            // InternalDSL.g:512:2: (otherlv_0= 'right' otherlv_1= 'wheel' ( (lv_rightdir_2_0= ruleFBEnum ) ) )
            // InternalDSL.g:513:3: otherlv_0= 'right' otherlv_1= 'wheel' ( (lv_rightdir_2_0= ruleFBEnum ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRightRotatePointAccess().getRightKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRightRotatePointAccess().getWheelKeyword_1());
            		
            // InternalDSL.g:521:3: ( (lv_rightdir_2_0= ruleFBEnum ) )
            // InternalDSL.g:522:4: (lv_rightdir_2_0= ruleFBEnum )
            {
            // InternalDSL.g:522:4: (lv_rightdir_2_0= ruleFBEnum )
            // InternalDSL.g:523:5: lv_rightdir_2_0= ruleFBEnum
            {

            					newCompositeNode(grammarAccess.getRightRotatePointAccess().getRightdirFBEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightdir_2_0=ruleFBEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightRotatePointRule());
            					}
            					set(
            						current,
            						"rightdir",
            						lv_rightdir_2_0,
            						"robot.DSL.FBEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightRotatePoint"


    // $ANTLR start "entryRuleMiddleRotatePoint"
    // InternalDSL.g:544:1: entryRuleMiddleRotatePoint returns [EObject current=null] : iv_ruleMiddleRotatePoint= ruleMiddleRotatePoint EOF ;
    public final EObject entryRuleMiddleRotatePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddleRotatePoint = null;


        try {
            // InternalDSL.g:544:58: (iv_ruleMiddleRotatePoint= ruleMiddleRotatePoint EOF )
            // InternalDSL.g:545:2: iv_ruleMiddleRotatePoint= ruleMiddleRotatePoint EOF
            {
             newCompositeNode(grammarAccess.getMiddleRotatePointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMiddleRotatePoint=ruleMiddleRotatePoint();

            state._fsp--;

             current =iv_ruleMiddleRotatePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMiddleRotatePoint"


    // $ANTLR start "ruleMiddleRotatePoint"
    // InternalDSL.g:551:1: ruleMiddleRotatePoint returns [EObject current=null] : (otherlv_0= 'middle' otherlv_1= 'to' otherlv_2= 'the' ( (lv_middledir_3_0= ruleLREnum ) ) ) ;
    public final EObject ruleMiddleRotatePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_middledir_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:557:2: ( (otherlv_0= 'middle' otherlv_1= 'to' otherlv_2= 'the' ( (lv_middledir_3_0= ruleLREnum ) ) ) )
            // InternalDSL.g:558:2: (otherlv_0= 'middle' otherlv_1= 'to' otherlv_2= 'the' ( (lv_middledir_3_0= ruleLREnum ) ) )
            {
            // InternalDSL.g:558:2: (otherlv_0= 'middle' otherlv_1= 'to' otherlv_2= 'the' ( (lv_middledir_3_0= ruleLREnum ) ) )
            // InternalDSL.g:559:3: otherlv_0= 'middle' otherlv_1= 'to' otherlv_2= 'the' ( (lv_middledir_3_0= ruleLREnum ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getMiddleRotatePointAccess().getMiddleKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMiddleRotatePointAccess().getToKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMiddleRotatePointAccess().getTheKeyword_2());
            		
            // InternalDSL.g:571:3: ( (lv_middledir_3_0= ruleLREnum ) )
            // InternalDSL.g:572:4: (lv_middledir_3_0= ruleLREnum )
            {
            // InternalDSL.g:572:4: (lv_middledir_3_0= ruleLREnum )
            // InternalDSL.g:573:5: lv_middledir_3_0= ruleLREnum
            {

            					newCompositeNode(grammarAccess.getMiddleRotatePointAccess().getMiddledirLREnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_middledir_3_0=ruleLREnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMiddleRotatePointRule());
            					}
            					set(
            						current,
            						"middledir",
            						lv_middledir_3_0,
            						"robot.DSL.LREnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMiddleRotatePoint"


    // $ANTLR start "entryRuleMovementAction"
    // InternalDSL.g:594:1: entryRuleMovementAction returns [EObject current=null] : iv_ruleMovementAction= ruleMovementAction EOF ;
    public final EObject entryRuleMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovementAction = null;


        try {
            // InternalDSL.g:594:55: (iv_ruleMovementAction= ruleMovementAction EOF )
            // InternalDSL.g:595:2: iv_ruleMovementAction= ruleMovementAction EOF
            {
             newCompositeNode(grammarAccess.getMovementActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovementAction=ruleMovementAction();

            state._fsp--;

             current =iv_ruleMovementAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMovementAction"


    // $ANTLR start "ruleMovementAction"
    // InternalDSL.g:601:1: ruleMovementAction returns [EObject current=null] : ( (lv_actionenum_0_0= ruleActionEnum ) ) ;
    public final EObject ruleMovementAction() throws RecognitionException {
        EObject current = null;

        Enumerator lv_actionenum_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:607:2: ( ( (lv_actionenum_0_0= ruleActionEnum ) ) )
            // InternalDSL.g:608:2: ( (lv_actionenum_0_0= ruleActionEnum ) )
            {
            // InternalDSL.g:608:2: ( (lv_actionenum_0_0= ruleActionEnum ) )
            // InternalDSL.g:609:3: (lv_actionenum_0_0= ruleActionEnum )
            {
            // InternalDSL.g:609:3: (lv_actionenum_0_0= ruleActionEnum )
            // InternalDSL.g:610:4: lv_actionenum_0_0= ruleActionEnum
            {

            				newCompositeNode(grammarAccess.getMovementActionAccess().getActionenumActionEnumEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_actionenum_0_0=ruleActionEnum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMovementActionRule());
            				}
            				set(
            					current,
            					"actionenum",
            					lv_actionenum_0_0,
            					"robot.DSL.ActionEnum");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMovementAction"


    // $ANTLR start "entryRuleExpression1"
    // InternalDSL.g:630:1: entryRuleExpression1 returns [EObject current=null] : iv_ruleExpression1= ruleExpression1 EOF ;
    public final EObject entryRuleExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1 = null;


        try {
            // InternalDSL.g:630:52: (iv_ruleExpression1= ruleExpression1 EOF )
            // InternalDSL.g:631:2: iv_ruleExpression1= ruleExpression1 EOF
            {
             newCompositeNode(grammarAccess.getExpression1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression1=ruleExpression1();

            state._fsp--;

             current =iv_ruleExpression1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression1"


    // $ANTLR start "ruleExpression1"
    // InternalDSL.g:637:1: ruleExpression1 returns [EObject current=null] : (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* ) ;
    public final EObject ruleExpression1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:643:2: ( (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* ) )
            // InternalDSL.g:644:2: (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* )
            {
            // InternalDSL.g:644:2: (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* )
            // InternalDSL.g:645:3: this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression1Access().getExpression2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Expression2_0=ruleExpression2();

            state._fsp--;


            			current = this_Expression2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSL.g:653:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:654:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) )
            	    {
            	    // InternalDSL.g:654:4: ()
            	    // InternalDSL.g:655:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression1Access().getANDKeyword_1_1());
            	    			
            	    // InternalDSL.g:665:4: ( (lv_right_3_0= ruleExpression2 ) )
            	    // InternalDSL.g:666:5: (lv_right_3_0= ruleExpression2 )
            	    {
            	    // InternalDSL.g:666:5: (lv_right_3_0= ruleExpression2 )
            	    // InternalDSL.g:667:6: lv_right_3_0= ruleExpression2
            	    {

            	    						newCompositeNode(grammarAccess.getExpression1Access().getRightExpression2ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleExpression2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression1Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"robot.DSL.Expression2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression1"


    // $ANTLR start "entryRuleExpression2"
    // InternalDSL.g:689:1: entryRuleExpression2 returns [EObject current=null] : iv_ruleExpression2= ruleExpression2 EOF ;
    public final EObject entryRuleExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression2 = null;


        try {
            // InternalDSL.g:689:52: (iv_ruleExpression2= ruleExpression2 EOF )
            // InternalDSL.g:690:2: iv_ruleExpression2= ruleExpression2 EOF
            {
             newCompositeNode(grammarAccess.getExpression2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression2=ruleExpression2();

            state._fsp--;

             current =iv_ruleExpression2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression2"


    // $ANTLR start "ruleExpression2"
    // InternalDSL.g:696:1: ruleExpression2 returns [EObject current=null] : (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* ) ;
    public final EObject ruleExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression3_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:702:2: ( (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* ) )
            // InternalDSL.g:703:2: (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* )
            {
            // InternalDSL.g:703:2: (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* )
            // InternalDSL.g:704:3: this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression2Access().getExpression3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Expression3_0=ruleExpression3();

            state._fsp--;


            			current = this_Expression3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSL.g:712:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:713:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) )
            	    {
            	    // InternalDSL.g:713:4: ()
            	    // InternalDSL.g:714:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression2Access().getORKeyword_1_1());
            	    			
            	    // InternalDSL.g:724:4: ( (lv_right_3_0= ruleExpression3 ) )
            	    // InternalDSL.g:725:5: (lv_right_3_0= ruleExpression3 )
            	    {
            	    // InternalDSL.g:725:5: (lv_right_3_0= ruleExpression3 )
            	    // InternalDSL.g:726:6: lv_right_3_0= ruleExpression3
            	    {

            	    						newCompositeNode(grammarAccess.getExpression2Access().getRightExpression3ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleExpression3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression2Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"robot.DSL.Expression3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression2"


    // $ANTLR start "entryRuleExpression3"
    // InternalDSL.g:748:1: entryRuleExpression3 returns [EObject current=null] : iv_ruleExpression3= ruleExpression3 EOF ;
    public final EObject entryRuleExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression3 = null;


        try {
            // InternalDSL.g:748:52: (iv_ruleExpression3= ruleExpression3 EOF )
            // InternalDSL.g:749:2: iv_ruleExpression3= ruleExpression3 EOF
            {
             newCompositeNode(grammarAccess.getExpression3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression3=ruleExpression3();

            state._fsp--;

             current =iv_ruleExpression3; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression3"


    // $ANTLR start "ruleExpression3"
    // InternalDSL.g:755:1: ruleExpression3 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral | this_EdgeLiteral_4= ruleEdgeLiteral ) ;
    public final EObject ruleExpression3() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBracket_0 = null;

        EObject this_TouchLiteral_1 = null;

        EObject this_ColorLiteral_2 = null;

        EObject this_DistanceLiteral_3 = null;

        EObject this_EdgeLiteral_4 = null;



        	enterRule();

        try {
            // InternalDSL.g:761:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral | this_EdgeLiteral_4= ruleEdgeLiteral ) )
            // InternalDSL.g:762:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral | this_EdgeLiteral_4= ruleEdgeLiteral )
            {
            // InternalDSL.g:762:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral | this_EdgeLiteral_4= ruleEdgeLiteral )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 45:
            case 46:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            case 35:
                {
                alt7=4;
                }
                break;
            case 38:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:763:3: this_ExpressionBracket_0= ruleExpressionBracket
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getExpressionBracketParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionBracket_0=ruleExpressionBracket();

                    state._fsp--;


                    			current = this_ExpressionBracket_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:772:3: this_TouchLiteral_1= ruleTouchLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getTouchLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TouchLiteral_1=ruleTouchLiteral();

                    state._fsp--;


                    			current = this_TouchLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:781:3: this_ColorLiteral_2= ruleColorLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getColorLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColorLiteral_2=ruleColorLiteral();

                    state._fsp--;


                    			current = this_ColorLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDSL.g:790:3: this_DistanceLiteral_3= ruleDistanceLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getDistanceLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistanceLiteral_3=ruleDistanceLiteral();

                    state._fsp--;


                    			current = this_DistanceLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDSL.g:799:3: this_EdgeLiteral_4= ruleEdgeLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getEdgeLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EdgeLiteral_4=ruleEdgeLiteral();

                    state._fsp--;


                    			current = this_EdgeLiteral_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression3"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalDSL.g:811:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalDSL.g:811:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalDSL.g:812:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
            {
             newCompositeNode(grammarAccess.getExpressionBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBracket=ruleExpressionBracket();

            state._fsp--;

             current =iv_ruleExpressionBracket; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalDSL.g:818:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:824:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalDSL.g:825:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalDSL.g:825:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalDSL.g:826:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDSL.g:830:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalDSL.g:831:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalDSL.g:831:4: (lv_exp_1_0= ruleExpression )
            // InternalDSL.g:832:5: lv_exp_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionBracketAccess().getExpExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_exp_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionBracketRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"robot.DSL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleTouchLiteral"
    // InternalDSL.g:857:1: entryRuleTouchLiteral returns [EObject current=null] : iv_ruleTouchLiteral= ruleTouchLiteral EOF ;
    public final EObject entryRuleTouchLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchLiteral = null;


        try {
            // InternalDSL.g:857:53: (iv_ruleTouchLiteral= ruleTouchLiteral EOF )
            // InternalDSL.g:858:2: iv_ruleTouchLiteral= ruleTouchLiteral EOF
            {
             newCompositeNode(grammarAccess.getTouchLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTouchLiteral=ruleTouchLiteral();

            state._fsp--;

             current =iv_ruleTouchLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTouchLiteral"


    // $ANTLR start "ruleTouchLiteral"
    // InternalDSL.g:864:1: ruleTouchLiteral returns [EObject current=null] : ( ( (lv_touch_0_0= ruleTouchEnum ) ) otherlv_1= 'hits' ) ;
    public final EObject ruleTouchLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_touch_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:870:2: ( ( ( (lv_touch_0_0= ruleTouchEnum ) ) otherlv_1= 'hits' ) )
            // InternalDSL.g:871:2: ( ( (lv_touch_0_0= ruleTouchEnum ) ) otherlv_1= 'hits' )
            {
            // InternalDSL.g:871:2: ( ( (lv_touch_0_0= ruleTouchEnum ) ) otherlv_1= 'hits' )
            // InternalDSL.g:872:3: ( (lv_touch_0_0= ruleTouchEnum ) ) otherlv_1= 'hits'
            {
            // InternalDSL.g:872:3: ( (lv_touch_0_0= ruleTouchEnum ) )
            // InternalDSL.g:873:4: (lv_touch_0_0= ruleTouchEnum )
            {
            // InternalDSL.g:873:4: (lv_touch_0_0= ruleTouchEnum )
            // InternalDSL.g:874:5: lv_touch_0_0= ruleTouchEnum
            {

            					newCompositeNode(grammarAccess.getTouchLiteralAccess().getTouchTouchEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_touch_0_0=ruleTouchEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTouchLiteralRule());
            					}
            					set(
            						current,
            						"touch",
            						lv_touch_0_0,
            						"robot.DSL.TouchEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTouchLiteralAccess().getHitsKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTouchLiteral"


    // $ANTLR start "entryRuleColorLiteral"
    // InternalDSL.g:899:1: entryRuleColorLiteral returns [EObject current=null] : iv_ruleColorLiteral= ruleColorLiteral EOF ;
    public final EObject entryRuleColorLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorLiteral = null;


        try {
            // InternalDSL.g:899:53: (iv_ruleColorLiteral= ruleColorLiteral EOF )
            // InternalDSL.g:900:2: iv_ruleColorLiteral= ruleColorLiteral EOF
            {
             newCompositeNode(grammarAccess.getColorLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorLiteral=ruleColorLiteral();

            state._fsp--;

             current =iv_ruleColorLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorLiteral"


    // $ANTLR start "ruleColorLiteral"
    // InternalDSL.g:906:1: ruleColorLiteral returns [EObject current=null] : (otherlv_0= 'colorFront' otherlv_1= 'sees' otherlv_2= 'color' ( (lv_color_3_0= ruleColorEnum ) ) ) ;
    public final EObject ruleColorLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_color_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:912:2: ( (otherlv_0= 'colorFront' otherlv_1= 'sees' otherlv_2= 'color' ( (lv_color_3_0= ruleColorEnum ) ) ) )
            // InternalDSL.g:913:2: (otherlv_0= 'colorFront' otherlv_1= 'sees' otherlv_2= 'color' ( (lv_color_3_0= ruleColorEnum ) ) )
            {
            // InternalDSL.g:913:2: (otherlv_0= 'colorFront' otherlv_1= 'sees' otherlv_2= 'color' ( (lv_color_3_0= ruleColorEnum ) ) )
            // InternalDSL.g:914:3: otherlv_0= 'colorFront' otherlv_1= 'sees' otherlv_2= 'color' ( (lv_color_3_0= ruleColorEnum ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getColorLiteralAccess().getColorFrontKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getColorLiteralAccess().getSeesKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getColorLiteralAccess().getColorKeyword_2());
            		
            // InternalDSL.g:926:3: ( (lv_color_3_0= ruleColorEnum ) )
            // InternalDSL.g:927:4: (lv_color_3_0= ruleColorEnum )
            {
            // InternalDSL.g:927:4: (lv_color_3_0= ruleColorEnum )
            // InternalDSL.g:928:5: lv_color_3_0= ruleColorEnum
            {

            					newCompositeNode(grammarAccess.getColorLiteralAccess().getColorColorEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_3_0=ruleColorEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorLiteralRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_3_0,
            						"robot.DSL.ColorEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorLiteral"


    // $ANTLR start "entryRuleDistanceLiteral"
    // InternalDSL.g:949:1: entryRuleDistanceLiteral returns [EObject current=null] : iv_ruleDistanceLiteral= ruleDistanceLiteral EOF ;
    public final EObject entryRuleDistanceLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceLiteral = null;


        try {
            // InternalDSL.g:949:56: (iv_ruleDistanceLiteral= ruleDistanceLiteral EOF )
            // InternalDSL.g:950:2: iv_ruleDistanceLiteral= ruleDistanceLiteral EOF
            {
             newCompositeNode(grammarAccess.getDistanceLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistanceLiteral=ruleDistanceLiteral();

            state._fsp--;

             current =iv_ruleDistanceLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistanceLiteral"


    // $ANTLR start "ruleDistanceLiteral"
    // InternalDSL.g:956:1: ruleDistanceLiteral returns [EObject current=null] : (otherlv_0= 'object' otherlv_1= 'at' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' ) ;
    public final EObject ruleDistanceLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_distance_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:962:2: ( (otherlv_0= 'object' otherlv_1= 'at' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' ) )
            // InternalDSL.g:963:2: (otherlv_0= 'object' otherlv_1= 'at' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' )
            {
            // InternalDSL.g:963:2: (otherlv_0= 'object' otherlv_1= 'at' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm' )
            // InternalDSL.g:964:3: otherlv_0= 'object' otherlv_1= 'at' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= 'cm'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getDistanceLiteralAccess().getObjectKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceLiteralAccess().getAtKeyword_1());
            		
            // InternalDSL.g:972:3: ( (lv_distance_2_0= RULE_INT ) )
            // InternalDSL.g:973:4: (lv_distance_2_0= RULE_INT )
            {
            // InternalDSL.g:973:4: (lv_distance_2_0= RULE_INT )
            // InternalDSL.g:974:5: lv_distance_2_0= RULE_INT
            {
            lv_distance_2_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_distance_2_0, grammarAccess.getDistanceLiteralAccess().getDistanceINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDistanceLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDistanceLiteralAccess().getCmKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistanceLiteral"


    // $ANTLR start "entryRuleEdgeLiteral"
    // InternalDSL.g:998:1: entryRuleEdgeLiteral returns [EObject current=null] : iv_ruleEdgeLiteral= ruleEdgeLiteral EOF ;
    public final EObject entryRuleEdgeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeLiteral = null;


        try {
            // InternalDSL.g:998:52: (iv_ruleEdgeLiteral= ruleEdgeLiteral EOF )
            // InternalDSL.g:999:2: iv_ruleEdgeLiteral= ruleEdgeLiteral EOF
            {
             newCompositeNode(grammarAccess.getEdgeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdgeLiteral=ruleEdgeLiteral();

            state._fsp--;

             current =iv_ruleEdgeLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeLiteral"


    // $ANTLR start "ruleEdgeLiteral"
    // InternalDSL.g:1005:1: ruleEdgeLiteral returns [EObject current=null] : (otherlv_0= 'edge' otherlv_1= 'at' ( (lv_edge_2_0= ruleEdgeEnum ) ) ) ;
    public final EObject ruleEdgeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_edge_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1011:2: ( (otherlv_0= 'edge' otherlv_1= 'at' ( (lv_edge_2_0= ruleEdgeEnum ) ) ) )
            // InternalDSL.g:1012:2: (otherlv_0= 'edge' otherlv_1= 'at' ( (lv_edge_2_0= ruleEdgeEnum ) ) )
            {
            // InternalDSL.g:1012:2: (otherlv_0= 'edge' otherlv_1= 'at' ( (lv_edge_2_0= ruleEdgeEnum ) ) )
            // InternalDSL.g:1013:3: otherlv_0= 'edge' otherlv_1= 'at' ( (lv_edge_2_0= ruleEdgeEnum ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getEdgeLiteralAccess().getEdgeKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getEdgeLiteralAccess().getAtKeyword_1());
            		
            // InternalDSL.g:1021:3: ( (lv_edge_2_0= ruleEdgeEnum ) )
            // InternalDSL.g:1022:4: (lv_edge_2_0= ruleEdgeEnum )
            {
            // InternalDSL.g:1022:4: (lv_edge_2_0= ruleEdgeEnum )
            // InternalDSL.g:1023:5: lv_edge_2_0= ruleEdgeEnum
            {

            					newCompositeNode(grammarAccess.getEdgeLiteralAccess().getEdgeEdgeEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_edge_2_0=ruleEdgeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEdgeLiteralRule());
            					}
            					set(
            						current,
            						"edge",
            						lv_edge_2_0,
            						"robot.DSL.EdgeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeLiteral"


    // $ANTLR start "ruleLREnum"
    // InternalDSL.g:1044:1: ruleLREnum returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleLREnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1050:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalDSL.g:1051:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalDSL.g:1051:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSL.g:1052:3: (enumLiteral_0= 'left' )
                    {
                    // InternalDSL.g:1052:3: (enumLiteral_0= 'left' )
                    // InternalDSL.g:1053:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLREnumAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1060:3: (enumLiteral_1= 'right' )
                    {
                    // InternalDSL.g:1060:3: (enumLiteral_1= 'right' )
                    // InternalDSL.g:1061:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLREnumAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLREnum"


    // $ANTLR start "ruleFBEnum"
    // InternalDSL.g:1071:1: ruleFBEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) ;
    public final Enumerator ruleFBEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1077:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) )
            // InternalDSL.g:1078:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            {
            // InternalDSL.g:1078:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            else if ( (LA9_0==40) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:1079:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalDSL.g:1079:3: (enumLiteral_0= 'forward' )
                    // InternalDSL.g:1080:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFBEnumAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1087:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalDSL.g:1087:3: (enumLiteral_1= 'backward' )
                    // InternalDSL.g:1088:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFBEnumAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFBEnum"


    // $ANTLR start "ruleActionEnum"
    // InternalDSL.g:1098:1: ruleActionEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) ) ;
    public final Enumerator ruleActionEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:1104:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) ) )
            // InternalDSL.g:1105:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) )
            {
            // InternalDSL.g:1105:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 40:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1106:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalDSL.g:1106:3: (enumLiteral_0= 'forward' )
                    // InternalDSL.g:1107:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1114:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalDSL.g:1114:3: (enumLiteral_1= 'backward' )
                    // InternalDSL.g:1115:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1122:3: (enumLiteral_2= 'stop' )
                    {
                    // InternalDSL.g:1122:3: (enumLiteral_2= 'stop' )
                    // InternalDSL.g:1123:4: enumLiteral_2= 'stop'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionEnumAccess().getSTOPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionEnum"


    // $ANTLR start "ruleEdgeEnum"
    // InternalDSL.g:1133:1: ruleEdgeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'frontLeft' ) | (enumLiteral_1= 'frontRight' ) | (enumLiteral_2= 'back' ) ) ;
    public final Enumerator ruleEdgeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:1139:2: ( ( (enumLiteral_0= 'frontLeft' ) | (enumLiteral_1= 'frontRight' ) | (enumLiteral_2= 'back' ) ) )
            // InternalDSL.g:1140:2: ( (enumLiteral_0= 'frontLeft' ) | (enumLiteral_1= 'frontRight' ) | (enumLiteral_2= 'back' ) )
            {
            // InternalDSL.g:1140:2: ( (enumLiteral_0= 'frontLeft' ) | (enumLiteral_1= 'frontRight' ) | (enumLiteral_2= 'back' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt11=1;
                }
                break;
            case 43:
                {
                alt11=2;
                }
                break;
            case 44:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1141:3: (enumLiteral_0= 'frontLeft' )
                    {
                    // InternalDSL.g:1141:3: (enumLiteral_0= 'frontLeft' )
                    // InternalDSL.g:1142:4: enumLiteral_0= 'frontLeft'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEdgeEnumAccess().getFRONTLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1149:3: (enumLiteral_1= 'frontRight' )
                    {
                    // InternalDSL.g:1149:3: (enumLiteral_1= 'frontRight' )
                    // InternalDSL.g:1150:4: enumLiteral_1= 'frontRight'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEdgeEnumAccess().getFRONTRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1157:3: (enumLiteral_2= 'back' )
                    {
                    // InternalDSL.g:1157:3: (enumLiteral_2= 'back' )
                    // InternalDSL.g:1158:4: enumLiteral_2= 'back'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEdgeEnumAccess().getBACKEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeEnum"


    // $ANTLR start "ruleTouchEnum"
    // InternalDSL.g:1168:1: ruleTouchEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'touchFrontLeft' ) | (enumLiteral_1= 'touchFrontRight' ) ) ;
    public final Enumerator ruleTouchEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDSL.g:1174:2: ( ( (enumLiteral_0= 'touchFrontLeft' ) | (enumLiteral_1= 'touchFrontRight' ) ) )
            // InternalDSL.g:1175:2: ( (enumLiteral_0= 'touchFrontLeft' ) | (enumLiteral_1= 'touchFrontRight' ) )
            {
            // InternalDSL.g:1175:2: ( (enumLiteral_0= 'touchFrontLeft' ) | (enumLiteral_1= 'touchFrontRight' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            else if ( (LA12_0==46) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1176:3: (enumLiteral_0= 'touchFrontLeft' )
                    {
                    // InternalDSL.g:1176:3: (enumLiteral_0= 'touchFrontLeft' )
                    // InternalDSL.g:1177:4: enumLiteral_0= 'touchFrontLeft'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1184:3: (enumLiteral_1= 'touchFrontRight' )
                    {
                    // InternalDSL.g:1184:3: (enumLiteral_1= 'touchFrontRight' )
                    // InternalDSL.g:1185:4: enumLiteral_1= 'touchFrontRight'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTouchEnumAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTouchEnum"


    // $ANTLR start "ruleColorEnum"
    // InternalDSL.g:1195:1: ruleColorEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) ) ;
    public final Enumerator ruleColorEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalDSL.g:1201:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) ) )
            // InternalDSL.g:1202:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) )
            {
            // InternalDSL.g:1202:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt13=1;
                }
                break;
            case 48:
                {
                alt13=2;
                }
                break;
            case 49:
                {
                alt13=3;
                }
                break;
            case 50:
                {
                alt13=4;
                }
                break;
            case 51:
                {
                alt13=5;
                }
                break;
            case 52:
                {
                alt13=6;
                }
                break;
            case 53:
                {
                alt13=7;
                }
                break;
            case 54:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDSL.g:1203:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalDSL.g:1203:3: (enumLiteral_0= 'NONE' )
                    // InternalDSL.g:1204:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:1211:3: (enumLiteral_1= 'BLACK' )
                    {
                    // InternalDSL.g:1211:3: (enumLiteral_1= 'BLACK' )
                    // InternalDSL.g:1212:4: enumLiteral_1= 'BLACK'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:1219:3: (enumLiteral_2= 'BLUE' )
                    {
                    // InternalDSL.g:1219:3: (enumLiteral_2= 'BLUE' )
                    // InternalDSL.g:1220:4: enumLiteral_2= 'BLUE'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:1227:3: (enumLiteral_3= 'GREEN' )
                    {
                    // InternalDSL.g:1227:3: (enumLiteral_3= 'GREEN' )
                    // InternalDSL.g:1228:4: enumLiteral_3= 'GREEN'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:1235:3: (enumLiteral_4= 'YELLOW' )
                    {
                    // InternalDSL.g:1235:3: (enumLiteral_4= 'YELLOW' )
                    // InternalDSL.g:1236:4: enumLiteral_4= 'YELLOW'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:1243:3: (enumLiteral_5= 'RED' )
                    {
                    // InternalDSL.g:1243:3: (enumLiteral_5= 'RED' )
                    // InternalDSL.g:1244:4: enumLiteral_5= 'RED'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:1251:3: (enumLiteral_6= 'WHITE' )
                    {
                    // InternalDSL.g:1251:3: (enumLiteral_6= 'WHITE' )
                    // InternalDSL.g:1252:4: enumLiteral_6= 'WHITE'
                    {
                    enumLiteral_6=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:1259:3: (enumLiteral_7= 'BROWN' )
                    {
                    // InternalDSL.g:1259:3: (enumLiteral_7= 'BROWN' )
                    // InternalDSL.g:1260:4: enumLiteral_7= 'BROWN'
                    {
                    enumLiteral_7=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorEnumAccess().getBROWNEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000604920000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x007F800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001C0000000000L});

}