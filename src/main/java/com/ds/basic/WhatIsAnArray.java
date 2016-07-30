package com.ds.basic;

/**
 * Created by Dark Coder on 30/07/2016.
 */

/**
 * Java provides a data structure, the array which use to store the fixed amount of homogeneous
 * type of collection.
 */
public class WhatIsAnArray {
    final static Integer SIZE_OF_ARRAY = 10;

    private Integer[] integerArray;

    /**
     * For creating an blank array with some space.
     * arrayReference = new dataType[array_size];
     * It is creating an array with new operator for assigned data type with array size.
     * And it assigned a new created array to arrayReference variable.
     */

    Integer[] integerArr = new Integer[SIZE_OF_ARRAY];

    /**
     * Initiate an array with some of the value or we can say pre initialized array or create a constant array.
     * dataType dataArrayReference = {value0, value1, value2, value3};
     * dataArrayReference size is fixed as per the counts of value assigned.
     */

    static final Integer[] PRE_INITIALIZE_ARRAY = {1,2,3,4,5,6,7,8,9,10};

    /**
     * Array element is accessible through the index. Index basically a sequential order of the array where
     * data is use to hold the position. Index of an array always start from 0 and its maximum length is size of array - 1.
     * So for above initialized array that is integerArr. Index will define as follow:
     * integerArr[0] = value; which implies integerArr holding some value in its 0 position.
     *     0    1 2 3 4 5 6 7 8 9
     *   |value| | | | | | | | | | <-- array fill in sequential order. now 0 position is not vacant it holding some value.
     *   other 9 places is vacant so we can save any value in vacant place.
     *
     *   Filling the value in array is like:
     *   arrayReferenceVariable[index] = value; // we are mapping the value at particular index of an array.
     */

    /**
     * Method use to create a dummy array manually.
     * @return Integer[] type array
     */
    private Integer[] fillArrayManually() {
        Integer[] referenceArray = new Integer[SIZE_OF_ARRAY];
        /**
         * INDEX of an array must be in range of 0 to 9. if we trying to save any value in outer range. It will throw some error.
         * Array out of index
         */
        referenceArray[6] = 5;
        referenceArray[4] = 02;
        referenceArray[9] = 49;
        referenceArray[7] = 99;
        /**
         * We fill some position of array
         */
        return referenceArray;
    }

    /**
     * Method used to traverse or print out the value of an array.
     * @param arrayNeedToBeTraverse
     */
    private void traverseArray(Integer[] arrayNeedToBeTraverse) {
        /**
         * We can traverse array manually or sequentially.
         */
        for(int i = 0 ; i < arrayNeedToBeTraverse.length; i++) {
            System.out.println("Array Value is in " + i + " position : " + arrayNeedToBeTraverse[i]);
        }
        /**
         * Or we can access the value of an array manually by mentioning its index.
         * whatever position we wanted we just pass its index like position - 1.
         */

        System.out.println("Value of array for position 6 is " + arrayNeedToBeTraverse[5]);
        System.out.println("Value of array for position 2 is " + arrayNeedToBeTraverse[1]);
    }

    public static void main(String ...arg) {
        WhatIsAnArray reference1 = new WhatIsAnArray();
        reference1.setIntegerArray(reference1.fillArrayManually());
        reference1.traverseArray(reference1.getIntegerArray());
    }

    /**
     * Declaration of an array in java.
     * Ex:
     * dataType[] arrayReference; // preferred way
     * dataType arrayReference[]; // worked but not good way.
     */
    public Integer[] getIntegerArray() {
        return integerArray;
    }

    public void setIntegerArray(Integer[] integerArray) {
        this.integerArray = integerArray;
    }
}
