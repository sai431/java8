package com.java8.defaultMethods;

interface Employee
{
default void showName()
{
System.out.println("employee");
}
}