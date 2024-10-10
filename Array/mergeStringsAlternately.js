let merge = [];

    for(let i = 0; i < Math.max(word1.length,word2.length); i++){
        if(i < word1.length){
            merge.push(word1[i]);
        }

        if(i < word2.length) {
            merge.push(word2[i]);
        }
    }

    return merge.join("");