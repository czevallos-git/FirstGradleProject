# FirstGradleProject
Project to learn how to use gradle, especially when importing packages from another project

# Additional Notes
## Set up your codespaces environment
1. Download The Extension Pack for Java (So far, it is all you need)
2. Add .vscode/settings.json:
- Organize and automatically add imports
- Define the sourcePaths for the project
3. Add code snippets:
- File > Preferences > Configure Snippets: Java
- Content was added here .snippets/java.json
4. Set up your gradle project: gradle init
- This will create the folder structure for a gradle project, the build.gradle file, the gradle wrapper and other related files

## Building
1. If tokens or secrets are required add them to the gradle.properties file as environment variables and then export them: 
- export MY_SECRET_TOKEN=your-token-here
