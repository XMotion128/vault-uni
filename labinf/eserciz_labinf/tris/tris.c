#include <stdio.h>

char board[3][3]; // Griglia di gioco

// Funzione per inizializzare la griglia con spazi vuoti
void initBoard() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = ' ';
        }
    }
}

// Funzione per stampare la griglia
void printBoard() {
    printf(" 0 1 2\n");
    for (int i = 0; i < 3; i++) {
        printf("%d ", i);
        for (int j = 0; j < 3; j++) {
            printf("%c", board[i][j]);
            if (j < 2) printf("|");
        }
        printf("\n");
        if (i < 2) printf(" -----\n");
    }
}

// Funzione per controllare se un giocatore ha vinto
char checkWinner() {
    for (int i = 0; i < 3; i++) {
        // Controlla righe e colonne
        if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ')
            return board[i][0];
        if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ')
            return board[0][i];
    }
    // Controlla diagonali
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ')
        return board[0][0];
    if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')
        return board[0][2];
    
    return ' '; // Nessun vincitore ancora
}

// Funzione principale
int main() {
    int row, col, moves = 0;
    char currentPlayer = 'X';
    
    initBoard();
    
    while (moves < 9) {
        printBoard();
        printf("Giocatore %c, inserisci riga e colonna (es. 0 1): ", currentPlayer);
        scanf("%d %d", &row, &col);

        // Controllo validità input
        if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
            printf("Mossa non valida, riprova.\n");
            continue;
        }

        board[row][col] = currentPlayer;
        moves++;

        // Controllo se qualcuno ha vinto
        char winner = checkWinner();
        if (winner != ' ') {
            printBoard();
            printf("Il giocatore %c ha vinto!\n", winner);
            return 0;
        }

        // Cambio turno
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    printBoard();
    printf("Pareggio!\n");
    return 0;
}

