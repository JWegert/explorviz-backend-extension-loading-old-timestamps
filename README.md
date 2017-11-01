# ExplorViz Backend Dummy Extension

This repository holds a dummy extension for [ExplorViz Backend](https://github.com/ExplorViz/explorviz-backend). Use it as a starting point for your future extension

### Eclipse Setup
1. Download the latest **Eclipse IDE for Java and DSL Developers** and Java SDK 8
2. *Start Eclipse -> Help -> Eclipse Marketplace*, insert and download
- *eclipse-pmd 1.10*
- *FindBugs Eclipse Plugin 3.0.2*
- *Checkstyle Plug-in 8.0.0*

## Setup Development / Usage
1. Download this repository and unpack the .zip file
2. Clone your own empty git repository (created by advisor)
3. Move the content of the unzipped folder to your cloned repository. Copy the (most of the time) invisible *.gitignore* file as well!
4. Follow the [Eclipse Setup](https://github.com/ExplorViz/explorviz-backend#eclipse-setup)
5. In Eclipse: *Import -> Gradle -> Existing Gradle Project*
6. In Eclipse: Rename *dummy* in...
- *settings.gradle*
- *src/main/java/net/explorviz/extension* (Right click -> Refactor -> Rename)
7. Start with Gradle task *gretty -> appStart*
