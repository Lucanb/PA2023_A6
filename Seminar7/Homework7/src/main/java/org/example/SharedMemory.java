package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SharedMemory {
    public final List<Token> tokens;
    public SharedMemory(int n)
    {
        tokens=new ArrayList<>();
        for(int i=0;i<n*n*n;i++)
        {
           tokens.add(new Token(i+1));
        }
        Collections.shuffle(tokens);
    }

    public synchronized List<Token> extractToken(int howMany){
       List<Token> extracted = new ArrayList<>();
       for(int i=0;i<howMany;i++)
       {
           if(tokens.isEmpty())
           {
               break;
           }
           if(i< tokens.size())
           {
               extracted.add(tokens.get(i));
               tokens.remove(i);
           }
       }
       return extracted;
    }
}
