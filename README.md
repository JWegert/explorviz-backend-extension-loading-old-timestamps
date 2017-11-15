# ExplorViz Backend Dummy Extension

This repository holds a dummy extension for [ExplorViz Backend](https://github.com/ExplorViz/explorviz-backend). Use it as a starting point for your future extension

### Eclipse Setup
1. Download the latest **Eclipse IDE for Java and DSL Developers** and Java SDK 8
2. *Start Eclipse -> Help -> Eclipse Marketplace*, insert and download
- *SpotBugs Eclipse plugin 3.1.0*
- *Checkstyle Plug-in 8.0.0*
3. In Eclipse: *Help -> Install New Software -> Insert https://dl.bintray.com/pmd/pmd-eclipse-plugin/updates/ in "Work with" -> Check "PMD for Eclipse 4" -> Finish and download* (**Attention:** Don't use the eclipse-pmd version from the marketplace)
4. In Eclipse: *Window -> Show View -> Other...* to open the following views
- *Checkstyle violations*
- *PMD Violations Overview*
- *SpotBugs Bug Explorer*

## Setup Development / Usage
This procedure will save the configs of *Checkstyle, Findbugs, PMD* and the *Eclipse Save Action*. Please use the following steps to set up your development.

1. Clone this repository (e.g. for SSH `git clone git@github.com:ExplorViz/explorviz-backend-extension-dummy.git`)
2. Set remote URL to the URL of your assigned repository (e.g. for SSH `git remote set-url origin git@github.com:ExplorViz/explorviz-backend-extension-X.git`)
3. Rename the root folder *explorviz-backend-extension-dummy* to *explorviz-backend-extension-X*, where X is the name of your extension
4. Run `./gradlew renameProject -PextensionName="X"`, where X is the name of your extension
4. Adjust the README.md (e.g. remove Setup sections)
5. Stage and commit changes with `git commit -am "renaming dummy"`
6. Push to remote origin and set upstream with `git push -u origin master`
7. Follow the [Eclipse Setup](https://github.com/ExplorViz/explorviz-backend-extension-dummy#eclipse-setup)
8. In Eclipse: *Import -> Gradle -> Existing Gradle Project*
9. Start your development
10. Start the embedded web server with Gradle task *gretty -> appStart*
