import React from 'react';

export default function NewTab() {
    const openNewTab = () => {
        window.open('', '_blank');
    };

    return (
        <div>
            <button onClick={openNewTab}>
                Open New Tab
            </button>
        </div>
    );
}