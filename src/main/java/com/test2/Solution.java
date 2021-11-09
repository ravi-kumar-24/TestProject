package com.test2;

import java.util.*;

interface Parser {
    List<String> getLinks(String uri);
}


// input: vmware.com, dell.com

// parserImpl.getLinks: input -> output
// vmware.com -> dell.com, abc.com
// abc.com -> xyz.com
// dell.com -> emc.com, vmware.com
// xyz.com -> {}
// emc.com -> emc.com

// output: vmware.com, dell.com, emc.com, abc.com, xyz.com

class Solution {
    Parser parserImpl;
    // a -> a, b, c
    // b -> a, b, c
    // c -> a, b, c

    // a, b, c
    // queue: c, b, c, c
    // visited: a, b, c

    Collection<String> crawl(String seedUrls) {

        // List<String>  list  = parserImpl.getLinks(seedUrls);

        Set<String> visitNodes = new HashSet();

        Queue<String> queue = new LinkedList<>();
        queue.add(seedUrls);
        List<String>  list ;
        while(!queue.isEmpty() ){
            String element = queue.poll();
            list = parserImpl.getLinks(seedUrls);
            for(String str: list){
                if(!visitNodes.contains(str)){
                    queue.add(str);
                    visitNodes.add(str);
                }
            }
        }
        System.out.println(visitNodes.toString());
        return visitNodes;
    }
}
