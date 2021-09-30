public class TicTacToeGame {
        public static void main(String[] args) {
            System.out.println("Welcome to the Game ");
            createboard();
        }

        static char[] board = new char[10];

        public static void createboard() {
            for (int index = 1; index < 10; index++) {
                board[index] = ' ';
            }

        }
    }

