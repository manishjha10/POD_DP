class Solution {
int c  =  0 ;
int candiadate = 0 ;
for(int i = 0 ; i< arr.length ;i++) {
    if(c==0){
        candiadate = arr[i] ;
        c = 1 ;
    }else if (arr[i]  == candiadate){
        c ++;
    }else {
        c -- ;
    }
}
c = 0 ;
for(int j = 0 ; j< arr.length ;j++){
    if(arr[j] == candiadate){
        c++;
    }
}
int n  =  arr.length ;
if(c>n/2){
    return candiadate ;
}
return -1 ;
}
