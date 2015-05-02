require core-image-odroid.bb

DESCRIPTION = "A XFCE image."

IMAGE_INSTALL += " \
    packagegroup-xfce-base \
    packagegroup-xfce-extended \
    "

REQUIRED_DISTRO_FEATURES = "x11"
