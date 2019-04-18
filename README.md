# katalon-studio-saucelabs-plugin

Katalon Studio SauceLabs Plugin is a Custom Keyword Plugin that provides integration with SauceLabs.

**Katalon Studio Report Plugin provides:**
- Automatically generate Custom Capabilities that allow remote driver to connect to SauceLabs.
- Automatically update SauceLabs' job information by test case's name and status.

**Limitation:**
- Katalon Studio SauceLabs Plugin is for Test Case only, not Test Suite or Test Suite Collection.

## Build project
1. Run:
```sh
gradle katalonPluginPackage
```
2. Copy *build/libs/katalon-studio-report-plugin.jar* and paste into Plugins folder of your Katalon Studio project to start using the keyword or upload to Katalon Store

## Usage
[Usage guide](docs/tutorials/usage.md)
