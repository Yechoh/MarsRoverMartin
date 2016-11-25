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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Behavior'", "'IF'", "'THEN'", "'END'", "'leftMotor'", "'rightMotor'", "'rotate'", "'AND'", "'OR'", "'('", "')'", "'touch:'", "'color:'", "'sonar:'", "'forward'", "'backward'", "'stop'", "'touchLeft'", "'touchRight'", "'NONE'", "'BLACK'", "'BLUE'", "'GREEN'", "'YELLOW'", "'RED'", "'WHITE'", "'BROWN'"
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
    // InternalDSL.g:353:1: ruleRotateMovementAction returns [EObject current=null] : (otherlv_0= 'rotate' ( (lv_rotateleft_1_0= RULE_INT ) ) ( (lv_leftdir_2_0= ruleRotateEnum ) ) ( (lv_rotateright_3_0= RULE_INT ) ) ( (lv_rightdir_4_0= ruleRotateEnum ) ) ) ;
    public final EObject ruleRotateMovementAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rotateleft_1_0=null;
        Token lv_rotateright_3_0=null;
        Enumerator lv_leftdir_2_0 = null;

        Enumerator lv_rightdir_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:359:2: ( (otherlv_0= 'rotate' ( (lv_rotateleft_1_0= RULE_INT ) ) ( (lv_leftdir_2_0= ruleRotateEnum ) ) ( (lv_rotateright_3_0= RULE_INT ) ) ( (lv_rightdir_4_0= ruleRotateEnum ) ) ) )
            // InternalDSL.g:360:2: (otherlv_0= 'rotate' ( (lv_rotateleft_1_0= RULE_INT ) ) ( (lv_leftdir_2_0= ruleRotateEnum ) ) ( (lv_rotateright_3_0= RULE_INT ) ) ( (lv_rightdir_4_0= ruleRotateEnum ) ) )
            {
            // InternalDSL.g:360:2: (otherlv_0= 'rotate' ( (lv_rotateleft_1_0= RULE_INT ) ) ( (lv_leftdir_2_0= ruleRotateEnum ) ) ( (lv_rotateright_3_0= RULE_INT ) ) ( (lv_rightdir_4_0= ruleRotateEnum ) ) )
            // InternalDSL.g:361:3: otherlv_0= 'rotate' ( (lv_rotateleft_1_0= RULE_INT ) ) ( (lv_leftdir_2_0= ruleRotateEnum ) ) ( (lv_rotateright_3_0= RULE_INT ) ) ( (lv_rightdir_4_0= ruleRotateEnum ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateMovementActionAccess().getRotateKeyword_0());
            		
            // InternalDSL.g:365:3: ( (lv_rotateleft_1_0= RULE_INT ) )
            // InternalDSL.g:366:4: (lv_rotateleft_1_0= RULE_INT )
            {
            // InternalDSL.g:366:4: (lv_rotateleft_1_0= RULE_INT )
            // InternalDSL.g:367:5: lv_rotateleft_1_0= RULE_INT
            {
            lv_rotateleft_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_rotateleft_1_0, grammarAccess.getRotateMovementActionAccess().getRotateleftINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateMovementActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rotateleft",
            						lv_rotateleft_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDSL.g:383:3: ( (lv_leftdir_2_0= ruleRotateEnum ) )
            // InternalDSL.g:384:4: (lv_leftdir_2_0= ruleRotateEnum )
            {
            // InternalDSL.g:384:4: (lv_leftdir_2_0= ruleRotateEnum )
            // InternalDSL.g:385:5: lv_leftdir_2_0= ruleRotateEnum
            {

            					newCompositeNode(grammarAccess.getRotateMovementActionAccess().getLeftdirRotateEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_leftdir_2_0=ruleRotateEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateMovementActionRule());
            					}
            					set(
            						current,
            						"leftdir",
            						lv_leftdir_2_0,
            						"robot.DSL.RotateEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:402:3: ( (lv_rotateright_3_0= RULE_INT ) )
            // InternalDSL.g:403:4: (lv_rotateright_3_0= RULE_INT )
            {
            // InternalDSL.g:403:4: (lv_rotateright_3_0= RULE_INT )
            // InternalDSL.g:404:5: lv_rotateright_3_0= RULE_INT
            {
            lv_rotateright_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_rotateright_3_0, grammarAccess.getRotateMovementActionAccess().getRotaterightINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateMovementActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rotateright",
            						lv_rotateright_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDSL.g:420:3: ( (lv_rightdir_4_0= ruleRotateEnum ) )
            // InternalDSL.g:421:4: (lv_rightdir_4_0= ruleRotateEnum )
            {
            // InternalDSL.g:421:4: (lv_rightdir_4_0= ruleRotateEnum )
            // InternalDSL.g:422:5: lv_rightdir_4_0= ruleRotateEnum
            {

            					newCompositeNode(grammarAccess.getRotateMovementActionAccess().getRightdirRotateEnumEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightdir_4_0=ruleRotateEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateMovementActionRule());
            					}
            					set(
            						current,
            						"rightdir",
            						lv_rightdir_4_0,
            						"robot.DSL.RotateEnum");
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
    // $ANTLR end "ruleRotateMovementAction"


    // $ANTLR start "entryRuleMovementAction"
    // InternalDSL.g:443:1: entryRuleMovementAction returns [EObject current=null] : iv_ruleMovementAction= ruleMovementAction EOF ;
    public final EObject entryRuleMovementAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovementAction = null;


        try {
            // InternalDSL.g:443:55: (iv_ruleMovementAction= ruleMovementAction EOF )
            // InternalDSL.g:444:2: iv_ruleMovementAction= ruleMovementAction EOF
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
    // InternalDSL.g:450:1: ruleMovementAction returns [EObject current=null] : ( (lv_actionenum_0_0= ruleActionEnum ) ) ;
    public final EObject ruleMovementAction() throws RecognitionException {
        EObject current = null;

        Enumerator lv_actionenum_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:456:2: ( ( (lv_actionenum_0_0= ruleActionEnum ) ) )
            // InternalDSL.g:457:2: ( (lv_actionenum_0_0= ruleActionEnum ) )
            {
            // InternalDSL.g:457:2: ( (lv_actionenum_0_0= ruleActionEnum ) )
            // InternalDSL.g:458:3: (lv_actionenum_0_0= ruleActionEnum )
            {
            // InternalDSL.g:458:3: (lv_actionenum_0_0= ruleActionEnum )
            // InternalDSL.g:459:4: lv_actionenum_0_0= ruleActionEnum
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
    // InternalDSL.g:479:1: entryRuleExpression1 returns [EObject current=null] : iv_ruleExpression1= ruleExpression1 EOF ;
    public final EObject entryRuleExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1 = null;


        try {
            // InternalDSL.g:479:52: (iv_ruleExpression1= ruleExpression1 EOF )
            // InternalDSL.g:480:2: iv_ruleExpression1= ruleExpression1 EOF
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
    // InternalDSL.g:486:1: ruleExpression1 returns [EObject current=null] : (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* ) ;
    public final EObject ruleExpression1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:492:2: ( (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* ) )
            // InternalDSL.g:493:2: (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* )
            {
            // InternalDSL.g:493:2: (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )* )
            // InternalDSL.g:494:3: this_Expression2_0= ruleExpression2 ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression1Access().getExpression2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Expression2_0=ruleExpression2();

            state._fsp--;


            			current = this_Expression2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSL.g:502:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDSL.g:503:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleExpression2 ) )
            	    {
            	    // InternalDSL.g:503:4: ()
            	    // InternalDSL.g:504:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression1Access().getANDexpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression1Access().getANDKeyword_1_1());
            	    			
            	    // InternalDSL.g:514:4: ( (lv_right_3_0= ruleExpression2 ) )
            	    // InternalDSL.g:515:5: (lv_right_3_0= ruleExpression2 )
            	    {
            	    // InternalDSL.g:515:5: (lv_right_3_0= ruleExpression2 )
            	    // InternalDSL.g:516:6: lv_right_3_0= ruleExpression2
            	    {

            	    						newCompositeNode(grammarAccess.getExpression1Access().getRightExpression2ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    break loop4;
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
    // InternalDSL.g:538:1: entryRuleExpression2 returns [EObject current=null] : iv_ruleExpression2= ruleExpression2 EOF ;
    public final EObject entryRuleExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression2 = null;


        try {
            // InternalDSL.g:538:52: (iv_ruleExpression2= ruleExpression2 EOF )
            // InternalDSL.g:539:2: iv_ruleExpression2= ruleExpression2 EOF
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
    // InternalDSL.g:545:1: ruleExpression2 returns [EObject current=null] : (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* ) ;
    public final EObject ruleExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression3_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:551:2: ( (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* ) )
            // InternalDSL.g:552:2: (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* )
            {
            // InternalDSL.g:552:2: (this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )* )
            // InternalDSL.g:553:3: this_Expression3_0= ruleExpression3 ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression2Access().getExpression3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Expression3_0=ruleExpression3();

            state._fsp--;


            			current = this_Expression3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDSL.g:561:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:562:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleExpression3 ) )
            	    {
            	    // InternalDSL.g:562:4: ()
            	    // InternalDSL.g:563:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression2Access().getORexpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression2Access().getORKeyword_1_1());
            	    			
            	    // InternalDSL.g:573:4: ( (lv_right_3_0= ruleExpression3 ) )
            	    // InternalDSL.g:574:5: (lv_right_3_0= ruleExpression3 )
            	    {
            	    // InternalDSL.g:574:5: (lv_right_3_0= ruleExpression3 )
            	    // InternalDSL.g:575:6: lv_right_3_0= ruleExpression3
            	    {

            	    						newCompositeNode(grammarAccess.getExpression2Access().getRightExpression3ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
    // $ANTLR end "ruleExpression2"


    // $ANTLR start "entryRuleExpression3"
    // InternalDSL.g:597:1: entryRuleExpression3 returns [EObject current=null] : iv_ruleExpression3= ruleExpression3 EOF ;
    public final EObject entryRuleExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression3 = null;


        try {
            // InternalDSL.g:597:52: (iv_ruleExpression3= ruleExpression3 EOF )
            // InternalDSL.g:598:2: iv_ruleExpression3= ruleExpression3 EOF
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
    // InternalDSL.g:604:1: ruleExpression3 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral ) ;
    public final EObject ruleExpression3() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBracket_0 = null;

        EObject this_TouchLiteral_1 = null;

        EObject this_ColorLiteral_2 = null;

        EObject this_DistanceLiteral_3 = null;



        	enterRule();

        try {
            // InternalDSL.g:610:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral ) )
            // InternalDSL.g:611:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral )
            {
            // InternalDSL.g:611:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_TouchLiteral_1= ruleTouchLiteral | this_ColorLiteral_2= ruleColorLiteral | this_DistanceLiteral_3= ruleDistanceLiteral )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDSL.g:612:3: this_ExpressionBracket_0= ruleExpressionBracket
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
                    // InternalDSL.g:621:3: this_TouchLiteral_1= ruleTouchLiteral
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
                    // InternalDSL.g:630:3: this_ColorLiteral_2= ruleColorLiteral
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
                    // InternalDSL.g:639:3: this_DistanceLiteral_3= ruleDistanceLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpression3Access().getDistanceLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistanceLiteral_3=ruleDistanceLiteral();

                    state._fsp--;


                    			current = this_DistanceLiteral_3;
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
    // InternalDSL.g:651:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalDSL.g:651:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalDSL.g:652:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
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
    // InternalDSL.g:658:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:664:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' ) )
            // InternalDSL.g:665:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' )
            {
            // InternalDSL.g:665:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')' )
            // InternalDSL.g:666:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDSL.g:670:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalDSL.g:671:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalDSL.g:671:4: (lv_exp_1_0= ruleExpression )
            // InternalDSL.g:672:5: lv_exp_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpressionBracketAccess().getExpExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDSL.g:697:1: entryRuleTouchLiteral returns [EObject current=null] : iv_ruleTouchLiteral= ruleTouchLiteral EOF ;
    public final EObject entryRuleTouchLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchLiteral = null;


        try {
            // InternalDSL.g:697:53: (iv_ruleTouchLiteral= ruleTouchLiteral EOF )
            // InternalDSL.g:698:2: iv_ruleTouchLiteral= ruleTouchLiteral EOF
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
    // InternalDSL.g:704:1: ruleTouchLiteral returns [EObject current=null] : (otherlv_0= 'touch:' ( (lv_touch_1_0= ruleTouchEnum ) ) ) ;
    public final EObject ruleTouchLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_touch_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:710:2: ( (otherlv_0= 'touch:' ( (lv_touch_1_0= ruleTouchEnum ) ) ) )
            // InternalDSL.g:711:2: (otherlv_0= 'touch:' ( (lv_touch_1_0= ruleTouchEnum ) ) )
            {
            // InternalDSL.g:711:2: (otherlv_0= 'touch:' ( (lv_touch_1_0= ruleTouchEnum ) ) )
            // InternalDSL.g:712:3: otherlv_0= 'touch:' ( (lv_touch_1_0= ruleTouchEnum ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTouchLiteralAccess().getTouchKeyword_0());
            		
            // InternalDSL.g:716:3: ( (lv_touch_1_0= ruleTouchEnum ) )
            // InternalDSL.g:717:4: (lv_touch_1_0= ruleTouchEnum )
            {
            // InternalDSL.g:717:4: (lv_touch_1_0= ruleTouchEnum )
            // InternalDSL.g:718:5: lv_touch_1_0= ruleTouchEnum
            {

            					newCompositeNode(grammarAccess.getTouchLiteralAccess().getTouchTouchEnumEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_touch_1_0=ruleTouchEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTouchLiteralRule());
            					}
            					set(
            						current,
            						"touch",
            						lv_touch_1_0,
            						"robot.DSL.TouchEnum");
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
    // $ANTLR end "ruleTouchLiteral"


    // $ANTLR start "entryRuleColorLiteral"
    // InternalDSL.g:739:1: entryRuleColorLiteral returns [EObject current=null] : iv_ruleColorLiteral= ruleColorLiteral EOF ;
    public final EObject entryRuleColorLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorLiteral = null;


        try {
            // InternalDSL.g:739:53: (iv_ruleColorLiteral= ruleColorLiteral EOF )
            // InternalDSL.g:740:2: iv_ruleColorLiteral= ruleColorLiteral EOF
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
    // InternalDSL.g:746:1: ruleColorLiteral returns [EObject current=null] : (otherlv_0= 'color:' ( (lv_color_1_0= ruleColorEnum ) ) ) ;
    public final EObject ruleColorLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_color_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:752:2: ( (otherlv_0= 'color:' ( (lv_color_1_0= ruleColorEnum ) ) ) )
            // InternalDSL.g:753:2: (otherlv_0= 'color:' ( (lv_color_1_0= ruleColorEnum ) ) )
            {
            // InternalDSL.g:753:2: (otherlv_0= 'color:' ( (lv_color_1_0= ruleColorEnum ) ) )
            // InternalDSL.g:754:3: otherlv_0= 'color:' ( (lv_color_1_0= ruleColorEnum ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getColorLiteralAccess().getColorKeyword_0());
            		
            // InternalDSL.g:758:3: ( (lv_color_1_0= ruleColorEnum ) )
            // InternalDSL.g:759:4: (lv_color_1_0= ruleColorEnum )
            {
            // InternalDSL.g:759:4: (lv_color_1_0= ruleColorEnum )
            // InternalDSL.g:760:5: lv_color_1_0= ruleColorEnum
            {

            					newCompositeNode(grammarAccess.getColorLiteralAccess().getColorColorEnumEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_1_0=ruleColorEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorLiteralRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_1_0,
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
    // InternalDSL.g:781:1: entryRuleDistanceLiteral returns [EObject current=null] : iv_ruleDistanceLiteral= ruleDistanceLiteral EOF ;
    public final EObject entryRuleDistanceLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceLiteral = null;


        try {
            // InternalDSL.g:781:56: (iv_ruleDistanceLiteral= ruleDistanceLiteral EOF )
            // InternalDSL.g:782:2: iv_ruleDistanceLiteral= ruleDistanceLiteral EOF
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
    // InternalDSL.g:788:1: ruleDistanceLiteral returns [EObject current=null] : (otherlv_0= 'sonar:' ( (lv_distance_1_0= RULE_INT ) ) ) ;
    public final EObject ruleDistanceLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distance_1_0=null;


        	enterRule();

        try {
            // InternalDSL.g:794:2: ( (otherlv_0= 'sonar:' ( (lv_distance_1_0= RULE_INT ) ) ) )
            // InternalDSL.g:795:2: (otherlv_0= 'sonar:' ( (lv_distance_1_0= RULE_INT ) ) )
            {
            // InternalDSL.g:795:2: (otherlv_0= 'sonar:' ( (lv_distance_1_0= RULE_INT ) ) )
            // InternalDSL.g:796:3: otherlv_0= 'sonar:' ( (lv_distance_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDistanceLiteralAccess().getSonarKeyword_0());
            		
            // InternalDSL.g:800:3: ( (lv_distance_1_0= RULE_INT ) )
            // InternalDSL.g:801:4: (lv_distance_1_0= RULE_INT )
            {
            // InternalDSL.g:801:4: (lv_distance_1_0= RULE_INT )
            // InternalDSL.g:802:5: lv_distance_1_0= RULE_INT
            {
            lv_distance_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_distance_1_0, grammarAccess.getDistanceLiteralAccess().getDistanceINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDistanceLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleDistanceLiteral"


    // $ANTLR start "ruleRotateEnum"
    // InternalDSL.g:822:1: ruleRotateEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) ;
    public final Enumerator ruleRotateEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDSL.g:828:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) )
            // InternalDSL.g:829:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            {
            // InternalDSL.g:829:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:830:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalDSL.g:830:3: (enumLiteral_0= 'forward' )
                    // InternalDSL.g:831:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getRotateEnumAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRotateEnumAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:838:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalDSL.g:838:3: (enumLiteral_1= 'backward' )
                    // InternalDSL.g:839:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getRotateEnumAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRotateEnumAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleRotateEnum"


    // $ANTLR start "ruleActionEnum"
    // InternalDSL.g:849:1: ruleActionEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) ) ;
    public final Enumerator ruleActionEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDSL.g:855:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) ) )
            // InternalDSL.g:856:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) )
            {
            // InternalDSL.g:856:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) | (enumLiteral_2= 'stop' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt8=1;
                }
                break;
            case 26:
                {
                alt8=2;
                }
                break;
            case 27:
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
                    // InternalDSL.g:857:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalDSL.g:857:3: (enumLiteral_0= 'forward' )
                    // InternalDSL.g:858:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionEnumAccess().getFORWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:865:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalDSL.g:865:3: (enumLiteral_1= 'backward' )
                    // InternalDSL.g:866:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionEnumAccess().getBACKWARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:873:3: (enumLiteral_2= 'stop' )
                    {
                    // InternalDSL.g:873:3: (enumLiteral_2= 'stop' )
                    // InternalDSL.g:874:4: enumLiteral_2= 'stop'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "ruleTouchEnum"
    // InternalDSL.g:884:1: ruleTouchEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'touchLeft' ) | (enumLiteral_1= 'touchRight' ) ) ;
    public final Enumerator ruleTouchEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDSL.g:890:2: ( ( (enumLiteral_0= 'touchLeft' ) | (enumLiteral_1= 'touchRight' ) ) )
            // InternalDSL.g:891:2: ( (enumLiteral_0= 'touchLeft' ) | (enumLiteral_1= 'touchRight' ) )
            {
            // InternalDSL.g:891:2: ( (enumLiteral_0= 'touchLeft' ) | (enumLiteral_1= 'touchRight' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:892:3: (enumLiteral_0= 'touchLeft' )
                    {
                    // InternalDSL.g:892:3: (enumLiteral_0= 'touchLeft' )
                    // InternalDSL.g:893:4: enumLiteral_0= 'touchLeft'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTouchEnumAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:900:3: (enumLiteral_1= 'touchRight' )
                    {
                    // InternalDSL.g:900:3: (enumLiteral_1= 'touchRight' )
                    // InternalDSL.g:901:4: enumLiteral_1= 'touchRight'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

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
    // InternalDSL.g:911:1: ruleColorEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) ) ;
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
            // InternalDSL.g:917:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) ) )
            // InternalDSL.g:918:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) )
            {
            // InternalDSL.g:918:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'BLUE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'YELLOW' ) | (enumLiteral_5= 'RED' ) | (enumLiteral_6= 'WHITE' ) | (enumLiteral_7= 'BROWN' ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            case 34:
                {
                alt10=5;
                }
                break;
            case 35:
                {
                alt10=6;
                }
                break;
            case 36:
                {
                alt10=7;
                }
                break;
            case 37:
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
                    // InternalDSL.g:919:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalDSL.g:919:3: (enumLiteral_0= 'NONE' )
                    // InternalDSL.g:920:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorEnumAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:927:3: (enumLiteral_1= 'BLACK' )
                    {
                    // InternalDSL.g:927:3: (enumLiteral_1= 'BLACK' )
                    // InternalDSL.g:928:4: enumLiteral_1= 'BLACK'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorEnumAccess().getBLACKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:935:3: (enumLiteral_2= 'BLUE' )
                    {
                    // InternalDSL.g:935:3: (enumLiteral_2= 'BLUE' )
                    // InternalDSL.g:936:4: enumLiteral_2= 'BLUE'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorEnumAccess().getBLUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:943:3: (enumLiteral_3= 'GREEN' )
                    {
                    // InternalDSL.g:943:3: (enumLiteral_3= 'GREEN' )
                    // InternalDSL.g:944:4: enumLiteral_3= 'GREEN'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorEnumAccess().getGREENEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDSL.g:951:3: (enumLiteral_4= 'YELLOW' )
                    {
                    // InternalDSL.g:951:3: (enumLiteral_4= 'YELLOW' )
                    // InternalDSL.g:952:4: enumLiteral_4= 'YELLOW'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorEnumAccess().getYELLOWEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDSL.g:959:3: (enumLiteral_5= 'RED' )
                    {
                    // InternalDSL.g:959:3: (enumLiteral_5= 'RED' )
                    // InternalDSL.g:960:4: enumLiteral_5= 'RED'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorEnumAccess().getREDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDSL.g:967:3: (enumLiteral_6= 'WHITE' )
                    {
                    // InternalDSL.g:967:3: (enumLiteral_6= 'WHITE' )
                    // InternalDSL.g:968:4: enumLiteral_6= 'WHITE'
                    {
                    enumLiteral_6=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorEnumAccess().getWHITEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDSL.g:975:3: (enumLiteral_7= 'BROWN' )
                    {
                    // InternalDSL.g:975:3: (enumLiteral_7= 'BROWN' )
                    // InternalDSL.g:976:4: enumLiteral_7= 'BROWN'
                    {
                    enumLiteral_7=(Token)match(input,37,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001D00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003FC0000000L});

}