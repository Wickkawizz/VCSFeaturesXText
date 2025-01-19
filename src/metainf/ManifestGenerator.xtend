package metainf

class ManifestGenerator {
	def generate()
	'''
	Manifest-Version: 1.0
	Bundle-ManifestVersion: 2
	Bundle-Name: VCSFeatures««« TODO Change this for the name of the app when collected
	Bundle-SymbolicName: VCSFeatures;singleton:=true
	Bundle-Version: 1.0.0.qualifier
	Bundle-Activator: vcsfeatures.Activator««« TODO Change this for the name of the app when collected
	Require-Bundle: org.eclipse.swt,
	 org.eclipse.e4.ui.model.workbench,
	 org.eclipse.jface,
	 org.eclipse.e4.ui.services,
	 org.eclipse.e4.ui.workbench,
	 org.eclipse.e4.core.di,
	 org.eclipse.e4.ui.di,
	 org.eclipse.e4.core.contexts,
	 org.eclipse.core.runtime,
	 org.eclipse.ui,
	 org.eclipse.jgit
	Bundle-RequiredExecutionEnvironment: JavaSE-21
	Automatic-Module-Name: VCSFeatures««« TODO Change this for the name of the app when collected
	Import-Package: jakarta.annotation;version="[2.1.0,3.0.0)",
	 jakarta.inject;version="[2.0.0,3.0.0)",
	 org.eclipse.core.resources
	Bundle-ActivationPolicy: lazy
	'''
}