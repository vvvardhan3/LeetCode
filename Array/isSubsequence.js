let S = 0;
let T = 0;

if (s == ""){
    return true;
} 
if (S > T) {
    return false;
}

while(S < s.length && T < t.length) {
    if(s[S] == t[T]){
        S++;
    }
    T++;
    
}

return S === s.length

