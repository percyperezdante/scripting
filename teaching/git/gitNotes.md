### This page list some of the tips to be used by my students.

# 1.- TAGS

### Creating annotated tags

```
$ git tag -a v2.3.1 -m "Your comment in here"
```

### Sharing annotated tags

```
// First: commit and push the modifications of source code to the central repository

$ git tag -a v2.3.3 -m "Your comment in here"
$ git push orign v2.3.3
```

To share all tags with one command lini

```
$ git push orign --tags
```
### Listing anntated tags

```
$ git show    # It list all available tags
$ git show v2.3.*  # It list all tags which prefix is v2.3

```

