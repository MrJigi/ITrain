"use client";
import React, { useState } from "react";
import { Drawer, List, ListItem, ListItemText, IconButton } from "@mui/material";
import MenuIcon from "@mui/icons-material/Menu";
import Link from "next/link"; // Import Link from next/link for navigation

export default function DrawerClient() {
    const [isDrawerOpen, setIsDrawerOpen] = useState(false);

    // Function to toggle the drawer open and close
    const toggleDrawer = () => {
        setIsDrawerOpen(!isDrawerOpen);
    };

    return (
        <>
            {/* Menu icon to open/close the drawer */}
            <IconButton
                edge="start"
                color="inherit"
                aria-label="menu"
                onClick={toggleDrawer}
                style={{ position: "fixed", top: "12px", left: "12px", zIndex: 1100 }}
            >
                <MenuIcon />
            </IconButton>

            {/* Drawer component */}
            <Drawer anchor="left" open={isDrawerOpen} onClose={toggleDrawer}>
                <div style={{ width: "250px" }} role="presentation" onClick={toggleDrawer}>
                    <List>
                        {/* Define the pages as navigable links */}
                        <ListItem>
                            <Link href="/mapPage2" passHref>
                                <ListItemText primary="Home" />
                            </Link>
                        </ListItem>
                        <ListItem>
                            <Link href="/options" passHref>
                                <ListItemText primary="Options" />
                            </Link>
                        </ListItem>
                    </List>
                </div>
            </Drawer>
        </>
    );
}
