package Generics;

/**
 *  15.12
 *  15.12.1
 *
 *
 */

//class bound<T extends bound<T>>{}  //15.12

class GenericType<T>{}


public class CuriouslyRecurringGeneric extends GenericType<CuriouslyRecurringGeneric>{


}

