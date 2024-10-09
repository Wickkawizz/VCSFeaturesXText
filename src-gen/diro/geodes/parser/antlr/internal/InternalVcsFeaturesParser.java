package diro.geodes.parser.antlr.internal;

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
import diro.geodes.services.VcsFeaturesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVcsFeaturesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VCSFeatures'", "'{'", "'commands'", "','", "'}'", "'history'", "'versionunit'", "'collaborationstyle'", "'database'", "'-'", "'mergeStrategy'", "'lowlevelcommand'", "'highlevelcommand'", "'labelType'", "'commitHistoryRange'", "'numberOfBranches'", "'granularity'", "'collabStyle'", "'Database'", "'ConnectionString'", "'DatabaseType'", "'HighLevelCommand'", "'('", "')'", "'LowLevelCommand'", "'command'", "'DSMCompare'", "'GitDiff'", "'Add'", "'Checkout'", "'CheckoutCreate'", "'Clone'", "'Commit'", "'CherryPick'", "'CreateBranch'", "'Fetch'", "'Init'", "'Pull'", "'Push'", "'RemoteAdd'", "'Rm'", "'Log'", "'Open'", "'Unique'", "'CommitHash'", "'Label'", "'Line'", "'Semantic'", "'File'", "'Element'", "'LocalOnly'", "'Remote'", "'MongoDB'", "'XMI'", "'Neo4J'", "'SQL'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
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


        public InternalVcsFeaturesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVcsFeaturesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVcsFeaturesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVcsFeatures.g"; }



     	private VcsFeaturesGrammarAccess grammarAccess;

        public InternalVcsFeaturesParser(TokenStream input, VcsFeaturesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VCSFeatures";
       	}

       	@Override
       	protected VcsFeaturesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVCSFeatures"
    // InternalVcsFeatures.g:65:1: entryRuleVCSFeatures returns [EObject current=null] : iv_ruleVCSFeatures= ruleVCSFeatures EOF ;
    public final EObject entryRuleVCSFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVCSFeatures = null;


        try {
            // InternalVcsFeatures.g:65:52: (iv_ruleVCSFeatures= ruleVCSFeatures EOF )
            // InternalVcsFeatures.g:66:2: iv_ruleVCSFeatures= ruleVCSFeatures EOF
            {
             newCompositeNode(grammarAccess.getVCSFeaturesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVCSFeatures=ruleVCSFeatures();

            state._fsp--;

             current =iv_ruleVCSFeatures; 
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
    // $ANTLR end "entryRuleVCSFeatures"


    // $ANTLR start "ruleVCSFeatures"
    // InternalVcsFeatures.g:72:1: ruleVCSFeatures returns [EObject current=null] : ( () otherlv_1= 'VCSFeatures' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'commands' otherlv_5= '{' ( (lv_commands_6_0= ruleCommands ) ) (otherlv_7= ',' ( (lv_commands_8_0= ruleCommands ) ) )* otherlv_9= '}' )? (otherlv_10= 'history' otherlv_11= '{' ( (lv_history_12_0= ruleHistory ) ) (otherlv_13= ',' ( (lv_history_14_0= ruleHistory ) ) )* otherlv_15= '}' )? (otherlv_16= 'versionunit' otherlv_17= '{' ( (lv_versionunit_18_0= ruleVersionUnit ) ) (otherlv_19= ',' ( (lv_versionunit_20_0= ruleVersionUnit ) ) )* otherlv_21= '}' )? (otherlv_22= 'collaborationstyle' otherlv_23= '{' ( (lv_collaborationstyle_24_0= ruleCollaborationStyle ) ) (otherlv_25= ',' ( (lv_collaborationstyle_26_0= ruleCollaborationStyle ) ) )* otherlv_27= '}' )? (otherlv_28= 'database' otherlv_29= '{' ( (lv_database_30_0= ruleDatabase ) ) (otherlv_31= ',' ( (lv_database_32_0= ruleDatabase ) ) )* otherlv_33= '}' )? otherlv_34= '}' ) ;
    public final EObject ruleVCSFeatures() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_commands_6_0 = null;

        EObject lv_commands_8_0 = null;

        EObject lv_history_12_0 = null;

        EObject lv_history_14_0 = null;

        EObject lv_versionunit_18_0 = null;

        EObject lv_versionunit_20_0 = null;

        EObject lv_collaborationstyle_24_0 = null;

        EObject lv_collaborationstyle_26_0 = null;

        EObject lv_database_30_0 = null;

        EObject lv_database_32_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:78:2: ( ( () otherlv_1= 'VCSFeatures' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'commands' otherlv_5= '{' ( (lv_commands_6_0= ruleCommands ) ) (otherlv_7= ',' ( (lv_commands_8_0= ruleCommands ) ) )* otherlv_9= '}' )? (otherlv_10= 'history' otherlv_11= '{' ( (lv_history_12_0= ruleHistory ) ) (otherlv_13= ',' ( (lv_history_14_0= ruleHistory ) ) )* otherlv_15= '}' )? (otherlv_16= 'versionunit' otherlv_17= '{' ( (lv_versionunit_18_0= ruleVersionUnit ) ) (otherlv_19= ',' ( (lv_versionunit_20_0= ruleVersionUnit ) ) )* otherlv_21= '}' )? (otherlv_22= 'collaborationstyle' otherlv_23= '{' ( (lv_collaborationstyle_24_0= ruleCollaborationStyle ) ) (otherlv_25= ',' ( (lv_collaborationstyle_26_0= ruleCollaborationStyle ) ) )* otherlv_27= '}' )? (otherlv_28= 'database' otherlv_29= '{' ( (lv_database_30_0= ruleDatabase ) ) (otherlv_31= ',' ( (lv_database_32_0= ruleDatabase ) ) )* otherlv_33= '}' )? otherlv_34= '}' ) )
            // InternalVcsFeatures.g:79:2: ( () otherlv_1= 'VCSFeatures' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'commands' otherlv_5= '{' ( (lv_commands_6_0= ruleCommands ) ) (otherlv_7= ',' ( (lv_commands_8_0= ruleCommands ) ) )* otherlv_9= '}' )? (otherlv_10= 'history' otherlv_11= '{' ( (lv_history_12_0= ruleHistory ) ) (otherlv_13= ',' ( (lv_history_14_0= ruleHistory ) ) )* otherlv_15= '}' )? (otherlv_16= 'versionunit' otherlv_17= '{' ( (lv_versionunit_18_0= ruleVersionUnit ) ) (otherlv_19= ',' ( (lv_versionunit_20_0= ruleVersionUnit ) ) )* otherlv_21= '}' )? (otherlv_22= 'collaborationstyle' otherlv_23= '{' ( (lv_collaborationstyle_24_0= ruleCollaborationStyle ) ) (otherlv_25= ',' ( (lv_collaborationstyle_26_0= ruleCollaborationStyle ) ) )* otherlv_27= '}' )? (otherlv_28= 'database' otherlv_29= '{' ( (lv_database_30_0= ruleDatabase ) ) (otherlv_31= ',' ( (lv_database_32_0= ruleDatabase ) ) )* otherlv_33= '}' )? otherlv_34= '}' )
            {
            // InternalVcsFeatures.g:79:2: ( () otherlv_1= 'VCSFeatures' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'commands' otherlv_5= '{' ( (lv_commands_6_0= ruleCommands ) ) (otherlv_7= ',' ( (lv_commands_8_0= ruleCommands ) ) )* otherlv_9= '}' )? (otherlv_10= 'history' otherlv_11= '{' ( (lv_history_12_0= ruleHistory ) ) (otherlv_13= ',' ( (lv_history_14_0= ruleHistory ) ) )* otherlv_15= '}' )? (otherlv_16= 'versionunit' otherlv_17= '{' ( (lv_versionunit_18_0= ruleVersionUnit ) ) (otherlv_19= ',' ( (lv_versionunit_20_0= ruleVersionUnit ) ) )* otherlv_21= '}' )? (otherlv_22= 'collaborationstyle' otherlv_23= '{' ( (lv_collaborationstyle_24_0= ruleCollaborationStyle ) ) (otherlv_25= ',' ( (lv_collaborationstyle_26_0= ruleCollaborationStyle ) ) )* otherlv_27= '}' )? (otherlv_28= 'database' otherlv_29= '{' ( (lv_database_30_0= ruleDatabase ) ) (otherlv_31= ',' ( (lv_database_32_0= ruleDatabase ) ) )* otherlv_33= '}' )? otherlv_34= '}' )
            // InternalVcsFeatures.g:80:3: () otherlv_1= 'VCSFeatures' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'commands' otherlv_5= '{' ( (lv_commands_6_0= ruleCommands ) ) (otherlv_7= ',' ( (lv_commands_8_0= ruleCommands ) ) )* otherlv_9= '}' )? (otherlv_10= 'history' otherlv_11= '{' ( (lv_history_12_0= ruleHistory ) ) (otherlv_13= ',' ( (lv_history_14_0= ruleHistory ) ) )* otherlv_15= '}' )? (otherlv_16= 'versionunit' otherlv_17= '{' ( (lv_versionunit_18_0= ruleVersionUnit ) ) (otherlv_19= ',' ( (lv_versionunit_20_0= ruleVersionUnit ) ) )* otherlv_21= '}' )? (otherlv_22= 'collaborationstyle' otherlv_23= '{' ( (lv_collaborationstyle_24_0= ruleCollaborationStyle ) ) (otherlv_25= ',' ( (lv_collaborationstyle_26_0= ruleCollaborationStyle ) ) )* otherlv_27= '}' )? (otherlv_28= 'database' otherlv_29= '{' ( (lv_database_30_0= ruleDatabase ) ) (otherlv_31= ',' ( (lv_database_32_0= ruleDatabase ) ) )* otherlv_33= '}' )? otherlv_34= '}'
            {
            // InternalVcsFeatures.g:80:3: ()
            // InternalVcsFeatures.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVCSFeaturesAccess().getVCSFeaturesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVCSFeaturesAccess().getVCSFeaturesKeyword_1());
            		
            // InternalVcsFeatures.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalVcsFeatures.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalVcsFeatures.g:92:4: (lv_name_2_0= ruleEString )
            // InternalVcsFeatures.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVCSFeaturesAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"diro.geodes.VcsFeatures.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getVCSFeaturesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVcsFeatures.g:114:3: (otherlv_4= 'commands' otherlv_5= '{' ( (lv_commands_6_0= ruleCommands ) ) (otherlv_7= ',' ( (lv_commands_8_0= ruleCommands ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalVcsFeatures.g:115:4: otherlv_4= 'commands' otherlv_5= '{' ( (lv_commands_6_0= ruleCommands ) ) (otherlv_7= ',' ( (lv_commands_8_0= ruleCommands ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getVCSFeaturesAccess().getCommandsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getVCSFeaturesAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalVcsFeatures.g:123:4: ( (lv_commands_6_0= ruleCommands ) )
                    // InternalVcsFeatures.g:124:5: (lv_commands_6_0= ruleCommands )
                    {
                    // InternalVcsFeatures.g:124:5: (lv_commands_6_0= ruleCommands )
                    // InternalVcsFeatures.g:125:6: lv_commands_6_0= ruleCommands
                    {

                    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getCommandsCommandsParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_commands_6_0=ruleCommands();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    						}
                    						add(
                    							current,
                    							"commands",
                    							lv_commands_6_0,
                    							"diro.geodes.VcsFeatures.Commands");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:142:4: (otherlv_7= ',' ( (lv_commands_8_0= ruleCommands ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:143:5: otherlv_7= ',' ( (lv_commands_8_0= ruleCommands ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getVCSFeaturesAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalVcsFeatures.g:147:5: ( (lv_commands_8_0= ruleCommands ) )
                    	    // InternalVcsFeatures.g:148:6: (lv_commands_8_0= ruleCommands )
                    	    {
                    	    // InternalVcsFeatures.g:148:6: (lv_commands_8_0= ruleCommands )
                    	    // InternalVcsFeatures.g:149:7: lv_commands_8_0= ruleCommands
                    	    {

                    	    							newCompositeNode(grammarAccess.getVCSFeaturesAccess().getCommandsCommandsParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_commands_8_0=ruleCommands();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"commands",
                    	    								lv_commands_8_0,
                    	    								"diro.geodes.VcsFeatures.Commands");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getVCSFeaturesAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalVcsFeatures.g:172:3: (otherlv_10= 'history' otherlv_11= '{' ( (lv_history_12_0= ruleHistory ) ) (otherlv_13= ',' ( (lv_history_14_0= ruleHistory ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVcsFeatures.g:173:4: otherlv_10= 'history' otherlv_11= '{' ( (lv_history_12_0= ruleHistory ) ) (otherlv_13= ',' ( (lv_history_14_0= ruleHistory ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getVCSFeaturesAccess().getHistoryKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getVCSFeaturesAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalVcsFeatures.g:181:4: ( (lv_history_12_0= ruleHistory ) )
                    // InternalVcsFeatures.g:182:5: (lv_history_12_0= ruleHistory )
                    {
                    // InternalVcsFeatures.g:182:5: (lv_history_12_0= ruleHistory )
                    // InternalVcsFeatures.g:183:6: lv_history_12_0= ruleHistory
                    {

                    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getHistoryHistoryParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_history_12_0=ruleHistory();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    						}
                    						add(
                    							current,
                    							"history",
                    							lv_history_12_0,
                    							"diro.geodes.VcsFeatures.History");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:200:4: (otherlv_13= ',' ( (lv_history_14_0= ruleHistory ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:201:5: otherlv_13= ',' ( (lv_history_14_0= ruleHistory ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getVCSFeaturesAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalVcsFeatures.g:205:5: ( (lv_history_14_0= ruleHistory ) )
                    	    // InternalVcsFeatures.g:206:6: (lv_history_14_0= ruleHistory )
                    	    {
                    	    // InternalVcsFeatures.g:206:6: (lv_history_14_0= ruleHistory )
                    	    // InternalVcsFeatures.g:207:7: lv_history_14_0= ruleHistory
                    	    {

                    	    							newCompositeNode(grammarAccess.getVCSFeaturesAccess().getHistoryHistoryParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_history_14_0=ruleHistory();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"history",
                    	    								lv_history_14_0,
                    	    								"diro.geodes.VcsFeatures.History");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getVCSFeaturesAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalVcsFeatures.g:230:3: (otherlv_16= 'versionunit' otherlv_17= '{' ( (lv_versionunit_18_0= ruleVersionUnit ) ) (otherlv_19= ',' ( (lv_versionunit_20_0= ruleVersionUnit ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVcsFeatures.g:231:4: otherlv_16= 'versionunit' otherlv_17= '{' ( (lv_versionunit_18_0= ruleVersionUnit ) ) (otherlv_19= ',' ( (lv_versionunit_20_0= ruleVersionUnit ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getVCSFeaturesAccess().getVersionunitKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_17, grammarAccess.getVCSFeaturesAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalVcsFeatures.g:239:4: ( (lv_versionunit_18_0= ruleVersionUnit ) )
                    // InternalVcsFeatures.g:240:5: (lv_versionunit_18_0= ruleVersionUnit )
                    {
                    // InternalVcsFeatures.g:240:5: (lv_versionunit_18_0= ruleVersionUnit )
                    // InternalVcsFeatures.g:241:6: lv_versionunit_18_0= ruleVersionUnit
                    {

                    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getVersionunitVersionUnitParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_versionunit_18_0=ruleVersionUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    						}
                    						add(
                    							current,
                    							"versionunit",
                    							lv_versionunit_18_0,
                    							"diro.geodes.VcsFeatures.VersionUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:258:4: (otherlv_19= ',' ( (lv_versionunit_20_0= ruleVersionUnit ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:259:5: otherlv_19= ',' ( (lv_versionunit_20_0= ruleVersionUnit ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getVCSFeaturesAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalVcsFeatures.g:263:5: ( (lv_versionunit_20_0= ruleVersionUnit ) )
                    	    // InternalVcsFeatures.g:264:6: (lv_versionunit_20_0= ruleVersionUnit )
                    	    {
                    	    // InternalVcsFeatures.g:264:6: (lv_versionunit_20_0= ruleVersionUnit )
                    	    // InternalVcsFeatures.g:265:7: lv_versionunit_20_0= ruleVersionUnit
                    	    {

                    	    							newCompositeNode(grammarAccess.getVCSFeaturesAccess().getVersionunitVersionUnitParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_versionunit_20_0=ruleVersionUnit();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"versionunit",
                    	    								lv_versionunit_20_0,
                    	    								"diro.geodes.VcsFeatures.VersionUnit");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getVCSFeaturesAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalVcsFeatures.g:288:3: (otherlv_22= 'collaborationstyle' otherlv_23= '{' ( (lv_collaborationstyle_24_0= ruleCollaborationStyle ) ) (otherlv_25= ',' ( (lv_collaborationstyle_26_0= ruleCollaborationStyle ) ) )* otherlv_27= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVcsFeatures.g:289:4: otherlv_22= 'collaborationstyle' otherlv_23= '{' ( (lv_collaborationstyle_24_0= ruleCollaborationStyle ) ) (otherlv_25= ',' ( (lv_collaborationstyle_26_0= ruleCollaborationStyle ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getVCSFeaturesAccess().getCollaborationstyleKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_23, grammarAccess.getVCSFeaturesAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalVcsFeatures.g:297:4: ( (lv_collaborationstyle_24_0= ruleCollaborationStyle ) )
                    // InternalVcsFeatures.g:298:5: (lv_collaborationstyle_24_0= ruleCollaborationStyle )
                    {
                    // InternalVcsFeatures.g:298:5: (lv_collaborationstyle_24_0= ruleCollaborationStyle )
                    // InternalVcsFeatures.g:299:6: lv_collaborationstyle_24_0= ruleCollaborationStyle
                    {

                    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleCollaborationStyleParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_collaborationstyle_24_0=ruleCollaborationStyle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    						}
                    						add(
                    							current,
                    							"collaborationstyle",
                    							lv_collaborationstyle_24_0,
                    							"diro.geodes.VcsFeatures.CollaborationStyle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:316:4: (otherlv_25= ',' ( (lv_collaborationstyle_26_0= ruleCollaborationStyle ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:317:5: otherlv_25= ',' ( (lv_collaborationstyle_26_0= ruleCollaborationStyle ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getVCSFeaturesAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalVcsFeatures.g:321:5: ( (lv_collaborationstyle_26_0= ruleCollaborationStyle ) )
                    	    // InternalVcsFeatures.g:322:6: (lv_collaborationstyle_26_0= ruleCollaborationStyle )
                    	    {
                    	    // InternalVcsFeatures.g:322:6: (lv_collaborationstyle_26_0= ruleCollaborationStyle )
                    	    // InternalVcsFeatures.g:323:7: lv_collaborationstyle_26_0= ruleCollaborationStyle
                    	    {

                    	    							newCompositeNode(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleCollaborationStyleParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_collaborationstyle_26_0=ruleCollaborationStyle();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"collaborationstyle",
                    	    								lv_collaborationstyle_26_0,
                    	    								"diro.geodes.VcsFeatures.CollaborationStyle");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_27, grammarAccess.getVCSFeaturesAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalVcsFeatures.g:346:3: (otherlv_28= 'database' otherlv_29= '{' ( (lv_database_30_0= ruleDatabase ) ) (otherlv_31= ',' ( (lv_database_32_0= ruleDatabase ) ) )* otherlv_33= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVcsFeatures.g:347:4: otherlv_28= 'database' otherlv_29= '{' ( (lv_database_30_0= ruleDatabase ) ) (otherlv_31= ',' ( (lv_database_32_0= ruleDatabase ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getVCSFeaturesAccess().getDatabaseKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_29, grammarAccess.getVCSFeaturesAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalVcsFeatures.g:355:4: ( (lv_database_30_0= ruleDatabase ) )
                    // InternalVcsFeatures.g:356:5: (lv_database_30_0= ruleDatabase )
                    {
                    // InternalVcsFeatures.g:356:5: (lv_database_30_0= ruleDatabase )
                    // InternalVcsFeatures.g:357:6: lv_database_30_0= ruleDatabase
                    {

                    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getDatabaseDatabaseParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_database_30_0=ruleDatabase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    						}
                    						add(
                    							current,
                    							"database",
                    							lv_database_30_0,
                    							"diro.geodes.VcsFeatures.Database");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:374:4: (otherlv_31= ',' ( (lv_database_32_0= ruleDatabase ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:375:5: otherlv_31= ',' ( (lv_database_32_0= ruleDatabase ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getVCSFeaturesAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalVcsFeatures.g:379:5: ( (lv_database_32_0= ruleDatabase ) )
                    	    // InternalVcsFeatures.g:380:6: (lv_database_32_0= ruleDatabase )
                    	    {
                    	    // InternalVcsFeatures.g:380:6: (lv_database_32_0= ruleDatabase )
                    	    // InternalVcsFeatures.g:381:7: lv_database_32_0= ruleDatabase
                    	    {

                    	    							newCompositeNode(grammarAccess.getVCSFeaturesAccess().getDatabaseDatabaseParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_database_32_0=ruleDatabase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"database",
                    	    								lv_database_32_0,
                    	    								"diro.geodes.VcsFeatures.Database");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_33, grammarAccess.getVCSFeaturesAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_34=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getVCSFeaturesAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleVCSFeatures"


    // $ANTLR start "entryRuleCommands"
    // InternalVcsFeatures.g:412:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalVcsFeatures.g:412:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalVcsFeatures.g:413:2: iv_ruleCommands= ruleCommands EOF
            {
             newCompositeNode(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;

             current =iv_ruleCommands; 
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
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalVcsFeatures.g:419:1: ruleCommands returns [EObject current=null] : ( () otherlv_1= '-' (otherlv_2= 'mergeStrategy' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )? otherlv_4= '-' (otherlv_5= 'lowlevelcommand' otherlv_6= '{' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) (otherlv_8= ',' ( (lv_lowlevelcommand_9_0= ruleLowLevelCommand ) ) )* otherlv_10= '}' )? otherlv_11= '-' (otherlv_12= 'highlevelcommand' otherlv_13= '{' ( (lv_highlevelcommand_14_0= ruleHighLevelCommand ) ) (otherlv_15= ',' ( (lv_highlevelcommand_16_0= ruleHighLevelCommand ) ) )* otherlv_17= '}' )? ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_mergeStrategy_3_0 = null;

        EObject lv_lowlevelcommand_7_0 = null;

        EObject lv_lowlevelcommand_9_0 = null;

        EObject lv_highlevelcommand_14_0 = null;

        EObject lv_highlevelcommand_16_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:425:2: ( ( () otherlv_1= '-' (otherlv_2= 'mergeStrategy' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )? otherlv_4= '-' (otherlv_5= 'lowlevelcommand' otherlv_6= '{' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) (otherlv_8= ',' ( (lv_lowlevelcommand_9_0= ruleLowLevelCommand ) ) )* otherlv_10= '}' )? otherlv_11= '-' (otherlv_12= 'highlevelcommand' otherlv_13= '{' ( (lv_highlevelcommand_14_0= ruleHighLevelCommand ) ) (otherlv_15= ',' ( (lv_highlevelcommand_16_0= ruleHighLevelCommand ) ) )* otherlv_17= '}' )? ) )
            // InternalVcsFeatures.g:426:2: ( () otherlv_1= '-' (otherlv_2= 'mergeStrategy' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )? otherlv_4= '-' (otherlv_5= 'lowlevelcommand' otherlv_6= '{' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) (otherlv_8= ',' ( (lv_lowlevelcommand_9_0= ruleLowLevelCommand ) ) )* otherlv_10= '}' )? otherlv_11= '-' (otherlv_12= 'highlevelcommand' otherlv_13= '{' ( (lv_highlevelcommand_14_0= ruleHighLevelCommand ) ) (otherlv_15= ',' ( (lv_highlevelcommand_16_0= ruleHighLevelCommand ) ) )* otherlv_17= '}' )? )
            {
            // InternalVcsFeatures.g:426:2: ( () otherlv_1= '-' (otherlv_2= 'mergeStrategy' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )? otherlv_4= '-' (otherlv_5= 'lowlevelcommand' otherlv_6= '{' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) (otherlv_8= ',' ( (lv_lowlevelcommand_9_0= ruleLowLevelCommand ) ) )* otherlv_10= '}' )? otherlv_11= '-' (otherlv_12= 'highlevelcommand' otherlv_13= '{' ( (lv_highlevelcommand_14_0= ruleHighLevelCommand ) ) (otherlv_15= ',' ( (lv_highlevelcommand_16_0= ruleHighLevelCommand ) ) )* otherlv_17= '}' )? )
            // InternalVcsFeatures.g:427:3: () otherlv_1= '-' (otherlv_2= 'mergeStrategy' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )? otherlv_4= '-' (otherlv_5= 'lowlevelcommand' otherlv_6= '{' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) (otherlv_8= ',' ( (lv_lowlevelcommand_9_0= ruleLowLevelCommand ) ) )* otherlv_10= '}' )? otherlv_11= '-' (otherlv_12= 'highlevelcommand' otherlv_13= '{' ( (lv_highlevelcommand_14_0= ruleHighLevelCommand ) ) (otherlv_15= ',' ( (lv_highlevelcommand_16_0= ruleHighLevelCommand ) ) )* otherlv_17= '}' )?
            {
            // InternalVcsFeatures.g:427:3: ()
            // InternalVcsFeatures.g:428:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandsAccess().getCommandsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getHyphenMinusKeyword_1());
            		
            // InternalVcsFeatures.g:438:3: (otherlv_2= 'mergeStrategy' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVcsFeatures.g:439:4: otherlv_2= 'mergeStrategy' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommandsAccess().getMergeStrategyKeyword_2_0());
                    			
                    // InternalVcsFeatures.g:443:4: ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) )
                    // InternalVcsFeatures.g:444:5: (lv_mergeStrategy_3_0= ruleMergeStrategy )
                    {
                    // InternalVcsFeatures.g:444:5: (lv_mergeStrategy_3_0= ruleMergeStrategy )
                    // InternalVcsFeatures.g:445:6: lv_mergeStrategy_3_0= ruleMergeStrategy
                    {

                    						newCompositeNode(grammarAccess.getCommandsAccess().getMergeStrategyMergeStrategyEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_mergeStrategy_3_0=ruleMergeStrategy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandsRule());
                    						}
                    						set(
                    							current,
                    							"mergeStrategy",
                    							lv_mergeStrategy_3_0,
                    							"diro.geodes.VcsFeatures.MergeStrategy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandsAccess().getHyphenMinusKeyword_3());
            		
            // InternalVcsFeatures.g:467:3: (otherlv_5= 'lowlevelcommand' otherlv_6= '{' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) (otherlv_8= ',' ( (lv_lowlevelcommand_9_0= ruleLowLevelCommand ) ) )* otherlv_10= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVcsFeatures.g:468:4: otherlv_5= 'lowlevelcommand' otherlv_6= '{' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) (otherlv_8= ',' ( (lv_lowlevelcommand_9_0= ruleLowLevelCommand ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommandsAccess().getLowlevelcommandKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getCommandsAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalVcsFeatures.g:476:4: ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) )
                    // InternalVcsFeatures.g:477:5: (lv_lowlevelcommand_7_0= ruleLowLevelCommand )
                    {
                    // InternalVcsFeatures.g:477:5: (lv_lowlevelcommand_7_0= ruleLowLevelCommand )
                    // InternalVcsFeatures.g:478:6: lv_lowlevelcommand_7_0= ruleLowLevelCommand
                    {

                    						newCompositeNode(grammarAccess.getCommandsAccess().getLowlevelcommandLowLevelCommandParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_lowlevelcommand_7_0=ruleLowLevelCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandsRule());
                    						}
                    						add(
                    							current,
                    							"lowlevelcommand",
                    							lv_lowlevelcommand_7_0,
                    							"diro.geodes.VcsFeatures.LowLevelCommand");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:495:4: (otherlv_8= ',' ( (lv_lowlevelcommand_9_0= ruleLowLevelCommand ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:496:5: otherlv_8= ',' ( (lv_lowlevelcommand_9_0= ruleLowLevelCommand ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCommandsAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalVcsFeatures.g:500:5: ( (lv_lowlevelcommand_9_0= ruleLowLevelCommand ) )
                    	    // InternalVcsFeatures.g:501:6: (lv_lowlevelcommand_9_0= ruleLowLevelCommand )
                    	    {
                    	    // InternalVcsFeatures.g:501:6: (lv_lowlevelcommand_9_0= ruleLowLevelCommand )
                    	    // InternalVcsFeatures.g:502:7: lv_lowlevelcommand_9_0= ruleLowLevelCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommandsAccess().getLowlevelcommandLowLevelCommandParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_lowlevelcommand_9_0=ruleLowLevelCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommandsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"lowlevelcommand",
                    	    								lv_lowlevelcommand_9_0,
                    	    								"diro.geodes.VcsFeatures.LowLevelCommand");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getCommandsAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getCommandsAccess().getHyphenMinusKeyword_5());
            		
            // InternalVcsFeatures.g:529:3: (otherlv_12= 'highlevelcommand' otherlv_13= '{' ( (lv_highlevelcommand_14_0= ruleHighLevelCommand ) ) (otherlv_15= ',' ( (lv_highlevelcommand_16_0= ruleHighLevelCommand ) ) )* otherlv_17= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVcsFeatures.g:530:4: otherlv_12= 'highlevelcommand' otherlv_13= '{' ( (lv_highlevelcommand_14_0= ruleHighLevelCommand ) ) (otherlv_15= ',' ( (lv_highlevelcommand_16_0= ruleHighLevelCommand ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getCommandsAccess().getHighlevelcommandKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getCommandsAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalVcsFeatures.g:538:4: ( (lv_highlevelcommand_14_0= ruleHighLevelCommand ) )
                    // InternalVcsFeatures.g:539:5: (lv_highlevelcommand_14_0= ruleHighLevelCommand )
                    {
                    // InternalVcsFeatures.g:539:5: (lv_highlevelcommand_14_0= ruleHighLevelCommand )
                    // InternalVcsFeatures.g:540:6: lv_highlevelcommand_14_0= ruleHighLevelCommand
                    {

                    						newCompositeNode(grammarAccess.getCommandsAccess().getHighlevelcommandHighLevelCommandParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_highlevelcommand_14_0=ruleHighLevelCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandsRule());
                    						}
                    						add(
                    							current,
                    							"highlevelcommand",
                    							lv_highlevelcommand_14_0,
                    							"diro.geodes.VcsFeatures.HighLevelCommand");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:557:4: (otherlv_15= ',' ( (lv_highlevelcommand_16_0= ruleHighLevelCommand ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:558:5: otherlv_15= ',' ( (lv_highlevelcommand_16_0= ruleHighLevelCommand ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCommandsAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalVcsFeatures.g:562:5: ( (lv_highlevelcommand_16_0= ruleHighLevelCommand ) )
                    	    // InternalVcsFeatures.g:563:6: (lv_highlevelcommand_16_0= ruleHighLevelCommand )
                    	    {
                    	    // InternalVcsFeatures.g:563:6: (lv_highlevelcommand_16_0= ruleHighLevelCommand )
                    	    // InternalVcsFeatures.g:564:7: lv_highlevelcommand_16_0= ruleHighLevelCommand
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommandsAccess().getHighlevelcommandHighLevelCommandParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_highlevelcommand_16_0=ruleHighLevelCommand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommandsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"highlevelcommand",
                    	    								lv_highlevelcommand_16_0,
                    	    								"diro.geodes.VcsFeatures.HighLevelCommand");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getCommandsAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleHistory"
    // InternalVcsFeatures.g:591:1: entryRuleHistory returns [EObject current=null] : iv_ruleHistory= ruleHistory EOF ;
    public final EObject entryRuleHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistory = null;


        try {
            // InternalVcsFeatures.g:591:48: (iv_ruleHistory= ruleHistory EOF )
            // InternalVcsFeatures.g:592:2: iv_ruleHistory= ruleHistory EOF
            {
             newCompositeNode(grammarAccess.getHistoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHistory=ruleHistory();

            state._fsp--;

             current =iv_ruleHistory; 
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
    // $ANTLR end "entryRuleHistory"


    // $ANTLR start "ruleHistory"
    // InternalVcsFeatures.g:598:1: ruleHistory returns [EObject current=null] : ( () otherlv_1= '-' (otherlv_2= 'labelType' ( (lv_labelType_3_0= ruleLabelType ) ) )? otherlv_4= '-' (otherlv_5= 'commitHistoryRange' ( (lv_commitHistoryRange_6_0= ruleEInt ) ) )? otherlv_7= '-' (otherlv_8= 'numberOfBranches' ( (lv_numberOfBranches_9_0= ruleEInt ) ) )? ) ;
    public final EObject ruleHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_labelType_3_0 = null;

        AntlrDatatypeRuleToken lv_commitHistoryRange_6_0 = null;

        AntlrDatatypeRuleToken lv_numberOfBranches_9_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:604:2: ( ( () otherlv_1= '-' (otherlv_2= 'labelType' ( (lv_labelType_3_0= ruleLabelType ) ) )? otherlv_4= '-' (otherlv_5= 'commitHistoryRange' ( (lv_commitHistoryRange_6_0= ruleEInt ) ) )? otherlv_7= '-' (otherlv_8= 'numberOfBranches' ( (lv_numberOfBranches_9_0= ruleEInt ) ) )? ) )
            // InternalVcsFeatures.g:605:2: ( () otherlv_1= '-' (otherlv_2= 'labelType' ( (lv_labelType_3_0= ruleLabelType ) ) )? otherlv_4= '-' (otherlv_5= 'commitHistoryRange' ( (lv_commitHistoryRange_6_0= ruleEInt ) ) )? otherlv_7= '-' (otherlv_8= 'numberOfBranches' ( (lv_numberOfBranches_9_0= ruleEInt ) ) )? )
            {
            // InternalVcsFeatures.g:605:2: ( () otherlv_1= '-' (otherlv_2= 'labelType' ( (lv_labelType_3_0= ruleLabelType ) ) )? otherlv_4= '-' (otherlv_5= 'commitHistoryRange' ( (lv_commitHistoryRange_6_0= ruleEInt ) ) )? otherlv_7= '-' (otherlv_8= 'numberOfBranches' ( (lv_numberOfBranches_9_0= ruleEInt ) ) )? )
            // InternalVcsFeatures.g:606:3: () otherlv_1= '-' (otherlv_2= 'labelType' ( (lv_labelType_3_0= ruleLabelType ) ) )? otherlv_4= '-' (otherlv_5= 'commitHistoryRange' ( (lv_commitHistoryRange_6_0= ruleEInt ) ) )? otherlv_7= '-' (otherlv_8= 'numberOfBranches' ( (lv_numberOfBranches_9_0= ruleEInt ) ) )?
            {
            // InternalVcsFeatures.g:606:3: ()
            // InternalVcsFeatures.g:607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHistoryAccess().getHistoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getHistoryAccess().getHyphenMinusKeyword_1());
            		
            // InternalVcsFeatures.g:617:3: (otherlv_2= 'labelType' ( (lv_labelType_3_0= ruleLabelType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVcsFeatures.g:618:4: otherlv_2= 'labelType' ( (lv_labelType_3_0= ruleLabelType ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getHistoryAccess().getLabelTypeKeyword_2_0());
                    			
                    // InternalVcsFeatures.g:622:4: ( (lv_labelType_3_0= ruleLabelType ) )
                    // InternalVcsFeatures.g:623:5: (lv_labelType_3_0= ruleLabelType )
                    {
                    // InternalVcsFeatures.g:623:5: (lv_labelType_3_0= ruleLabelType )
                    // InternalVcsFeatures.g:624:6: lv_labelType_3_0= ruleLabelType
                    {

                    						newCompositeNode(grammarAccess.getHistoryAccess().getLabelTypeLabelTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_labelType_3_0=ruleLabelType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHistoryRule());
                    						}
                    						set(
                    							current,
                    							"labelType",
                    							lv_labelType_3_0,
                    							"diro.geodes.VcsFeatures.LabelType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getHistoryAccess().getHyphenMinusKeyword_3());
            		
            // InternalVcsFeatures.g:646:3: (otherlv_5= 'commitHistoryRange' ( (lv_commitHistoryRange_6_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVcsFeatures.g:647:4: otherlv_5= 'commitHistoryRange' ( (lv_commitHistoryRange_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getHistoryAccess().getCommitHistoryRangeKeyword_4_0());
                    			
                    // InternalVcsFeatures.g:651:4: ( (lv_commitHistoryRange_6_0= ruleEInt ) )
                    // InternalVcsFeatures.g:652:5: (lv_commitHistoryRange_6_0= ruleEInt )
                    {
                    // InternalVcsFeatures.g:652:5: (lv_commitHistoryRange_6_0= ruleEInt )
                    // InternalVcsFeatures.g:653:6: lv_commitHistoryRange_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getHistoryAccess().getCommitHistoryRangeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_commitHistoryRange_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHistoryRule());
                    						}
                    						set(
                    							current,
                    							"commitHistoryRange",
                    							lv_commitHistoryRange_6_0,
                    							"diro.geodes.VcsFeatures.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getHistoryAccess().getHyphenMinusKeyword_5());
            		
            // InternalVcsFeatures.g:675:3: (otherlv_8= 'numberOfBranches' ( (lv_numberOfBranches_9_0= ruleEInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVcsFeatures.g:676:4: otherlv_8= 'numberOfBranches' ( (lv_numberOfBranches_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getHistoryAccess().getNumberOfBranchesKeyword_6_0());
                    			
                    // InternalVcsFeatures.g:680:4: ( (lv_numberOfBranches_9_0= ruleEInt ) )
                    // InternalVcsFeatures.g:681:5: (lv_numberOfBranches_9_0= ruleEInt )
                    {
                    // InternalVcsFeatures.g:681:5: (lv_numberOfBranches_9_0= ruleEInt )
                    // InternalVcsFeatures.g:682:6: lv_numberOfBranches_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getHistoryAccess().getNumberOfBranchesEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_numberOfBranches_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHistoryRule());
                    						}
                    						set(
                    							current,
                    							"numberOfBranches",
                    							lv_numberOfBranches_9_0,
                    							"diro.geodes.VcsFeatures.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleHistory"


    // $ANTLR start "entryRuleVersionUnit"
    // InternalVcsFeatures.g:704:1: entryRuleVersionUnit returns [EObject current=null] : iv_ruleVersionUnit= ruleVersionUnit EOF ;
    public final EObject entryRuleVersionUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionUnit = null;


        try {
            // InternalVcsFeatures.g:704:52: (iv_ruleVersionUnit= ruleVersionUnit EOF )
            // InternalVcsFeatures.g:705:2: iv_ruleVersionUnit= ruleVersionUnit EOF
            {
             newCompositeNode(grammarAccess.getVersionUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersionUnit=ruleVersionUnit();

            state._fsp--;

             current =iv_ruleVersionUnit; 
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
    // $ANTLR end "entryRuleVersionUnit"


    // $ANTLR start "ruleVersionUnit"
    // InternalVcsFeatures.g:711:1: ruleVersionUnit returns [EObject current=null] : ( () otherlv_1= '-' (otherlv_2= 'granularity' otherlv_3= '{' ( (lv_granularity_4_0= ruleVersionUnitType ) ) (otherlv_5= ',' ( (lv_granularity_6_0= ruleVersionUnitType ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleVersionUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_granularity_4_0 = null;

        Enumerator lv_granularity_6_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:717:2: ( ( () otherlv_1= '-' (otherlv_2= 'granularity' otherlv_3= '{' ( (lv_granularity_4_0= ruleVersionUnitType ) ) (otherlv_5= ',' ( (lv_granularity_6_0= ruleVersionUnitType ) ) )* otherlv_7= '}' )? ) )
            // InternalVcsFeatures.g:718:2: ( () otherlv_1= '-' (otherlv_2= 'granularity' otherlv_3= '{' ( (lv_granularity_4_0= ruleVersionUnitType ) ) (otherlv_5= ',' ( (lv_granularity_6_0= ruleVersionUnitType ) ) )* otherlv_7= '}' )? )
            {
            // InternalVcsFeatures.g:718:2: ( () otherlv_1= '-' (otherlv_2= 'granularity' otherlv_3= '{' ( (lv_granularity_4_0= ruleVersionUnitType ) ) (otherlv_5= ',' ( (lv_granularity_6_0= ruleVersionUnitType ) ) )* otherlv_7= '}' )? )
            // InternalVcsFeatures.g:719:3: () otherlv_1= '-' (otherlv_2= 'granularity' otherlv_3= '{' ( (lv_granularity_4_0= ruleVersionUnitType ) ) (otherlv_5= ',' ( (lv_granularity_6_0= ruleVersionUnitType ) ) )* otherlv_7= '}' )?
            {
            // InternalVcsFeatures.g:719:3: ()
            // InternalVcsFeatures.g:720:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVersionUnitAccess().getVersionUnitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionUnitAccess().getHyphenMinusKeyword_1());
            		
            // InternalVcsFeatures.g:730:3: (otherlv_2= 'granularity' otherlv_3= '{' ( (lv_granularity_4_0= ruleVersionUnitType ) ) (otherlv_5= ',' ( (lv_granularity_6_0= ruleVersionUnitType ) ) )* otherlv_7= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVcsFeatures.g:731:4: otherlv_2= 'granularity' otherlv_3= '{' ( (lv_granularity_4_0= ruleVersionUnitType ) ) (otherlv_5= ',' ( (lv_granularity_6_0= ruleVersionUnitType ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getVersionUnitAccess().getGranularityKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getVersionUnitAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalVcsFeatures.g:739:4: ( (lv_granularity_4_0= ruleVersionUnitType ) )
                    // InternalVcsFeatures.g:740:5: (lv_granularity_4_0= ruleVersionUnitType )
                    {
                    // InternalVcsFeatures.g:740:5: (lv_granularity_4_0= ruleVersionUnitType )
                    // InternalVcsFeatures.g:741:6: lv_granularity_4_0= ruleVersionUnitType
                    {

                    						newCompositeNode(grammarAccess.getVersionUnitAccess().getGranularityVersionUnitTypeEnumRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_granularity_4_0=ruleVersionUnitType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVersionUnitRule());
                    						}
                    						add(
                    							current,
                    							"granularity",
                    							lv_granularity_4_0,
                    							"diro.geodes.VcsFeatures.VersionUnitType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:758:4: (otherlv_5= ',' ( (lv_granularity_6_0= ruleVersionUnitType ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:759:5: otherlv_5= ',' ( (lv_granularity_6_0= ruleVersionUnitType ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getVersionUnitAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalVcsFeatures.g:763:5: ( (lv_granularity_6_0= ruleVersionUnitType ) )
                    	    // InternalVcsFeatures.g:764:6: (lv_granularity_6_0= ruleVersionUnitType )
                    	    {
                    	    // InternalVcsFeatures.g:764:6: (lv_granularity_6_0= ruleVersionUnitType )
                    	    // InternalVcsFeatures.g:765:7: lv_granularity_6_0= ruleVersionUnitType
                    	    {

                    	    							newCompositeNode(grammarAccess.getVersionUnitAccess().getGranularityVersionUnitTypeEnumRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_granularity_6_0=ruleVersionUnitType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVersionUnitRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"granularity",
                    	    								lv_granularity_6_0,
                    	    								"diro.geodes.VcsFeatures.VersionUnitType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getVersionUnitAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleVersionUnit"


    // $ANTLR start "entryRuleCollaborationStyle"
    // InternalVcsFeatures.g:792:1: entryRuleCollaborationStyle returns [EObject current=null] : iv_ruleCollaborationStyle= ruleCollaborationStyle EOF ;
    public final EObject entryRuleCollaborationStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollaborationStyle = null;


        try {
            // InternalVcsFeatures.g:792:59: (iv_ruleCollaborationStyle= ruleCollaborationStyle EOF )
            // InternalVcsFeatures.g:793:2: iv_ruleCollaborationStyle= ruleCollaborationStyle EOF
            {
             newCompositeNode(grammarAccess.getCollaborationStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollaborationStyle=ruleCollaborationStyle();

            state._fsp--;

             current =iv_ruleCollaborationStyle; 
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
    // $ANTLR end "entryRuleCollaborationStyle"


    // $ANTLR start "ruleCollaborationStyle"
    // InternalVcsFeatures.g:799:1: ruleCollaborationStyle returns [EObject current=null] : ( () otherlv_1= '-' (otherlv_2= 'collabStyle' ( (lv_collabStyle_3_0= ruleCollaborationStyleType ) ) )? ) ;
    public final EObject ruleCollaborationStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_collabStyle_3_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:805:2: ( ( () otherlv_1= '-' (otherlv_2= 'collabStyle' ( (lv_collabStyle_3_0= ruleCollaborationStyleType ) ) )? ) )
            // InternalVcsFeatures.g:806:2: ( () otherlv_1= '-' (otherlv_2= 'collabStyle' ( (lv_collabStyle_3_0= ruleCollaborationStyleType ) ) )? )
            {
            // InternalVcsFeatures.g:806:2: ( () otherlv_1= '-' (otherlv_2= 'collabStyle' ( (lv_collabStyle_3_0= ruleCollaborationStyleType ) ) )? )
            // InternalVcsFeatures.g:807:3: () otherlv_1= '-' (otherlv_2= 'collabStyle' ( (lv_collabStyle_3_0= ruleCollaborationStyleType ) ) )?
            {
            // InternalVcsFeatures.g:807:3: ()
            // InternalVcsFeatures.g:808:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollaborationStyleAccess().getCollaborationStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getCollaborationStyleAccess().getHyphenMinusKeyword_1());
            		
            // InternalVcsFeatures.g:818:3: (otherlv_2= 'collabStyle' ( (lv_collabStyle_3_0= ruleCollaborationStyleType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVcsFeatures.g:819:4: otherlv_2= 'collabStyle' ( (lv_collabStyle_3_0= ruleCollaborationStyleType ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getCollaborationStyleAccess().getCollabStyleKeyword_2_0());
                    			
                    // InternalVcsFeatures.g:823:4: ( (lv_collabStyle_3_0= ruleCollaborationStyleType ) )
                    // InternalVcsFeatures.g:824:5: (lv_collabStyle_3_0= ruleCollaborationStyleType )
                    {
                    // InternalVcsFeatures.g:824:5: (lv_collabStyle_3_0= ruleCollaborationStyleType )
                    // InternalVcsFeatures.g:825:6: lv_collabStyle_3_0= ruleCollaborationStyleType
                    {

                    						newCompositeNode(grammarAccess.getCollaborationStyleAccess().getCollabStyleCollaborationStyleTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_collabStyle_3_0=ruleCollaborationStyleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollaborationStyleRule());
                    						}
                    						set(
                    							current,
                    							"collabStyle",
                    							lv_collabStyle_3_0,
                    							"diro.geodes.VcsFeatures.CollaborationStyleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCollaborationStyle"


    // $ANTLR start "entryRuleDatabase"
    // InternalVcsFeatures.g:847:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalVcsFeatures.g:847:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalVcsFeatures.g:848:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalVcsFeatures.g:854:1: ruleDatabase returns [EObject current=null] : ( () otherlv_1= 'Database' otherlv_2= '-' otherlv_3= 'ConnectionString' ( (lv_connectionString_4_0= ruleEString ) ) otherlv_5= '-' (otherlv_6= 'DatabaseType' ( (lv_DatabaseType_7_0= ruleDatabaseType ) ) )? ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_connectionString_4_0 = null;

        Enumerator lv_DatabaseType_7_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:860:2: ( ( () otherlv_1= 'Database' otherlv_2= '-' otherlv_3= 'ConnectionString' ( (lv_connectionString_4_0= ruleEString ) ) otherlv_5= '-' (otherlv_6= 'DatabaseType' ( (lv_DatabaseType_7_0= ruleDatabaseType ) ) )? ) )
            // InternalVcsFeatures.g:861:2: ( () otherlv_1= 'Database' otherlv_2= '-' otherlv_3= 'ConnectionString' ( (lv_connectionString_4_0= ruleEString ) ) otherlv_5= '-' (otherlv_6= 'DatabaseType' ( (lv_DatabaseType_7_0= ruleDatabaseType ) ) )? )
            {
            // InternalVcsFeatures.g:861:2: ( () otherlv_1= 'Database' otherlv_2= '-' otherlv_3= 'ConnectionString' ( (lv_connectionString_4_0= ruleEString ) ) otherlv_5= '-' (otherlv_6= 'DatabaseType' ( (lv_DatabaseType_7_0= ruleDatabaseType ) ) )? )
            // InternalVcsFeatures.g:862:3: () otherlv_1= 'Database' otherlv_2= '-' otherlv_3= 'ConnectionString' ( (lv_connectionString_4_0= ruleEString ) ) otherlv_5= '-' (otherlv_6= 'DatabaseType' ( (lv_DatabaseType_7_0= ruleDatabaseType ) ) )?
            {
            // InternalVcsFeatures.g:862:3: ()
            // InternalVcsFeatures.g:863:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatabaseAccess().getDatabaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseAccess().getDatabaseKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getHyphenMinusKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDatabaseAccess().getConnectionStringKeyword_3());
            		
            // InternalVcsFeatures.g:881:3: ( (lv_connectionString_4_0= ruleEString ) )
            // InternalVcsFeatures.g:882:4: (lv_connectionString_4_0= ruleEString )
            {
            // InternalVcsFeatures.g:882:4: (lv_connectionString_4_0= ruleEString )
            // InternalVcsFeatures.g:883:5: lv_connectionString_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getConnectionStringEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_connectionString_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"connectionString",
            						lv_connectionString_4_0,
            						"diro.geodes.VcsFeatures.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getDatabaseAccess().getHyphenMinusKeyword_5());
            		
            // InternalVcsFeatures.g:904:3: (otherlv_6= 'DatabaseType' ( (lv_DatabaseType_7_0= ruleDatabaseType ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVcsFeatures.g:905:4: otherlv_6= 'DatabaseType' ( (lv_DatabaseType_7_0= ruleDatabaseType ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getDatabaseAccess().getDatabaseTypeKeyword_6_0());
                    			
                    // InternalVcsFeatures.g:909:4: ( (lv_DatabaseType_7_0= ruleDatabaseType ) )
                    // InternalVcsFeatures.g:910:5: (lv_DatabaseType_7_0= ruleDatabaseType )
                    {
                    // InternalVcsFeatures.g:910:5: (lv_DatabaseType_7_0= ruleDatabaseType )
                    // InternalVcsFeatures.g:911:6: lv_DatabaseType_7_0= ruleDatabaseType
                    {

                    						newCompositeNode(grammarAccess.getDatabaseAccess().getDatabaseTypeDatabaseTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_DatabaseType_7_0=ruleDatabaseType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatabaseRule());
                    						}
                    						set(
                    							current,
                    							"DatabaseType",
                    							lv_DatabaseType_7_0,
                    							"diro.geodes.VcsFeatures.DatabaseType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleEString"
    // InternalVcsFeatures.g:933:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVcsFeatures.g:933:47: (iv_ruleEString= ruleEString EOF )
            // InternalVcsFeatures.g:934:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalVcsFeatures.g:940:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:946:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVcsFeatures.g:947:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVcsFeatures.g:947:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalVcsFeatures.g:948:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:956:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleHighLevelCommand"
    // InternalVcsFeatures.g:967:1: entryRuleHighLevelCommand returns [EObject current=null] : iv_ruleHighLevelCommand= ruleHighLevelCommand EOF ;
    public final EObject entryRuleHighLevelCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighLevelCommand = null;


        try {
            // InternalVcsFeatures.g:967:57: (iv_ruleHighLevelCommand= ruleHighLevelCommand EOF )
            // InternalVcsFeatures.g:968:2: iv_ruleHighLevelCommand= ruleHighLevelCommand EOF
            {
             newCompositeNode(grammarAccess.getHighLevelCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHighLevelCommand=ruleHighLevelCommand();

            state._fsp--;

             current =iv_ruleHighLevelCommand; 
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
    // $ANTLR end "entryRuleHighLevelCommand"


    // $ANTLR start "ruleHighLevelCommand"
    // InternalVcsFeatures.g:974:1: ruleHighLevelCommand returns [EObject current=null] : ( () otherlv_1= 'HighLevelCommand' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'lowlevelcommand' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? ) ;
    public final EObject ruleHighLevelCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:980:2: ( ( () otherlv_1= 'HighLevelCommand' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'lowlevelcommand' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? ) )
            // InternalVcsFeatures.g:981:2: ( () otherlv_1= 'HighLevelCommand' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'lowlevelcommand' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? )
            {
            // InternalVcsFeatures.g:981:2: ( () otherlv_1= 'HighLevelCommand' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'lowlevelcommand' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? )
            // InternalVcsFeatures.g:982:3: () otherlv_1= 'HighLevelCommand' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'lowlevelcommand' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            {
            // InternalVcsFeatures.g:982:3: ()
            // InternalVcsFeatures.g:983:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHighLevelCommandAccess().getHighLevelCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHighLevelCommandAccess().getHighLevelCommandKeyword_1());
            		
            // InternalVcsFeatures.g:993:3: ( (lv_name_2_0= ruleEString ) )
            // InternalVcsFeatures.g:994:4: (lv_name_2_0= ruleEString )
            {
            // InternalVcsFeatures.g:994:4: (lv_name_2_0= ruleEString )
            // InternalVcsFeatures.g:995:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHighLevelCommandAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighLevelCommandRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"diro.geodes.VcsFeatures.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVcsFeatures.g:1012:3: (otherlv_3= 'lowlevelcommand' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVcsFeatures.g:1013:4: otherlv_3= 'lowlevelcommand' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getHighLevelCommandAccess().getLowlevelcommandKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getHighLevelCommandAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalVcsFeatures.g:1021:4: ( ( ruleEString ) )
                    // InternalVcsFeatures.g:1022:5: ( ruleEString )
                    {
                    // InternalVcsFeatures.g:1022:5: ( ruleEString )
                    // InternalVcsFeatures.g:1023:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHighLevelCommandRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:1037:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:1038:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHighLevelCommandAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalVcsFeatures.g:1042:5: ( ( ruleEString ) )
                    	    // InternalVcsFeatures.g:1043:6: ( ruleEString )
                    	    {
                    	    // InternalVcsFeatures.g:1043:6: ( ruleEString )
                    	    // InternalVcsFeatures.g:1044:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHighLevelCommandRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getHighLevelCommandAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleHighLevelCommand"


    // $ANTLR start "entryRuleLowLevelCommand"
    // InternalVcsFeatures.g:1068:1: entryRuleLowLevelCommand returns [EObject current=null] : iv_ruleLowLevelCommand= ruleLowLevelCommand EOF ;
    public final EObject entryRuleLowLevelCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowLevelCommand = null;


        try {
            // InternalVcsFeatures.g:1068:56: (iv_ruleLowLevelCommand= ruleLowLevelCommand EOF )
            // InternalVcsFeatures.g:1069:2: iv_ruleLowLevelCommand= ruleLowLevelCommand EOF
            {
             newCompositeNode(grammarAccess.getLowLevelCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowLevelCommand=ruleLowLevelCommand();

            state._fsp--;

             current =iv_ruleLowLevelCommand; 
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
    // $ANTLR end "entryRuleLowLevelCommand"


    // $ANTLR start "ruleLowLevelCommand"
    // InternalVcsFeatures.g:1075:1: ruleLowLevelCommand returns [EObject current=null] : (otherlv_0= 'LowLevelCommand' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'command' ( (lv_command_4_0= ruleLowCommands ) ) otherlv_5= ')' ) ;
    public final EObject ruleLowLevelCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_command_4_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:1081:2: ( (otherlv_0= 'LowLevelCommand' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'command' ( (lv_command_4_0= ruleLowCommands ) ) otherlv_5= ')' ) )
            // InternalVcsFeatures.g:1082:2: (otherlv_0= 'LowLevelCommand' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'command' ( (lv_command_4_0= ruleLowCommands ) ) otherlv_5= ')' )
            {
            // InternalVcsFeatures.g:1082:2: (otherlv_0= 'LowLevelCommand' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'command' ( (lv_command_4_0= ruleLowCommands ) ) otherlv_5= ')' )
            // InternalVcsFeatures.g:1083:3: otherlv_0= 'LowLevelCommand' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= 'command' ( (lv_command_4_0= ruleLowCommands ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLowLevelCommandAccess().getLowLevelCommandKeyword_0());
            		
            // InternalVcsFeatures.g:1087:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVcsFeatures.g:1088:4: (lv_name_1_0= ruleEString )
            {
            // InternalVcsFeatures.g:1088:4: (lv_name_1_0= ruleEString )
            // InternalVcsFeatures.g:1089:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLowLevelCommandAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowLevelCommandRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"diro.geodes.VcsFeatures.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getLowLevelCommandAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getLowLevelCommandAccess().getCommandKeyword_3());
            		
            // InternalVcsFeatures.g:1114:3: ( (lv_command_4_0= ruleLowCommands ) )
            // InternalVcsFeatures.g:1115:4: (lv_command_4_0= ruleLowCommands )
            {
            // InternalVcsFeatures.g:1115:4: (lv_command_4_0= ruleLowCommands )
            // InternalVcsFeatures.g:1116:5: lv_command_4_0= ruleLowCommands
            {

            					newCompositeNode(grammarAccess.getLowLevelCommandAccess().getCommandLowCommandsEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_command_4_0=ruleLowCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowLevelCommandRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_4_0,
            						"diro.geodes.VcsFeatures.LowCommands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLowLevelCommandAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleLowLevelCommand"


    // $ANTLR start "entryRuleEInt"
    // InternalVcsFeatures.g:1141:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalVcsFeatures.g:1141:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalVcsFeatures.g:1142:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalVcsFeatures.g:1148:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1154:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalVcsFeatures.g:1155:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalVcsFeatures.g:1155:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalVcsFeatures.g:1156:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalVcsFeatures.g:1156:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVcsFeatures.g:1157:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_38); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleMergeStrategy"
    // InternalVcsFeatures.g:1174:1: ruleMergeStrategy returns [Enumerator current=null] : ( (enumLiteral_0= 'DSMCompare' ) | (enumLiteral_1= 'GitDiff' ) ) ;
    public final Enumerator ruleMergeStrategy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1180:2: ( ( (enumLiteral_0= 'DSMCompare' ) | (enumLiteral_1= 'GitDiff' ) ) )
            // InternalVcsFeatures.g:1181:2: ( (enumLiteral_0= 'DSMCompare' ) | (enumLiteral_1= 'GitDiff' ) )
            {
            // InternalVcsFeatures.g:1181:2: ( (enumLiteral_0= 'DSMCompare' ) | (enumLiteral_1= 'GitDiff' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            else if ( (LA27_0==38) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalVcsFeatures.g:1182:3: (enumLiteral_0= 'DSMCompare' )
                    {
                    // InternalVcsFeatures.g:1182:3: (enumLiteral_0= 'DSMCompare' )
                    // InternalVcsFeatures.g:1183:4: enumLiteral_0= 'DSMCompare'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getMergeStrategyAccess().getDSMCompareEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMergeStrategyAccess().getDSMCompareEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1190:3: (enumLiteral_1= 'GitDiff' )
                    {
                    // InternalVcsFeatures.g:1190:3: (enumLiteral_1= 'GitDiff' )
                    // InternalVcsFeatures.g:1191:4: enumLiteral_1= 'GitDiff'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getMergeStrategyAccess().getGitDiffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMergeStrategyAccess().getGitDiffEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMergeStrategy"


    // $ANTLR start "ruleLowCommands"
    // InternalVcsFeatures.g:1201:1: ruleLowCommands returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Checkout' ) | (enumLiteral_2= 'CheckoutCreate' ) | (enumLiteral_3= 'Clone' ) | (enumLiteral_4= 'Commit' ) | (enumLiteral_5= 'CherryPick' ) | (enumLiteral_6= 'CreateBranch' ) | (enumLiteral_7= 'Fetch' ) | (enumLiteral_8= 'Init' ) | (enumLiteral_9= 'Pull' ) | (enumLiteral_10= 'Push' ) | (enumLiteral_11= 'RemoteAdd' ) | (enumLiteral_12= 'Rm' ) | (enumLiteral_13= 'Log' ) | (enumLiteral_14= 'Open' ) ) ;
    public final Enumerator ruleLowCommands() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1207:2: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Checkout' ) | (enumLiteral_2= 'CheckoutCreate' ) | (enumLiteral_3= 'Clone' ) | (enumLiteral_4= 'Commit' ) | (enumLiteral_5= 'CherryPick' ) | (enumLiteral_6= 'CreateBranch' ) | (enumLiteral_7= 'Fetch' ) | (enumLiteral_8= 'Init' ) | (enumLiteral_9= 'Pull' ) | (enumLiteral_10= 'Push' ) | (enumLiteral_11= 'RemoteAdd' ) | (enumLiteral_12= 'Rm' ) | (enumLiteral_13= 'Log' ) | (enumLiteral_14= 'Open' ) ) )
            // InternalVcsFeatures.g:1208:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Checkout' ) | (enumLiteral_2= 'CheckoutCreate' ) | (enumLiteral_3= 'Clone' ) | (enumLiteral_4= 'Commit' ) | (enumLiteral_5= 'CherryPick' ) | (enumLiteral_6= 'CreateBranch' ) | (enumLiteral_7= 'Fetch' ) | (enumLiteral_8= 'Init' ) | (enumLiteral_9= 'Pull' ) | (enumLiteral_10= 'Push' ) | (enumLiteral_11= 'RemoteAdd' ) | (enumLiteral_12= 'Rm' ) | (enumLiteral_13= 'Log' ) | (enumLiteral_14= 'Open' ) )
            {
            // InternalVcsFeatures.g:1208:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Checkout' ) | (enumLiteral_2= 'CheckoutCreate' ) | (enumLiteral_3= 'Clone' ) | (enumLiteral_4= 'Commit' ) | (enumLiteral_5= 'CherryPick' ) | (enumLiteral_6= 'CreateBranch' ) | (enumLiteral_7= 'Fetch' ) | (enumLiteral_8= 'Init' ) | (enumLiteral_9= 'Pull' ) | (enumLiteral_10= 'Push' ) | (enumLiteral_11= 'RemoteAdd' ) | (enumLiteral_12= 'Rm' ) | (enumLiteral_13= 'Log' ) | (enumLiteral_14= 'Open' ) )
            int alt28=15;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt28=1;
                }
                break;
            case 40:
                {
                alt28=2;
                }
                break;
            case 41:
                {
                alt28=3;
                }
                break;
            case 42:
                {
                alt28=4;
                }
                break;
            case 43:
                {
                alt28=5;
                }
                break;
            case 44:
                {
                alt28=6;
                }
                break;
            case 45:
                {
                alt28=7;
                }
                break;
            case 46:
                {
                alt28=8;
                }
                break;
            case 47:
                {
                alt28=9;
                }
                break;
            case 48:
                {
                alt28=10;
                }
                break;
            case 49:
                {
                alt28=11;
                }
                break;
            case 50:
                {
                alt28=12;
                }
                break;
            case 51:
                {
                alt28=13;
                }
                break;
            case 52:
                {
                alt28=14;
                }
                break;
            case 53:
                {
                alt28=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalVcsFeatures.g:1209:3: (enumLiteral_0= 'Add' )
                    {
                    // InternalVcsFeatures.g:1209:3: (enumLiteral_0= 'Add' )
                    // InternalVcsFeatures.g:1210:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLowCommandsAccess().getAddEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1217:3: (enumLiteral_1= 'Checkout' )
                    {
                    // InternalVcsFeatures.g:1217:3: (enumLiteral_1= 'Checkout' )
                    // InternalVcsFeatures.g:1218:4: enumLiteral_1= 'Checkout'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCheckoutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLowCommandsAccess().getCheckoutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:1225:3: (enumLiteral_2= 'CheckoutCreate' )
                    {
                    // InternalVcsFeatures.g:1225:3: (enumLiteral_2= 'CheckoutCreate' )
                    // InternalVcsFeatures.g:1226:4: enumLiteral_2= 'CheckoutCreate'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCheckoutCreateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLowCommandsAccess().getCheckoutCreateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVcsFeatures.g:1233:3: (enumLiteral_3= 'Clone' )
                    {
                    // InternalVcsFeatures.g:1233:3: (enumLiteral_3= 'Clone' )
                    // InternalVcsFeatures.g:1234:4: enumLiteral_3= 'Clone'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCloneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLowCommandsAccess().getCloneEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVcsFeatures.g:1241:3: (enumLiteral_4= 'Commit' )
                    {
                    // InternalVcsFeatures.g:1241:3: (enumLiteral_4= 'Commit' )
                    // InternalVcsFeatures.g:1242:4: enumLiteral_4= 'Commit'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCommitEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLowCommandsAccess().getCommitEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVcsFeatures.g:1249:3: (enumLiteral_5= 'CherryPick' )
                    {
                    // InternalVcsFeatures.g:1249:3: (enumLiteral_5= 'CherryPick' )
                    // InternalVcsFeatures.g:1250:4: enumLiteral_5= 'CherryPick'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCherryPickEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getLowCommandsAccess().getCherryPickEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVcsFeatures.g:1257:3: (enumLiteral_6= 'CreateBranch' )
                    {
                    // InternalVcsFeatures.g:1257:3: (enumLiteral_6= 'CreateBranch' )
                    // InternalVcsFeatures.g:1258:4: enumLiteral_6= 'CreateBranch'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCreateBranchEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getLowCommandsAccess().getCreateBranchEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVcsFeatures.g:1265:3: (enumLiteral_7= 'Fetch' )
                    {
                    // InternalVcsFeatures.g:1265:3: (enumLiteral_7= 'Fetch' )
                    // InternalVcsFeatures.g:1266:4: enumLiteral_7= 'Fetch'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getFetchEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getLowCommandsAccess().getFetchEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVcsFeatures.g:1273:3: (enumLiteral_8= 'Init' )
                    {
                    // InternalVcsFeatures.g:1273:3: (enumLiteral_8= 'Init' )
                    // InternalVcsFeatures.g:1274:4: enumLiteral_8= 'Init'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getInitEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getLowCommandsAccess().getInitEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalVcsFeatures.g:1281:3: (enumLiteral_9= 'Pull' )
                    {
                    // InternalVcsFeatures.g:1281:3: (enumLiteral_9= 'Pull' )
                    // InternalVcsFeatures.g:1282:4: enumLiteral_9= 'Pull'
                    {
                    enumLiteral_9=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getPullEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getLowCommandsAccess().getPullEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalVcsFeatures.g:1289:3: (enumLiteral_10= 'Push' )
                    {
                    // InternalVcsFeatures.g:1289:3: (enumLiteral_10= 'Push' )
                    // InternalVcsFeatures.g:1290:4: enumLiteral_10= 'Push'
                    {
                    enumLiteral_10=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getPushEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getLowCommandsAccess().getPushEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalVcsFeatures.g:1297:3: (enumLiteral_11= 'RemoteAdd' )
                    {
                    // InternalVcsFeatures.g:1297:3: (enumLiteral_11= 'RemoteAdd' )
                    // InternalVcsFeatures.g:1298:4: enumLiteral_11= 'RemoteAdd'
                    {
                    enumLiteral_11=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getRemoteAddEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getLowCommandsAccess().getRemoteAddEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalVcsFeatures.g:1305:3: (enumLiteral_12= 'Rm' )
                    {
                    // InternalVcsFeatures.g:1305:3: (enumLiteral_12= 'Rm' )
                    // InternalVcsFeatures.g:1306:4: enumLiteral_12= 'Rm'
                    {
                    enumLiteral_12=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getRmEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getLowCommandsAccess().getRmEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalVcsFeatures.g:1313:3: (enumLiteral_13= 'Log' )
                    {
                    // InternalVcsFeatures.g:1313:3: (enumLiteral_13= 'Log' )
                    // InternalVcsFeatures.g:1314:4: enumLiteral_13= 'Log'
                    {
                    enumLiteral_13=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getLogEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getLowCommandsAccess().getLogEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalVcsFeatures.g:1321:3: (enumLiteral_14= 'Open' )
                    {
                    // InternalVcsFeatures.g:1321:3: (enumLiteral_14= 'Open' )
                    // InternalVcsFeatures.g:1322:4: enumLiteral_14= 'Open'
                    {
                    enumLiteral_14=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getOpenEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getLowCommandsAccess().getOpenEnumLiteralDeclaration_14());
                    			

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
    // $ANTLR end "ruleLowCommands"


    // $ANTLR start "ruleLabelType"
    // InternalVcsFeatures.g:1332:1: ruleLabelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Unique' ) | (enumLiteral_1= 'CommitHash' ) | (enumLiteral_2= 'Label' ) ) ;
    public final Enumerator ruleLabelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1338:2: ( ( (enumLiteral_0= 'Unique' ) | (enumLiteral_1= 'CommitHash' ) | (enumLiteral_2= 'Label' ) ) )
            // InternalVcsFeatures.g:1339:2: ( (enumLiteral_0= 'Unique' ) | (enumLiteral_1= 'CommitHash' ) | (enumLiteral_2= 'Label' ) )
            {
            // InternalVcsFeatures.g:1339:2: ( (enumLiteral_0= 'Unique' ) | (enumLiteral_1= 'CommitHash' ) | (enumLiteral_2= 'Label' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt29=1;
                }
                break;
            case 55:
                {
                alt29=2;
                }
                break;
            case 56:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalVcsFeatures.g:1340:3: (enumLiteral_0= 'Unique' )
                    {
                    // InternalVcsFeatures.g:1340:3: (enumLiteral_0= 'Unique' )
                    // InternalVcsFeatures.g:1341:4: enumLiteral_0= 'Unique'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getLabelTypeAccess().getUniqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLabelTypeAccess().getUniqueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1348:3: (enumLiteral_1= 'CommitHash' )
                    {
                    // InternalVcsFeatures.g:1348:3: (enumLiteral_1= 'CommitHash' )
                    // InternalVcsFeatures.g:1349:4: enumLiteral_1= 'CommitHash'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getLabelTypeAccess().getCommitHashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLabelTypeAccess().getCommitHashEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:1356:3: (enumLiteral_2= 'Label' )
                    {
                    // InternalVcsFeatures.g:1356:3: (enumLiteral_2= 'Label' )
                    // InternalVcsFeatures.g:1357:4: enumLiteral_2= 'Label'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getLabelTypeAccess().getLabelEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLabelTypeAccess().getLabelEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleLabelType"


    // $ANTLR start "ruleVersionUnitType"
    // InternalVcsFeatures.g:1367:1: ruleVersionUnitType returns [Enumerator current=null] : ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'Semantic' ) | (enumLiteral_2= 'File' ) | (enumLiteral_3= 'Element' ) ) ;
    public final Enumerator ruleVersionUnitType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1373:2: ( ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'Semantic' ) | (enumLiteral_2= 'File' ) | (enumLiteral_3= 'Element' ) ) )
            // InternalVcsFeatures.g:1374:2: ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'Semantic' ) | (enumLiteral_2= 'File' ) | (enumLiteral_3= 'Element' ) )
            {
            // InternalVcsFeatures.g:1374:2: ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'Semantic' ) | (enumLiteral_2= 'File' ) | (enumLiteral_3= 'Element' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt30=1;
                }
                break;
            case 58:
                {
                alt30=2;
                }
                break;
            case 59:
                {
                alt30=3;
                }
                break;
            case 60:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalVcsFeatures.g:1375:3: (enumLiteral_0= 'Line' )
                    {
                    // InternalVcsFeatures.g:1375:3: (enumLiteral_0= 'Line' )
                    // InternalVcsFeatures.g:1376:4: enumLiteral_0= 'Line'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getVersionUnitTypeAccess().getLineEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVersionUnitTypeAccess().getLineEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1383:3: (enumLiteral_1= 'Semantic' )
                    {
                    // InternalVcsFeatures.g:1383:3: (enumLiteral_1= 'Semantic' )
                    // InternalVcsFeatures.g:1384:4: enumLiteral_1= 'Semantic'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getVersionUnitTypeAccess().getSemanticEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVersionUnitTypeAccess().getSemanticEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:1391:3: (enumLiteral_2= 'File' )
                    {
                    // InternalVcsFeatures.g:1391:3: (enumLiteral_2= 'File' )
                    // InternalVcsFeatures.g:1392:4: enumLiteral_2= 'File'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVersionUnitTypeAccess().getFileEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVersionUnitTypeAccess().getFileEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVcsFeatures.g:1399:3: (enumLiteral_3= 'Element' )
                    {
                    // InternalVcsFeatures.g:1399:3: (enumLiteral_3= 'Element' )
                    // InternalVcsFeatures.g:1400:4: enumLiteral_3= 'Element'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getVersionUnitTypeAccess().getElementEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVersionUnitTypeAccess().getElementEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleVersionUnitType"


    // $ANTLR start "ruleCollaborationStyleType"
    // InternalVcsFeatures.g:1410:1: ruleCollaborationStyleType returns [Enumerator current=null] : ( (enumLiteral_0= 'LocalOnly' ) | (enumLiteral_1= 'Remote' ) ) ;
    public final Enumerator ruleCollaborationStyleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1416:2: ( ( (enumLiteral_0= 'LocalOnly' ) | (enumLiteral_1= 'Remote' ) ) )
            // InternalVcsFeatures.g:1417:2: ( (enumLiteral_0= 'LocalOnly' ) | (enumLiteral_1= 'Remote' ) )
            {
            // InternalVcsFeatures.g:1417:2: ( (enumLiteral_0= 'LocalOnly' ) | (enumLiteral_1= 'Remote' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==61) ) {
                alt31=1;
            }
            else if ( (LA31_0==62) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalVcsFeatures.g:1418:3: (enumLiteral_0= 'LocalOnly' )
                    {
                    // InternalVcsFeatures.g:1418:3: (enumLiteral_0= 'LocalOnly' )
                    // InternalVcsFeatures.g:1419:4: enumLiteral_0= 'LocalOnly'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getCollaborationStyleTypeAccess().getLocalOnlyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCollaborationStyleTypeAccess().getLocalOnlyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1426:3: (enumLiteral_1= 'Remote' )
                    {
                    // InternalVcsFeatures.g:1426:3: (enumLiteral_1= 'Remote' )
                    // InternalVcsFeatures.g:1427:4: enumLiteral_1= 'Remote'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getCollaborationStyleTypeAccess().getRemoteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCollaborationStyleTypeAccess().getRemoteEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCollaborationStyleType"


    // $ANTLR start "ruleDatabaseType"
    // InternalVcsFeatures.g:1437:1: ruleDatabaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'MongoDB' ) | (enumLiteral_1= 'XMI' ) | (enumLiteral_2= 'Neo4J' ) | (enumLiteral_3= 'SQL' ) ) ;
    public final Enumerator ruleDatabaseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1443:2: ( ( (enumLiteral_0= 'MongoDB' ) | (enumLiteral_1= 'XMI' ) | (enumLiteral_2= 'Neo4J' ) | (enumLiteral_3= 'SQL' ) ) )
            // InternalVcsFeatures.g:1444:2: ( (enumLiteral_0= 'MongoDB' ) | (enumLiteral_1= 'XMI' ) | (enumLiteral_2= 'Neo4J' ) | (enumLiteral_3= 'SQL' ) )
            {
            // InternalVcsFeatures.g:1444:2: ( (enumLiteral_0= 'MongoDB' ) | (enumLiteral_1= 'XMI' ) | (enumLiteral_2= 'Neo4J' ) | (enumLiteral_3= 'SQL' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt32=1;
                }
                break;
            case 64:
                {
                alt32=2;
                }
                break;
            case 65:
                {
                alt32=3;
                }
                break;
            case 66:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalVcsFeatures.g:1445:3: (enumLiteral_0= 'MongoDB' )
                    {
                    // InternalVcsFeatures.g:1445:3: (enumLiteral_0= 'MongoDB' )
                    // InternalVcsFeatures.g:1446:4: enumLiteral_0= 'MongoDB'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseTypeAccess().getMongoDBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatabaseTypeAccess().getMongoDBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1453:3: (enumLiteral_1= 'XMI' )
                    {
                    // InternalVcsFeatures.g:1453:3: (enumLiteral_1= 'XMI' )
                    // InternalVcsFeatures.g:1454:4: enumLiteral_1= 'XMI'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseTypeAccess().getXMIEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatabaseTypeAccess().getXMIEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:1461:3: (enumLiteral_2= 'Neo4J' )
                    {
                    // InternalVcsFeatures.g:1461:3: (enumLiteral_2= 'Neo4J' )
                    // InternalVcsFeatures.g:1462:4: enumLiteral_2= 'Neo4J'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseTypeAccess().getNeo4JEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatabaseTypeAccess().getNeo4JEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVcsFeatures.g:1469:3: (enumLiteral_3= 'SQL' )
                    {
                    // InternalVcsFeatures.g:1469:3: (enumLiteral_3= 'SQL' )
                    // InternalVcsFeatures.g:1470:4: enumLiteral_3= 'SQL'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseTypeAccess().getSQLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDatabaseTypeAccess().getSQLEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDatabaseType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x003FFF8000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});

}