package practice;

import java.util.Arrays;
import java.util.Random;

public class practice_06 {
    public static void main(String[] args) {
        /*
            [ 카드 뽑기 ]
            1. 문자열 배열에 SPADE, SLOVER, HEART, DIAMOND를 저장한다.
            2. 문자열 배열에 2, 3, 4, 5, 6, 7, 8, 9, 10, JACK, QUEEN, KING, ACE를 저장한다.
            3. 1번과 2번 배열의 길이에 맞도록 난수를 각각 발생시킨다.
            4. 위에서 발생시킨 난수를 활용하여 카드를 출력한다.

            ===== 출력예시 =====
            당신이 뽑은 카드는  DIAMOND 9 카드입니다.
         */

        //arr[i] = (int) (Math.random() * 10) + 1;
        String[] cardSuits = {"SPADE", "SLOVER", "HEART", "DIAMOND"};
        String[] card = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};


        //  int randomIndex = random.nextInt(arr.length);
        Random random = new Random();
        int cardSuitsRandom = random.nextInt(cardSuits.length);
        int cardRandom = random.nextInt(card.length);

        System.out.println("당신이 뽑은 카드는 : " + cardSuits[cardSuitsRandom] + " " + card[cardRandom] + " 입니다.");


    }
}
