#!/bin/bash

# scripts are from mod_utils project on my GitHub.

ID='goldenglitter'
NAME='GoldenGlitter'
TOPDIR=`pwd`
PROJNAME=`basename $TOPDIR`
if [ $PROJNAME != $NAME ]; then
    echo "Running in wrong directory!"
    exit 1
fi

# blockstates
TARGETDIR=${TOPDIR}/src/main/resources/assets/${ID}/blockstates
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# make simple blockstates
gen_blockstate_jsons.py --type=simple rose_gold_block
gen_blockstate_jsons.py --type=simple scarlatite_gold_block
gen_blockstate_jsons.py --type=simple erubescent_gold_block
gen_blockstate_jsons.py --type=simple hephaestan_gold_block

# models
TARGETDIR=${TOPDIR}/src/main/resources/assets/${ID}/models
if [ ! -d $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi
cd $TARGETDIR

# block models
gen_model_jsons.py --type=block rose_gold_block
gen_model_jsons.py --type=block scarlatite_gold_block
gen_model_jsons.py --type=block erubescent_gold_block
gen_model_jsons.py --type=block hephaestan_gold_block

#inventory items
gen_model_jsons.py --type=inventory --item_only rose_gold_ingot
gen_model_jsons.py --type=inventory --item_only rose_gold_nugget
gen_model_jsons.py --type=inventory --item_only large_rose_gold_chunk
gen_model_jsons.py --type=inventory --item_only erubescent_gold_ingot
gen_model_jsons.py --type=inventory --item_only erubescent_gold_nugget
gen_model_jsons.py --type=inventory --item_only large_erubescent_gold_chunk
gen_model_jsons.py --type=inventory --item_only scarlatite_gold_ingot
gen_model_jsons.py --type=inventory --item_only scarlatite_gold_nugget 
gen_model_jsons.py --type=inventory --item_only large_scarlatite_gold_chunk
gen_model_jsons.py --type=inventory --item_only hephaestan_gold_ingot
gen_model_jsons.py --type=inventory --item_only hephaestan_gold_nugget
gen_model_jsons.py --type=inventory --item_only large_hephaestan_gold_chunk

# tools
gen_model_jsons.py --type=tool --item_only rose_gold_sword
gen_model_jsons.py --type=tool --item_only rose_gold_shovel
gen_model_jsons.py --type=tool --item_only rose_gold_axe 
gen_model_jsons.py --type=tool --item_only rose_gold_pickaxe
gen_model_jsons.py --type=tool --item_only rose_gold_hoe

gen_model_jsons.py --type=tool --item_only erubescent_gold_sword
gen_model_jsons.py --type=tool --item_only erubescent_gold_shovel
gen_model_jsons.py --type=tool --item_only erubescent_gold_axe
gen_model_jsons.py --type=tool --item_only erubescent_gold_pickaxe

gen_model_jsons.py --type=tool --item_only scarlatite_gold_shovel 
gen_model_jsons.py --type=tool --item_only scarlatite_gold_axe
gen_model_jsons.py --type=tool --item_only scarlatite_gold_pickaxe

gen_model_jsons.py --type=tool --item_only hephaestan_gold_sword
gen_model_jsons.py --type=tool --item_only hephaestan_gold_shovel
gen_model_jsons.py --type=tool --item_only hephaestan_gold_axe
gen_model_jsons.py --type=tool --item_only hephaestan_gold_pickaxe

# armor sets
gen_model_jsons.py --type=armor --item_only rose_gold_helmet
gen_model_jsons.py --type=armor --item_only rose_gold_chestplate
gen_model_jsons.py --type=armor --item_only rose_gold_leggings
gen_model_jsons.py --type=armor --item_only rose_gold_boots

