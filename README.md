# Solar Powered Minecraft
`Version 1.0.6`

The Solar Minecraft Project is a research project at Concordia University Montreal, under the supervision of Dr. Bart 
Simon & Dr. Darren Wershler. 

The project is exploring alternate minecraft game mechanics and play-styles when integrating 
Real-Time Solar and Power usage data into the minecraft world. 

This forge mod, running on a server, uses the server's stats to alter the gameplay for all players online. 

Please see the [docs folder](./docs/) for more documentation.
## Getting Started 
- Clone the repository and open a terminal in the root directory of the project.
- Run `./gradlew build` to fetch and compile Gradle. This should output `Build Successful`. 
- Run `./gradlew runClient` to compile the source code and run it in Minecraft.

## Running The Mod: 
- For the JAR file, please see [releases](https://github.com/MC-Bloc/SB1-DataVisMod/releases).

## Joining the Server: 
1. Install and set up the CurseForge app [here](https://www.curseforge.com/download/app)
2. In "My Modpacks", click `Create Custom Profile`. 

<img src ="./docs/assets/Client_Setup_1.PNG" width=550>

3. Choose "Minecraft Version" `1.20.2` and "Game Type" `Forge`. Click create. 

<img src ="./docs/assets/CreateNewProfile.png" width=550>

4. On the options button, click `Open Folder`. This will open the modpack's directory in your file explorer.

<img src ="./docs/assets/AddingMods.png" width=550>

5. In your file explorer, open the `mods` directory. 

<img src ="./docs/assets/Client_Setup_5.PNG" width=550>

6. Drag and drop (or move) the [mod (.jar) file](https://github.com/MC-Bloc/SB1-DataVisMod/releases) into the `mods` directory 

<img src ="./docs/assets/Client_Setup_6.PNG" width=550>

7. Back in CurseForge, Click `Play` to launch the modpack. 

8. Once the game is loaded, choose `Multiplayer` in the main menu. Click `Add Server` and enter the server's IP address, follower by :25565 

## The So Far...
The mod is set up to display server data on a heads-up display (HUD). 

The CPU temperature values are fetched from the command line on the server side (see how this is done [here](https://github.com/MC-Bloc/SB1-DataVisMod/blob/main/src/main/java/solarminecraft/services/DataQueryProcess.java)). 

The rest of the values related to the Solar server setup (voltages, powers, and currents from PV panel and battery as well as battery remaining) are 
all fetched from the JSON file being generated by the python script [serialread.py](https://github.com/Solar-Minecraft-Project/solar_server/blob/main/SerialRead/serialread.py). 

<img src = "./docs/assets/SolarServerDataHUD.png" width=550> 

## Contributors: 
1. [Ella Noyes](https://github.com/en4395)
2. [Shahrom Ali](https://github.com/estineali)
3. [Stuart Thiel](https://github.com/ramou)

## Technologies Used 
1. Java `17` - Eclipse Temurin Version
2. Minecraft `1.20.1`
3. Forge `47.2.0`
4. Gradle