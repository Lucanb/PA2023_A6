package com.example.DataBase_Accounts.SpecialClasses;


import org.jgrapht.alg.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> myNodes = new ArrayList<>();
        List<Pair<Integer, Integer>> myEdges = new ArrayList<Pair<Integer, Integer>>();
        myNodes.add(1);
        myNodes.add(2);
        myNodes.add(3);
        myNodes.add(4);
        myNodes.add(5);
        myEdges.add(new Pair(1, 2));
        myEdges.add(new Pair(4, 2));
        myEdges.add(new Pair<>(3, 5));
        myEdges.add(new Pair<>(3, 2));
        myEdges.add(new Pair<>(5, 4));
        myEdges.add(new Pair(2, 1));
        myEdges.add(new Pair(2, 4));
        myEdges.add(new Pair<>(5, 3));
        myEdges.add(new Pair<>(2, 3));
        myEdges.add(new Pair<>(4, 5));

        Graphic graphic = new Graphic(myNodes, myEdges);

        //graphic.DFS(2);
        graphic.StartParalelDfs(4);
        //System.out.println("Hello world!");

    }
}

