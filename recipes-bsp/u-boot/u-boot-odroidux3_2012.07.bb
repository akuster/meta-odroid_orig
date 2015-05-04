require u-boot-hardkernel.inc

DESCRIPTION = "u-boot bootloader for Odroid UX3 devices supported by the hardkernel product"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

PROVIDES += "u-boot"

SRCREV = "d80b05d5624ecba99c15ee2a7b3f59ebf6f8f1e8"
BRANCH = "odroidxu3-v2012.07"

SRC_URI += "\
    file://sd_fusing.sh \
    file://boot.ini \
    file://bl1.bin.hardkernel \
    file://bl2.bin.hardkernel \
    file://tzsw.bin.hardkernel \
    file://u-boot.bin.hardkernel"
