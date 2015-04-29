require u-boot-hardkernel.inc

DESCRIPTION = "u-boot bootloader for Odroid UX3 devices supported by the hardkernel product"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
#DEFAULT_PREFERENCE = "-1" 

SRCREV = "d80b05d5624ecba99c15ee2a7b3f59ebf6f8f1e8"
BRANCH = "odroidxu3-v2012.07"

SRC_URI += "  \
    file://sd_fusing.sh \
    file://bl1.HardKernel \
    file://bl2.HardKernel \
    file://tzsw.HardKernel \
    "
