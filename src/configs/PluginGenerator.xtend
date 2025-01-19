package configs

import org.eclipse.emf.ecore.resource.Resource
import vcsFeaturesMM.LowLevelCommand

class PluginGenerator implements ConfigGenerator{
	
	override generate(Resource resource) {
		'''
		<?xml version="1.0" encoding="UTF-8"?>
		<?eclipse version="3.4"?>
		<plugin>
		
		   <extension
		         id="product"
		         point="org.eclipse.core.runtime.products">
		      <product
		            application="org.eclipse.e4.ui.workbench.swt.E4Application"
		            name="vcsfeatures">
		         <property
		               name="applicationCSS"
		               value="platform:/plugin/VCSFeatures/css/default.css">
		         </property>
		      </product>
		   </extension>
		
		<extension
		         point="org.eclipse.ui.commands">
		      <category
		            id="VCSFeatures.commands.category"
		            name="Sample Category">
		      </category>
		      <category
		            id="VCSFeatures.uiCommands"
		            name="UI Commands">
		      </category>
		      <command
		            categoryId="VCSFeatures.commands.category"
		            description="This command is used to rename JGit commands (give aliases)"
		            id="VCSFeatures.commands.renameCommand"
		            name="Rename Command">
		      </command>
		      «FOR llc : resource.allContents.filter(LowLevelCommand).toIterable»
		      <command
		            categoryId="VCSFeatures.uiCommands"
		            id="VCSFeatures.«llc.command.getName»"
		            name="«llc.name»">
		      </command>
		      «ENDFOR»
		   </extension>
		   <extension
		         point="org.eclipse.ui.handlers">
		      <handler
		            class="handlers.RenameHandler"
		            commandId="VCSFeatures.commands.renameCommand">
		      </handler>
		      «FOR llc : resource.allContents.filter(LowLevelCommand).toIterable»
			<handler			
				class="handlers.«llc.command.getName.split("Command").get(0) + "Handler"»"
				commandId="VCSFeatures.«llc.command.getName»">
			</handler>
  		      «ENDFOR»
		   </extension>
		   <extension
		            point="org.eclipse.ui.menus">
		   		<menuContribution
		               allPopups="false"
		               locationURI="popup:org.eclipse.ui.popup.any?after=additions">
		            <menu
		                  id="org.eclipse.ui.navigator.ProjectExplorer.VCSBuilder"
		                  label="VCSBuilder">
		                  «FOR llc : resource.allContents.filter(LowLevelCommand).toIterable»
		               <command
		                     commandId="VCSFeatures.«llc.command.getName»"
		                     label="«llc.name»"
		                     style="push">
		               </command>
            		      «ENDFOR»
		            </menu>
		         </menuContribution>
			</extension>
		</plugin>

		'''
	}
	
}