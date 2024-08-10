# Data Structures and Algorithms (DSA) in Java

## Getting Started

Welcome to the DSA using Java world. Here is a guideline to help you get started to write Java code.

## Overview

This repository contains implementations of various data structures and algorithms in Java. It is designed to help understand the fundamentals of data structures and algorithms, as well as to provide practical examples.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Table of Contents

* Introduction

* Data Structures
    * Arrays
    * Linked Lists
    * Stacks
    * Queues
    * Trees
    * Graphs
    * Hash Tables

* Algorithms
    * Sorting
    * Searching
    * Dynamic Programming
    * Greedy Algorithms
    * Backtracking

* Installation

* Usage

* Contributing

* License

## Introduction

This project aims to provide a comprehensive guide to data structures and algorithms using Java. Each data structure and algorithm is implemented with detailed explanations and examples.

## Data Structures

### Arrays

* ***Description:*** Arrays are used to store multiple values in a single variable.
* ***Example:***
```JAVA
int[] arr = new int[]{1, 2, 3, 4, 5}; 
```

## Linked Lists

* ***Description:*** Linked Lists are linear data structures where elements are not stored at contiguous memory locations.
* ***Example:***
```Java
class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}
```

## Stacks

* ***Description:*** Stacks are linear data structures that follow the LIFO (Last In First Out) principle.
* ***Example:***
```Java
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
```

## Queues

* ***Description:*** Queues are linear data structures that follow the FIFO (First In First Out) principle.
* ***Example:***
```Java
Queue<Integer> queue = new LinkedList<>();
queue.add(1);
queue.add(2);
```

## Trees

* ***Description:*** Trees are hierarchical data structures with a root node and child nodes.
* ***Example:***
```Java
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int item) {
        data = item;
        left = right = null;
    }
}
```

## Graphs

* ***Description:*** Graphs are collections of nodes connected by edges.
* ***Example:***
```Java
class Graph {
    private int V;
    private LinkedList<Integer> adj[];
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
}
```

## Hash Tables
* ***Description:*** Hash Tables store key-value pairs and provide efficient data retrieval.
* ***Example:***
```Java
HashMap<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
```

# Algorithms

## Sorting
* ***Description:*** Sorting algorithms arrange elements in a particular order.

* ***Example:*** Bubble Sort, Quick Sort, Merge Sort

## Searching
* ***Description:*** Searching algorithms find the position of an element in a data structure.

* ***Example:*** Linear Search, Binary Search

## Dynamic Programming
* ***Description:*** Dynamic Programming solves problems by breaking them down into simpler subproblems.

* ***Example:*** Fibonacci Sequence, Knapsack Problem

## Greedy Algorithms
* ***Description:*** Greedy algorithms make the locally optimal choice at each stage.

* ***Example:*** Coin Change Problem, Activity Selection
## Backtracking
* ***Description:*** Backtracking is a recursive algorithm for solving problems by trying to build a solution incrementally.

* ***Example:*** N-Queens Problem, Sudoku Solver

# Installation & First Program

1. ### Install Java
    a. Install JDK (https://www.oracle.com/in/java/technologies/javase-downloads.html)

    b. Install IntelliJ (https://www.jetbrains.com/idea/download/#section=mac)

                OR

    b. Install Visual Studio Code (VS Code) - Prefer THIS (https://code.visualstudio.com/download)

2. ### Sample Code

    * ***Functions***

        * A function is a block of code which takes some input, performs some operations and returns some output.

        * The functions stored inside classes are called methods.

        * The function we have used is called main.

    * ***Class***

        * A class is a group of objects which have common properties. A class can have some properties and functions (called methods).

        * The class we have used is Main.

3. ### Our 1st Program

```Java
public class Main {

   public static void main(String[] args) {
  // Our 1st Program
       System.out.println("Hello World");
   }
}
```

# Usage
Clone the repository and navigate to the desired directory to run the examples:
```
git clone https://github.com/yourusername/DSA-using-Java.git
cd DSA-using-Java
javac filename.java
java filename
```

***