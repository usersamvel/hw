package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Task8Test {

    @Test
    void knightBoardCapture() {
        Task8 task8 = new Task8();
        //given
        int[][] board = {
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0}
        };
        //when
        boolean response = task8.knightBoardCapture(board);
        //then
        Assertions.assertThat(response).isEqualTo(true);
    }

    @Test
    void knightBoardCapture2() {
        Task8 task8 = new Task8();
        //given
        int[][] board = {
            {1, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0}
        };
        //when
        boolean response = task8.knightBoardCapture(board);
        //then
        Assertions.assertThat(response).isEqualTo(false);
    }

    @Test
    void knightBoardCapture3() {
        Task8 task8 = new Task8();
        //given
        int[][] board = {
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 1, 1, 1}
        };
        //when
        boolean response = task8.knightBoardCapture(board);
        //then
        Assertions.assertThat(response).isEqualTo(false);
    }

    @Test
    void knightBoardCapture4() {
        Task8 task8 = new Task8();
        //given
        int[][] board = {
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 1, 1, 1},
            {0, 0, 0, 0, 1, 1, 1, 1}
        };
        //when
        Assertions.assertThatThrownBy(() -> task8.knightBoardCapture(board))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void knightBoardCapture5() {
        Task8 task8 = new Task8();
        //given
        int[][] board = {
            {0, 0, 0, 1, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0, 1},
            {0, 1, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 1, 1, 1, 1},
        };
        //when
        Assertions.assertThatThrownBy(() -> task8.knightBoardCapture(board))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
