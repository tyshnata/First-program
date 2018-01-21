public class Maximum { //вернуть наибольшее целое число в списке

    public static Integer maximumNum (Integer[] arrlist){ //метод поиска наибольшего числа в массиве
        Integer maxNumber = arrlist[0];

        for(int i = 0; i < arrlist.length ; i++){ // перебираем элементы массива, ищем Мах
            if ( maxNumber >= arrlist[i] ){}
            else maxNumber = arrlist[i];
        }
        return maxNumber; // возвращаем Мах элемент
    }

    public static void main (String args[]){
        Integer[] list = new Integer[]{3, 8, 7, 4, 12, -25, 74, 31}; //

        System.out.println(maximumNum(list)); // вызываем медот поиска Мах числа  для заданного массива
    }
}

