# dotfiles
:wrench: Yet another dotfiles repo...

## Setup

To use this repository as a start for your configuration files:
```sh
$ git clone http://github.com/marrakchino/dotfiles ~/.dotfiles
$ cd ~/.dotfiles
$ ./setup_dotfiles.sh
# Let the program guide you
```

### One-liner alternative
```sh
$ git clone --recursive http://github.com/marrakchino/dotfiles ~/.dotfiles && sh -c ~/.dotfiles/setup_dotfiles.sh
```

## Contributing

This may not be a collaboration-driven project but any contribution is welcome, especially concerning the `setup_dotfiles.sh` file.
Corrections and typo fixes are encouraged.

# TODO 

* [bash_functions] Create a function to extract a compressed archive whatever compression is used, see https://github.com/techgaun/dotfiles/blob/master/.functions/extract for inspiration
