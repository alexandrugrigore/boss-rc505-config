# boss-rc505-config
# Scala Application

## Disclaimer 
- BACKUP your device before using this application (recommend a full backup, .wavs included) 
- This is a passion project and is made with optimum path in mind, not accounting for corner cases
- The output COULD be wrong

## Usage

- "Generate" - was used for parsing the original XML into a case class (safely ignore)
- "Read" - reads the memory configs from resources/MEMORY.RC0 and are shown as a tree view
- "Copy all configs to all 'INIT MEMORY'" - for each memory, this button copies all settings
   (except for the name, which will be "CP <mem_name>") to all empty memories (with the name 'INIT MEMORY')
- Each memory has a name that can be modified, and is saved when pressing Enter
- "Save" - saves the full configuration in the root folder in the "MEMORY.RC0" file
- Now you can replace your current configuration with the new generated file

## Development
### TODOS
- have a more refined copy (copy only parts of the memory config to other memories)
- more control on the destination memories (not only 'INIT MEMORY')
  - this needs a bit of work, only have a subset, as overriding some settings for used memories could lead to weird results 
- ability to modify ALL settings
- prettier UI

### Maybe
- tooltips for each config based on the official manual

### Probably never
- player to listen to your tracks

### Help
- if you're interested in contributing, just make a fork and I'll check the PR from time to time

## Prerequisites

- Java Development Kit (JDK)
- Scala Build Tool (sbt)

### Install Java Development Kit (JDK)

1. Download and install JDK (recommend open source https://adoptium.net/temurin/releases/)
2. Verify the installation by running `java -version` in the terminal.

### Install Scala Build Tool (sbt)

1. Download and install sbt from the [official sbt website](https://www.scala-sbt.org/download.html).
2. Verify the installation by running `sbt sbtVersion` in the terminal.

## Running the Application

1. **Download the application from GitHub**:
    - Go to the GitHub repository URL.
    - Click on the "Code" button.
    - Select "Download ZIP" to download the repository as a ZIP file.
    - Extract the ZIP file to a directory of your choice.

   Alternatively, if you have Git installed, you can clone the repository:
   ```bash
   git clone https://github.com/alexandrugrigore/boss-rc505-config.git
   cd boss-rc505-config
   ```
   
2. **Open a terminal or command prompt**:
   - Navigate to the root directory of the extracted or cloned repository (the directory containing the build.sbt file).

3. **Compile the project**:
   - ```sbt compile``` 

4. **Run the application**:
    - ```sbt run```