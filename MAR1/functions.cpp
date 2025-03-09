////
////  functions.cpp
////  STRIVERDSA
////
////  Created by MR KISHOR on 01/03/25.
////
//
//#include<iostream>
//#include<utility>
//#include<vector>
//#include<queue>
//#include<deque>
//#include<set>
//#include<map>
//#include<list>
//#include<stack>
//
//using namespace std;
//
//
//void ifelseconditioning(int num1,int num2){// pass by value  and non - return type
//    if(num1>num2){
//        cout<<"num1 is greater"<<endl;
//    }
//    else{
//        cout<<"num2 is greater "<<endl;
//    }
//}
//
//
//int thesum(int a,int b){
//    return a+b;
//}
//
//
//// pass by reference
//
//int checkingthereference(int &a){ // the original address is passsed here that changes directly to the value of a
//    a=a+10;
//    return a; // return type of integer
//}
//
////Array Operaations
//
//void sumarray(){
//    int arr[5];
//    for(int i=0;i<5;i++){
//        cin>>arr[i];
//    }
//    for(int i=0;i<5;i++){
//        cout<<arr[i]<<" ";
//    }
//}
//
//// Strings
//void stri(){
//    string a="kishor";
//    for(int i=0;i<a.size();i++){
//        cout<<a[i]<<endl;
//    }
//}
//
////Patterns
//void pattern1(){
//    int n;
//    cin>>n;
//    for(int i=0;i<n;i++){
//        for(int j=0;j<n;j++){
//            cout<<"*"<<" ";
//        }
//        cout<<endl;
//    }
//}
//
//void pattern2(){
//    int n;
//    cin>>n;
//    for(int i=0;i<n;i++){
//        for(int j=0;j<=i;j++){
//            cout<<"*"<<" ";
//        }
//        cout<<endl;
//    }
//}
//
//void pattern3(){
//    int n;
//    cin>>n;
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=i;j++){
//            cout<<j<<" ";
//        }
//        cout<<endl;
//    }
//}
//
//void pattern4(){
//    int n;
//    cin>>n;
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=i;j++){
//            cout<<i<<" ";
//        }
//        cout<<endl;
//    }
//}
//
//void pattern5(){
//    int n;
//    cin>>n;
//    for(int i=1;i<=n;i++){
////        for(int j=n;j>=i;j--){
////            cout<<"*"<<" ";
////        }
////        or
//        for(int j=0;j<n-i+1;j++){
//            cout<<"*"<<" ";
//        }
//        cout<<endl;
//    }
//}
//
//
//void pattern6(){
//    int n;
//    cin>>n;
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=n-i+1;j++){
//            cout<<j<<" ";
//        }
//        cout<<endl;
//    }
//}
//
//void pattern7(){
//    int n;
//    cin>>n;
//    for(int i=0;i<=n;i++){
//        for(int j=0;j<n-i+1;j++){
//            cout<<" ";
//        }
//        for(int j=0;j<1+(2*i);j++){
//            cout<<"*";
//        }
//
//        cout<<endl;
//    }
//}
//
//void pattern8(){
//    int n=6;
////    cin>>n;
//    for(int i=0;i<n;i++){
//        
//        for(int j=0;j<=i;j++){
//            cout<<" ";
//        }
//        for(int j=0;j<2*n-(2*i+1);j++){
//            cout<<"*";
//        }
//
//        cout<<endl;
//    }
//}
//
//void pattern9(){
//    pattern7();
//    pattern8();
//}
//
//void pattern10(){
//    pattern2();
//    pattern5();
//}
//
//void pattern11(){
//    int n;
//    cin>>n;
//    for(int i=0;i<n;i++){
//        int start=i;
//        if(i%2==0) start=1;
//        else start=0;
//        for(int j=0;j<=i;j++){
//            cout<<start;
//            start=1-start;
//        }
//        cout<<endl;
//    }
//}
//
//void pattern12(){
//    int n;
//    cin>>n;
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=i;j++){
//            cout<<j;
//        }
//        for(int j=1;j<=2*n-2*i;j++){
//            cout<<" ";
//        }
//        for(int j=i;j>=1;j--){
//            cout<<j;
//        }
//        cout<<endl;
//    }
//}
//
//void pattern13(){
//    int n;
//    cin>>n;
//    int count=1;
//    for(int i=0;i<n;i++){
////        count++;
//        for(int j=0;j<=i;j++){
////            count++;
//            cout<<count<<" ";
//            count++;
//        }
//        cout<<endl;
////        count=count+1;
//    }
//}
//
//void pattern14(){
//    int n;
//    cin>>n;
////    int count=1;
//    for(int i=0;i<n;i++){
//        for(char ch='A';ch<='A'+i;ch++){
//            cout<<ch<<" ";
//        }
//        cout<<endl;
//    }
//}
//
//void pattern15(){
//    int n;
//    cin>>n;
////    int count=1;
//    for(int i=0;i<n;i++){
//        for(char ch='A';ch<='A'+n-i-1;ch++){
//            cout<<ch<<" ";
//        }
//        cout<<endl;
//    }
//}
//
//void pattern16(){
//    int n;
//    cin>>n;
//    char ch/*='A'*/;
//    for(int i=0;i<n;i++){
//        ch='A'+i;
//        for(int j=0;j<=i;j++){
//            cout<<ch<<" ";
//        }
//        cout<<endl;
//    }
//}
//void pattern17(){
//    int n;
//    cin>>n;
//    for(int i=0;i<n;i++){
//        for(int j=0;j<n-i+1;j++){
//            cout<<" ";
//        }
//        char ch='A';
//        for(int j=0;j<2*i+1;j++){
//            cout<<ch;
//            if(j<i){
//                ch++;
//            }
//            else{
//                ch--;
//            }
//        }
//        cout<<endl;
//    }
//}
//
//void pattern18(){
//    int n;
//    cin>>n;
//    for(int i=0;i<n;i++){
//        for(char ch='E'-i;ch<='E';ch++){
//            cout<<ch<<" ";
////            ch--;
//        }
//        cout<<endl;
//    }
//}
//
//void pattern19(){
//    int n;
//    cin>>n;
//    for(int i=0;i<n;i++){
//        for(int j=0;j<=n-i-1;j++){
//            cout<<"*";
//        }
//        for(int j=0;j<2*i;j++){
//            cout<<" ";
//        }
//        for(int j=0;j<=n-i-1;j++){
//            cout<<"*";
//        }
//        cout<<endl;
//    }
//    for(int i=0;i<n;i++){
//        for(int j=0;j<=i;j++){
//            cout<<"*";
//        }
//        for(int j=1;j<((2*5)-(2*i)-1);j++){
//            cout<<" ";
//        }
//        for(int j=0;j<=i;j++){
//            cout<<"*";
//        }
//        cout<<endl;
//    }
//}
//void pattern20(){
//    int n;
//    cin>>n;
//    for(int i=0;i<n;i++){
//        for(int j=0;j<=i;j++){
//            cout<<"*";
//        }
//        for(int j=0;j<((2*5)-(2*i)-2);j++){
//            cout<<" ";
//        }
//        for(int j=0;j<=i;j++){
//            cout<<"*";
//        }
//        cout<<endl;
//    }
//    for(int i=1;i<n;i++){
//        for(int j=0;j<=n-i-1;j++){
//            cout<<"*";
//        }
//        for(int j=0;j<2*i;j++){
//            cout<<" ";
//        }
//        for(int j=0;j<=n-i-1;j++){
//            cout<<"*";
//        }
//        cout<<endl;
//    }
//}
//
//void pattern21(){
//    int n;
//    cin>>n;
//    for(int i=0;i<n;i++){
//        for(int j=0;j<n;j++){
//            if(i==0 || j==0 || i==n-1 || j==n-1){
//                cout<<"*";
//            }
//            else{
//                cout<<" ";
//            }
//        }
//        cout<<endl;
//    }
//}
//
//void pairss(){
//    pair<int,string>list={1,"kishor"};
////    cout<<list.first<<endl;
//    pair<int,int>p[]={{1,2},{3,5},{5,6}};
//    cout<<list.first<<"\n"<<list.second<<endl;
//    cout<<p[0].first<<endl<<p[1].second<<endl;
//}
//void vectorss(){
//    vector<int>v={1,2,3,4,5}; // Intialisation of an vector
//    v.push_back(6);   // add elements at last
//    v.emplace_back(7);  //adds elements at last
//    int result=v.back(); // returns the last element of the vector
//    cout<<v.at(1)<<endl<<result<<endl; // can be accessed through indices starts from 0
//    cout<<"The length of the vector is : ";
////    v.clear(); // removes all the elements of the vectors and intialises to the empty vector
//    
//    cout<<v.size()<<endl;
//}
//void pairedvectors(){
//    vector<int>li;
////    li.clear();
//    li.emplace_back(2);
//    li.emplace_back(3);
//    li.emplace_back(4);
//    li.emplace_back(5);
//    li.emplace_back(6);
////    for(auto it=li.begin();it!=li.end();it++){
////        cout<<*(it)<<endl;
////    }
//    vector<pair<int,string>>list;
//    list.emplace_back(1,"kishor");
//    list.emplace_back(2,"Monkey D Luffy");
////    for(auto i=list.begin();i!=list.end();i++){ // iterations over paires values in the vectors
////        cout<<i->first<<" "<<i->second<<endl;
////    }
////
////    for(int i=0;i<li.size();i++){
////        cout<<li[i].first<<" "<<li[i].second<<endl;
////    }
//}
//
//void vectoriterations(){
//    vector<int>list={1,2,3,4,5,6,7,8};
////     step 1
//    for(int i=0;i<list.size();i++){
//        cout<<list.at(i)<<" ";
//    }
//    cout<<endl;
//// step 2
//    for(auto i =list.begin();i!=list.end();i++){
//        cout<<*i<<" ";
//    }
//    cout<<endl;
////    step 3
//    for(int i:list){
//        cout<<i<<" ";
//    }
//    cout<<endl;
////    step 4
//    for(auto i:list){
//        cout<<i<<" ";
//    }
//    cout<<endl;
//}
//
//void vectoriterationmethods(){
//    // method 1 -> end
//    vector<int>list={1,2,3,4,5,6};// so the list.end points to the next element of the last element and hence if we decement it by 1 then it wll prints the last element.
//    
//    for(auto i=list.end()-1;i>=list.begin();i--){ // prints reverse of an vector
//        cout<<*i<<" ";
//    }
//    cout<<endl;
//    // method 2 ->rend
//    for(auto i=list.rbegin();i!=list.rend();i++){ // starts from reverse and iterates
//        cout<<*i<<" ";
//    }
//}
//
//
//void vectorinsertion(){
//    vector<int>list(5,19);// five 19 are inserted into the vector ;
//    list.insert(list.begin()+1,2,100); // from the index one it will add 2 times 100
//    list.insert(list.begin(),300); // adding element to the first of the vector
//    vector<int>list1(3,69);
//    list.insert(list.end(), list1.begin(),list1.end());
//    for(auto i:list){
//        cout<<i<<" ";
//    }
//    cout<<endl;
//}
//
//void advvectors(){
//    vector<int>v;
//    string a="kishor";
//    vector<char> v1;
//    v1.insert(v1.begin(),a.begin(),a.end());
//    sort(v1.begin(),v1.end());
//    
//    bool result=binary_search(v1.begin(),v1.end(),'i');
//    if(result){
//        cout<<"True "<<endl;
//    }
//    else{
//        cout<<"False "<<endl;
//    }
////    cout<<result;
////    if()
////    for(auto i:v1){
////        if(!(i=='k')){
////            cout<<i<<" ";
////        }
//////        cout<<i<<" ";
////    }
//    
//}
//
//void vectorerasing(){
//    vector<int>v={1,2,3,4,5};
//    v.erase(v.begin()+1,v.end()-1);
//    for(auto i:v){
//        cout<<i<<" ";
//    }
//}
//
//void vectorfunc(){
//    vector<int> list2={6,7,8,9};
//    vector<int>list={1,2,3,4,5};
//    list.pop_back(); // removes the element  at the end
////    list.emplace_back(list2);// we cannot append the list in directtly
//    for(auto i:list2){
//        list.emplace_back(i);
//    }
//    list.clear();// deletes all the elements in the vector
//    list.emplace_back(1); // adds element to the last
//    list.emplace_back(2); // adds element to the last
//    list.emplace_back(3); // adds element to the last
//    list.emplace_back(4); // adds element to the last
////    list.clear(); // removes all the elements from the vector
////    bool result=list.empty(); // checks whether the vetor is empty or not
////    int result=list.front(); // prints the first element of the vector
//    int result=list.back(); // prints the last element of the vector
//    cout<<result<<endl;
////    list.emplace_back(5);// add at the end of the vector
//    list.swap(list2); // it is a methodology used to swap the vetors
//    for(auto i:list){
//        cout<<i<<" ";
//    }
////    cout<<list.capacity()<<" ";// returns the capacity of the vector
//
//}
//
//void vectorsorting(){
//    vector<int> list={23,5,6,7,1,8,9};
//    sort(list.begin(),list.end()); // sorts in the ascending order
//    sort(list.rbegin(),list.rend());// sorts in descending order
//    for(auto i:list){
//        cout<<i<<" ";
//    }
//}
//
//void list(){
//    
//}
//void sett(){
//    set<int> st;
//    st.insert(1);
//    st.insert(3);
//    st.insert(2);
//    st.insert(2);
//    st.insert(4);
//    auto a=st.find(8);
//    cout<<*a<<endl;
//    
//    for(auto i=st.begin();i!=st.end();i++){
//        cout<<*i<<" ";
//    }
//    cout<<endl;
//    
////    for(auto i:st){
////        cout<<i<<" ";
////    }
//    
//
//}
//int main(){
////    int a=24; // Here the value also gets changed to 34
////    int b=25;
////    ifelseconditioning(a,b);
////    int result=thesum(a, b);
////    int result=checkingthereference(a);
////    cout<<result<<endl;
////    cout<<"the value of a : "<<a<<endl;
////    sumarray();
////    stri();
////    vectorss();
////    pairedvectors();
////    pairss();
////    vectoriterations();
////    vectorinsertion();
////    vectoriterationmethods();
////    vectorerasing();
////    vectorfunc();
////    vectorsorting();
//    sett();
//    return 0;
//}
