package metainf;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ManifestGenerator {
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Manifest-Version: 1.0");
    _builder.newLine();
    _builder.append("Bundle-ManifestVersion: 2");
    _builder.newLine();
    _builder.append("Bundle-Name: VCSFeatures");
    _builder.append("\tBundle-SymbolicName: VCSFeatures;singleton:=true");
    _builder.newLine();
    _builder.append("Bundle-Version: 1.0.0.qualifier");
    _builder.newLine();
    _builder.append("Bundle-Activator: vcsfeatures.Activator");
    _builder.append("\tRequire-Bundle: org.eclipse.swt,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.e4.ui.model.workbench,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.jface,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.e4.ui.services,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.e4.ui.workbench,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.e4.core.di,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.e4.ui.di,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.e4.core.contexts,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.core.runtime,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.ui,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.jgit");
    _builder.newLine();
    _builder.append("Bundle-RequiredExecutionEnvironment: JavaSE-21");
    _builder.newLine();
    _builder.append("Automatic-Module-Name: VCSFeatures");
    _builder.append("\tImport-Package: jakarta.annotation;version=\"[2.1.0,3.0.0)\",");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("jakarta.inject;version=\"[2.0.0,3.0.0)\",");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("org.eclipse.core.resources");
    _builder.newLine();
    _builder.append("Bundle-ActivationPolicy: lazy");
    _builder.newLine();
    return _builder;
  }
}
