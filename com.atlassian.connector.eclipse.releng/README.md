# Patchs

## Build on MacOS

Use this URL for Mac OS builds : http://www.eclipse.org/downloads/download.php?file=/eclipse/downloads/drops/R-3.7-201106131736/eclipse-SDK-3.7-macosx-carbon.tar.gz

## Update for Eclipse 4.8 Photon and Mylyn 3.24

On windows set git to use long file names:

	git config core.longpaths true

## Problems

```
15. ERROR in /Users/lmaitre/Workspaces/Forge/connector-eclipse/com.atlassian.connector.eclipse.releng/build/4.8/plugins/org.eclipse.mylyn.commons.core/src/org/eclipse/mylyn/commons/core/operations/MonitoredOperation.java (at line 78)
	public boolean isCanceled() {
	               ^^^^^^^^^^^^
The method isCanceled() of type MonitoredOperation<T> must override a superclass method
!SESSION 2018-08-21 19:17:07.173 -----------------------------------------------
eclipse.buildId=4.8.0.I20180611-0500
java.version=1.8.0_152
java.vendor=Oracle Corporation
BootLoader constants: OS=macosx, ARCH=x86_64, WS=cocoa, NL=fr_FR
Framework arguments:  -application org.eclipse.ant.core.antRunner -buildfile /Users/lmaitre/Workspaces/Forge/connector-eclipse/tools/sdk-4.8/eclipse/plugins/org.eclipse.pde.build_3.10.0.v20180512-1217/scripts/build.xml -DbaseLocation=/Users/lmaitre/Workspaces/Forge/connector-eclipse/com.atlassian.connector.eclipse.releng/../tools/sdk-4.8/eclipse -Dbuilder=/Users/lmaitre/Workspaces/Forge/connector-eclipse/com.atlassian.connector.eclipse.releng/config -DbuildDirectory=/Users/lmaitre/Workspaces/Forge/connector-eclipse/com.atlassian.connector.eclipse.releng/build/4.8 -DbuildLabel=dist -DforceContextQualifier=I20180815-1200 -DmajorVersion=3.2.3 -Dbuild.target=4.8 -Dbuild.publish.name=Atlassian Connector Nightly for Eclipse -DskipBuildWithClover=true -Dclover.license.path=${clover.license.path} -DnoSkipFetch=true -Dnoextrabuildargs=true
Command-line arguments:  -consolelog -data /Users/lmaitre/Workspaces/Forge/connector-eclipse/com.atlassian.connector.eclipse.releng/build/workspace -clean -application org.eclipse.ant.core.antRunner -buildfile /Users/lmaitre/Workspaces/Forge/connector-eclipse/tools/sdk-4.8/eclipse/plugins/org.eclipse.pde.build_3.10.0.v20180512-1217/scripts/build.xml -DbaseLocation=/Users/lmaitre/Workspaces/Forge/connector-eclipse/com.atlassian.connector.eclipse.releng/../tools/sdk-4.8/eclipse -Dbuilder=/Users/lmaitre/Workspaces/Forge/connector-eclipse/com.atlassian.connector.eclipse.releng/config -DbuildDirectory=/Users/lmaitre/Workspaces/Forge/connector-eclipse/com.atlassian.connector.eclipse.releng/build/4.8 -DbuildLabel=dist -DforceContextQualifier=I20180815-1200 -DmajorVersion=3.2.3 -Dbuild.target=4.8 -Dbuild.publish.name=Atlassian Connector Nightly for Eclipse -DskipBuildWithClover=true -Dclover.license.path=${clover.license.path} -DnoSkipFetch=true -Dnoextrabuildargs=true
```

I have set the JDK version to 1.8 and it goes further.

The major version should be incremented in version 3.0.24, since API breakage occurred since version 3.0.19

The target platform have wikitext 3.0.19, and i try to install 3.0.24 inside : use 3.0.19 branch instead.

# Usage

Build:

    ant build all

# References

- https://wiki.eclipse.org/Mylyn/Integrator_Reference
- [Orbit for Photon](http://download.eclipse.org/tools/orbit/downloads/drops/R20180606145124/?d)
- [Mylyn repositories](http://git.eclipse.org/c/mylyn/)

eclipse pde Compatibility Problem The type has been removed from 