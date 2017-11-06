# ExplorViz Backend Dummy Extension

This repository holds a dummy extension for [ExplorViz Backend](https://github.com/ExplorViz/explorviz-backend). Use it as a starting point for your future extension

### Eclipse Setup
1. Download the latest **Eclipse IDE for Java and DSL Developers** and Java SDK 8
2. *Start Eclipse -> Help -> Eclipse Marketplace*, insert and download
- *eclipse-pmd 1.10*
- *SpotBugs Eclipse plugin 3.1.0*
- *Checkstyle Plug-in 8.0.0*

## Setup Development / Usage (Recommended)
This procedure will save the configs of *Checkstyle, Findbugs, PMD* and the *Eclipse Save Action*. Please use the following steps to set up your development.

1. Clone this repository (e.g. for SSH `git clone git@github.com:ExplorViz/explorviz-backend-extension-dummy.git`)
2. Set remote URL to the URL of your assigned repository (e.g. for SSH `git remote set-url origin git@github.com:ExplorViz/explorviz-backend-extension-X.git`)
3. Rename the string *dummy* to your extension name X in
- Root folder name
- settings.gradle
- .project (invisible file, dependent on your OS settings)
4. Adjust the README.md (e.g. remove Setup sections)
5. Stage and commit changes with `git commit -am "renaming dummy"`
6. Push to remote origin and set upstream with `git push -u origin master`
7. Follow the [Eclipse Setup](https://github.com/ExplorViz/explorviz-backend-extension-dummy#eclipse-setup)
8. In Eclipse: *Import -> Gradle -> Existing Gradle Project*
9. Start your development
10. Start the embedded web server with Gradle task *gretty -> appStart*

## Setup Development / Usage (Old procedure)
1. Download this repository and unpack the .zip file
2. Clone your own empty git repository (created by advisor)
3. Move the content of the unzipped folder to your cloned repository. Copy the (most of the time) invisible *.gitignore* file as well!
4. Follow the [Eclipse Setup](https://github.com/ExplorViz/explorviz-backend-extension-dummy#eclipse-setup)
5. In Eclipse: *Import -> Gradle -> Existing Gradle Project*
6. In Eclipse: Rename *dummy* in...
- *settings.gradle*
- *src/main/java/net/explorviz/extension* (Right click -> Refactor -> Rename)
7. Start with Gradle task *gretty -> appStart*
