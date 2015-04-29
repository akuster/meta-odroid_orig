inherit kernel
require recipes-kernel/linux/linux-yocto.inc

KBRANCH = "odroidxu3-3.10.y"
SRCREV="31ad7cdd37a0a9eb80318f8aa567064f3e7b5b0b"

SRC_URI = "git://github.com/hardkernel/linux.git;bareclone=1;branch=${KBRANCH}"

SRC_URI += "file://defconfig"

SRC_URI += "file://odroid.scc \
            file://odroid.cfg \
            file://odroid-user-config.cfg \
            file://odroid-user-patches.scc \
           "


LINUX_VERSION ?= "3.10.72"
LINUX_VERSION_EXTENSION ?= "odroid-ux3"

SRCREV="7b761be254363bd3488f76bb4c50344c820accea"

PV = "${LINUX_VERSION}+git${SRCPV}"

COMPATIBLE_MACHINE_odroid-ux3 = "odroid-ux3"
