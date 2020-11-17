#include <iostream>

struct Node
{
    int val;
    Node *next;
} ;

namespace list
{
    
}

int main()
{

    Node a{};
    Node *current = &a;


    for (int i = 0; i < 10; ++i)
    {
        std::cin >> current->val;
        current->next = new Node;
        current = current->next;
    }

    *current = a;

    for (int i = 0; i < 10; ++i)
    {
        std::cout << i << " ( " << current << " ) -> " << current->val << std::endl;
        current = current->next;
    }

    return 0;
}
