# ExplorViz Backend Dummy Extension

This repository holds a dummy extension for [ExplorViz's Backend](https://github.com/ExplorViz/explorviz-backend). Use it as a starting point for your future extension.

## Usage
1. Follow the [Setup Development](https://github.com/ExplorViz/explorviz-backend#setup-development) procedure of ExplorViz's Backend
2. Download this repository
3. Unpack the .zip
4. Clone your own git repository (created by advisor) inside the folder *extensions* of ExplorViz Backend
5. Move the content of the unzipped folder to your cloned repository, e.g. move content to *explorviz-backend-extension-xyz*, where *xyz* is equal to your extension name
6. In Eclipse: Right Click *explorviz-ui-backend -> Gradle -> Refresh Gradle Project*
7. This extension is now linked to ExplorViz and appears as a single Gradle subproject in Eclipse's Package Explorer.

**Hint:** Changes inside *explorviz-backend-extension-xyz* are changes to the respective git repository and not the master branch of ExplorViz Backend.

ExplorViz's start and build procedures automatically compile and package all extensions.
