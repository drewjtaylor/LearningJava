## Java Journey

This is a text-based fantasy game slowly being built alongside my learning java.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.


## Goals

The goal is to have a text-based game that follows this format:

- On startup, the player provides their name and chooses a class
- The player object/class tracks stats and has methods for interacting with mosters
- The player will encounter monsters chosen at random
- Each monster encounter will involve taking turns using methods to try to get the opponent's health to 0
- If the player's HP gets to 0, they lose. If the monster's HP gets to 0, they progress.
- Once the player beats a "boss" monster, they win the game.

## Bonus goals

These goals are "icing on the cake." If other core functionality is all good and I'm still interested in the project, these areas could be developed or expanded.

- More monsters with more interesting abilities.
- Hook up a database and make it so players can track their progress.
- Deploy it online somewhere, somehow.
- Make alternate story paths for the player to take.
- Make it so the character can gain experience and level up, allowing an increase to stats or the ability to choose a new ability, unlocking a new method for their class.