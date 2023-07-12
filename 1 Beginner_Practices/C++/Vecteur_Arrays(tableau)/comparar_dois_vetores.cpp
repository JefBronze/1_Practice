#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


int main()
{
    vector<string> user_words{"this", "dog", "horse", "bear", "column", "word", "cat", "car", "bus", "truck"};

    vector<string> disliked{ "dog", "cat","monkey" };

    for(size_t i = 0; i < user_words.size(); ++i)
    {
        vector<string>::iterator it = find (disliked.begin(), disliked.end(), user_words[i]);
        if (it != disliked.end())
            cout << "Bleep\n";
        else
            cout << user_words[i] << '\n';
    }
    return 0;
}

