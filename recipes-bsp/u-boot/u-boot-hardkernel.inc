require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "U-Boot-Hardkernel - git repo"
HOMEPAGE = "http://hardkernel.com"
SECTION = "bootloaders"
PROVIDES = "virtual/bootloader"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://../git/COPYING;md5=1707d6db1d42237583f50183a5651ecb"

# from where to fetch the u-boot
UBOOT_REPO_URI ??= "git://github.com/hardkernel/u-boot.git"

SRC_URI = "${UBOOT_REPO_URI};branch=${BRANCH}"

PR = "${PV}+git${SRCPV}"

UBOOT_SUFFIX ?= "bin"

do_deploy_append () {
    install -d ${DEPLOYDIR}
    cp -v ${WORKDIR}/*bl1* ${DEPLOYDIR}
    cp -v ${WORKDIR}/boot.ini ${DEPLOYDIR}
    cp -v ${WORKDIR}/*bl2* ${DEPLOYDIR}
    cp -v ${WORKDIR}/*tzsw* ${DEPLOYDIR}
    cp -v ${WORKDIR}/sd_fusing.sh ${DEPLOYDIR}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
