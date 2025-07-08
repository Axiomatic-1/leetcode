package org.leet.yandex;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        CanPlaceFlowers cpf = new CanPlaceFlowers();
        System.out.println(cpf.canPlaceFlowers(new int[]{0,1,0,1,0,1,0,0}, 1));

    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int toPlant = 0;
        if(n == 0) {
            return true;
        }
        if(flowerbed.length == 1) {
            if(flowerbed[0] == 0 && n == 1) {
                return true;
            }
            return false;
        }

        for(int i = 0; i < flowerbed.length - 1; i++) {
            if (i == 0 && flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1;
                toPlant++;
                continue;
            } else if (i == 0 && flowerbed[1] == 1) {
                continue;
            }

            if (flowerbed[i] == 0) {
                if (i + 1 == flowerbed.length - 1 && flowerbed[i + 1] == 0) {
                    toPlant++;
                } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    toPlant++;
                    flowerbed[i] = 1;
                }
            }
        }
        return toPlant >= n;
    }
}
