Put me in GitHub:    paul.home4748@gmail.com   (and not in normal work github account)

https://medium.com/@ibrahimlawal/developing-with-multiple-github-accounts-on-one-macbook-94ff6d4ab9ca


paul.bickell@raytheon.co.uk
TRT-PaulB

paul.home4748@gmail.com
MiniProjs123


NOTE MAC FINDER HIDDEN FILES ==> CMD + SHIFT + .



// generate SSH keys for all accounts
cd ~/.ssh
ssh-keygen -t rsa -C "paul.bickell@raytheon.co.uk" -f "github-TRT-PaulB"
ssh-keygen -t rsa -C "paul.home4748@gmail.com" -f "github-MiniProjs123"


// add SSH keys to ssh agent
ssh-add -K ~/.ssh/github-TRT-PaulB
ssh-add -K ~/.ssh/github-MiniProjs123


// copy public SHH keys and paste in github
pbcopy < ~/.ssh/github-TRT-PaulB.pub
pbcopy < ~/.ssh/github-MiniProjs123.pub


// update config file in .ssh directory
# TRT-PaulB account
Host github.com-TRT-PaulB
    HostName github.com
    User git
    IdentityFile ~/.ssh/github-TRT-PaulB
    
# MiniProjs123 account
Host github.com-MiniProjs123
    HostName github.com
    User git
    IdentityFile ~/.ssh/github-MiniProjs123
    
    
// set one account to be default    
git config --global user.name "TRT-PaulB"
git config --global user.email "paul.bickell@raytheon.co.uk"   


// now run the pair of repo details as needed for this time, eith / or....
// do this IN EVERY REPOSITORY to tell git which account to use 
git config user.email "paul.bickell@raytheon.co.uk"
git config user.name "TRT-PaulB"

git config user.email "paul.home4748@gmail.com"
git config user.name "MiniProjs123"








