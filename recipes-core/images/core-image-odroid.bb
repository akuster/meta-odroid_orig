ESCRIPTION = "A small image with a few debugging and system utilities."

IMAGE_INSTALL = "packagegroup-core-boot \
    ${ROOTFS_PKGMANAGE_BOOTSTRAP} \
    usbutils lrzsz strace \
    mtd-utils kernel-modules \
    sysprof"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

#this goes to the SD card in the second partition
IMAGE_FSTYPES := "ext4 tar.bz2"
IMAGE_ROOTFS_SIZE = "262144"
