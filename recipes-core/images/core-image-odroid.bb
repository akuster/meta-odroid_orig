DESCRIPTION = "A odroid xu3 small image."

IMAGE_INSTALL = "packagegroup-core-boot \
    ${ROOTFS_PKGMANAGE_BOOTSTRAP} \
    usbutils lrzsz strace \
    mtd-utils kernel-modules \
    sysprof"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

export IMAGE_BASENAME = "core-image-odroid"
inherit core-image

#this goes to the SD card in the second partition
IMAGE_FSTYPES := "ext4 tar.bz2 sdcard"
IMAGE_ROOTFS_SIZE = "262144"
