# Design Report #

Tic Tac Toe is a game where two players compete to be the first to get three in a row on a 3x3 grid.

1. The players are asked to write in their names.

2. The game displays the grid on the screen.

3. Player 1 starts by choosing a field to put his mark on.

4. Player 2 then chooses a field to put his mark on, that field cannot be occupied beforehand.

5. The game then ends if a player gets a three in a row or all fields are occupied.

6. The game then prints out the result of the game.

* There are eight possible ways to win Tic Tac Toe, they are: 123 - 456 - 789 - 147 - 258 - 369 - 159 - 357

## Classes ##

### Grid - The grid creates the grid or individual fields ###
* Grid(int num)
* Grid()
* getGrid()
* getNumber()
* getPlayer()
* setPlayer(Players pl)
* isEmpty()
* isWinner()
* toString()

### Players - Creates and holds information about the player ###
* Players(int number, String name)
* getName()
* getNumber()
* getSymbol()

### TicTacToe - Holds the logic of the game and runs the game ###
* TicTacToe()
* welcome()
* newPlayer(int playerNumber)
* askPlayerToPlayAnother()
* printPlayer(Players player1)
* askUserForValidPosition()
* gameLoop()