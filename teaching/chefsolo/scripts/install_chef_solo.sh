#! /usr/bin/env bash

# This was copied from:
# https://github.com/dvberkel/chef-solo-laptop
# And it should be copied to the remote host

ORGNAME=effrafax

# Add Opscode APT to the source list
echo "deb http://apt.opscode.com/ `lsb_release -cs`-0.10 main" | sudo tee /etc/apt/sources.list.d/opscode.list

# Add Opscode GPG key
sudo mkdir -p /etc/apt/trusted.gpg.d
gpg --keyserver keys.gnupg.net --recv-keys 83EF826A
gpg --export packages@opscode.com | sudo tee /etc/apt/trusted.gpg.d/opscode-keyring.gpg > /dev/null

# Update
sudo apt-get update

# Install opscode-keyring to keep keyring up to date
sudo apt-get install opscode-keyring # permanent upgradeable keyring

# Upgrade
sudo apt-get upgrade

# Install Chef
echo "chef chef/none string https://api.opscode.com/organizations/$ORGNAME" | sudo debconf-set-selections && sudo apt-get install chef -y

